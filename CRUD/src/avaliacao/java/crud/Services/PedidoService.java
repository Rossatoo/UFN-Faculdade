package crud.Services;

import crud.Exception.ResourceNotFoundException;
import crud.Repository.PedidoRepository;
import crud.model.Pedido;
import crud.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {this.pedidoRepository = pedidoRepository;}

    public Pedido createPedido(Pedido pedido){ return pedidoRepository.save(pedido);}

    public List<Pedido> findAllPedidos() {return pedidoRepository.findAll();}

    public Optional<Pedido> findPedidoById(int id) { return pedidoRepository.findById(id);}

    public Pedido updatePedido(int id, Pedido pedidoDetails){
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pedido nao encontrado com o id: " + id));
        pedido.setDataPedido(pedidoDetails.getDataPedido());
        pedido.setDataEntrega(pedidoDetails.getDataEntrega());
        pedido.setQuantidade(pedidoDetails.getQuantidade());
        pedido.setValorTotal(pedidoDetails.getValorTotal());
        pedido.setInstrucaoEntrega(pedidoDetails.getInstrucaoEntrega());
        pedido.setStatus(pedidoDetails.getStatus());
        return pedidoRepository.save(pedido);
    }

    public void deletePedido(int id){
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pedido nao encontrado com o id: " + id));
        pedidoRepository.delete(pedido);
    }
}

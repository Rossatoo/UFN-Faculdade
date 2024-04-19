package crud.Services;

import crud.Exception.ResourceNotFoundException;
import crud.model.Cliente;
import crud.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crud.Repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {this.clienteRepository = clienteRepository;}

    public Cliente createCliente(Cliente cliente){ return clienteRepository.save(cliente);}

    public List<Cliente> findAllClientes() {return clienteRepository.findAll();}

    public Optional<Cliente> findClienteById(int id) { return clienteRepository.findById(id);}

    public Cliente updateCliente(int id, Cliente clienteDetails){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente nao encontrado com o id: " + id));
        cliente.setNome(clienteDetails.getNome());
        cliente.setEmail(clienteDetails.getEmail());
        cliente.setTelefone(clienteDetails.getTelefone());
        cliente.setEndereco(clienteDetails.getEndereco());
        cliente.setFormaPagamento(clienteDetails.getFormaPagamento());
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(int id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto nao encontrado com o id: " + id));
        clienteRepository.delete(cliente);
    }

}

package crud.Controller;

import crud.Services.PedidoService;
import crud.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) { this.pedidoService = pedidoService;}

    @PostMapping
    public ResponseEntity<Pedido> createPedido(@RequestBody Pedido pedido){
        Pedido newPedido = pedidoService.createPedido(pedido);
        return ResponseEntity.ok(newPedido);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> getAllPedidos(){
        List<Pedido> pedidos = pedidoService.findAllPedidos();
        return ResponseEntity.ok(pedidos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedidos(@PathVariable int id, @RequestBody Pedido pedidoDetails){
        Pedido updatedPedido = pedidoService.updatePedido(id, pedidoDetails);
        return ResponseEntity.ok(updatedPedido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable int id){
        pedidoService.deletePedido(id);
        return ResponseEntity.ok().build();
    }

}

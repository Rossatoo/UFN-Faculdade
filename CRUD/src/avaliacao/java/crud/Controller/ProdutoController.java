package crud.Controller;

import crud.model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import crud.Services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) { this.produtoService = produtoService;}

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto){
        Produto newProduto = produtoService.createProduto(produto);
        return ResponseEntity.ok(newProduto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllProdutos(){
        List<Produto> produtos = produtoService.findAllUsers();
        return ResponseEntity.ok(produtos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable int id, @RequestBody Produto produtoDetails){
        Produto updatedProduto = produtoService.updateProduto(id, produtoDetails);
        return ResponseEntity.ok(updatedProduto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable int id){
        produtoService.deleteProduto(id);
        return ResponseEntity.ok().build();
    }

}

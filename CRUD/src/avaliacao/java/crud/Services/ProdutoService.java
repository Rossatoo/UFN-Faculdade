package crud.Services;

import crud.Exception.ResourceNotFoundException;
import crud.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crud.Repository.ProdutoRepository;
import java.util.*;


import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {this.produtoRepository = produtoRepository;}

    public Produto createProduto(Produto produto) { return produtoRepository.save(produto);}

    public List<Produto> findAllProdutos() { return produtoRepository.findAll();}

    public Optional<Produto> findProdutoById(int id){
        return produtoRepository.findById(id);
    }

    public Produto updateProduto(int id, Produto produtoDetails){
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto nao encontrado com o id: " + id));
        produto.setNome(produtoDetails.getNome());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPreco(produtoDetails.getPreco());
        produto.setCategoria(produtoDetails.getCategoria());
        produto.setDisponivel(produtoDetails.isDisponivel());
        return produtoRepository.save(produto);
    }

    public void deleteProduto(int id){
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto nao encontrado com o id: " + id));
        produtoRepository.delete(produto);
    }

}

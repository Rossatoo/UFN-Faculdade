package crud.Services;

import crud.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crud.Repository.produtoRepository;

import java.util.List;

@Service
public class produtoService {

    private final produtoRepository produtoRepository;

    @Autowired
    public produtoService(produtoRepository produtoRepository) {this.produtoRepository = produtoRepository;}

    public Produto createProduto(Produto produto) { return produtoRepository.save(produto);}

    public List<Produto> findAllUsers() { return produtoRepository.findAll();}


}

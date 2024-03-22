package com.aula1.crud.Controller;


import com.aula1.crud.Model.Pessoa;
import com.aula1.crud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //Significa que essa classe é uma controller
@RequestMapping(path = "/pessoa") //Este mapping é gerenciado por essa classe

public class PessoaController {

    @Autowired //instancia a classe/interface PessoaRepository
    private PessoaRepository repository;

    @GetMapping
    public @ResponseBody List<Pessoa> listarPessoa(){
        //SELECT * FROM pessoa

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarPessoa(@RequestBody Pessoa pessoa) {
        //INSERT no banco de dados
        repository.save(pessoa);
        return "saved";
    }


}

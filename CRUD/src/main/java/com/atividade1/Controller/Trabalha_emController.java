package com.atividade1.Controller;

import com.atividade1.Model.TrabalhaEm;
import com.atividade1.Repository.TrabalhaEmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class Trabalha_emController {

    @Autowired
    private TrabalhaEmRepository repository;

    @GetMapping
    public @ResponseBody List<TrabalhaEm> listarTrabalha_em (){
        //SELECT * FROM trabalha_em

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarTrabalha_Em(@RequestBody TrabalhaEm trabalhaEm){
        //INSERT no banco de dados

        repository.save(trabalhaEm);
        return "saved";
    }
}

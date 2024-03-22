package com.atividade1.Controller;

import com.atividade1.Model.Dependente;
import com.atividade1.Repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class DependenteController {

    @Autowired
    private DependenteRepository repository;

    @GetMapping
    public @ResponseBody List<Dependente> listarDependente(){
        //SELECT * FROM dependente

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarDependente(@RequestBody Dependente dependente){
        //INSERT no banco de dados

        repository.save(dependente);
        return "saved";
    }
}

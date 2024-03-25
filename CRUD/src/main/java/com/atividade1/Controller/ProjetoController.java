package com.atividade1.Controller;

import com.atividade1.Model.Projeto;
import com.atividade1.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;

    @GetMapping
    public @ResponseBody List<Projeto> listarProjetos(){
        //SELECT * FROM projetos

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarProjeto(@RequestBody Projeto projeto) {
        //INSERIR no banco de dados

        repository.save(projeto);
        return "saved";
    }
}

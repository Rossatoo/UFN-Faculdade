package com.atividade1.Controller;

import com.atividade1.Model.Funcionario;
import com.atividade1.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public @ResponseBody List<Funcionario> listarFuncionario(){
        //SELECT * FROM funcionario

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarDependente(@RequestBody Funcionario funcionario){
        //INSERT no banco de dados

        repository.save(funcionario);
        return "saved";
    }
}

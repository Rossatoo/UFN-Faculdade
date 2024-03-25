package com.atividade1.Controller;

import com.atividade1.Model.Departamento;
import com.atividade1.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class DepartamentoController {

    @Autowired
    private DepartamentoRepository repository;

    @GetMapping
    public @ResponseBody List<Departamento> listarDepartamento(){
        //SELECT * FROM departamento

        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody String salvarDepartamento(@RequestBody Departamento departamento){
        //INSERT no banco de dados

        repository.save(departamento);
        return "saved";
    }


}

package com.atividade1.Controller;

import com.atividade1.Model.Departamento;
import com.atividade1.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository repository;

    @GetMapping("/listar")
    public @ResponseBody List<Departamento> listarDepartamento(){
        //SELECT * FROM departamento

        return repository.findAll();
    }

    @PostMapping("/inserir")
    public @ResponseBody String salvarDepartamento(@RequestBody Departamento departamento){
        //INSERT no banco de dados

        repository.save(departamento);
        return "saved";
    }


}

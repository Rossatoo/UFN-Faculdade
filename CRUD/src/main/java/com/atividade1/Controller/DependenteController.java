package com.atividade1.Controller;

import com.atividade1.Model.Dependente;
import com.atividade1.Repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/dependentes")
public class DependenteController {

    @Autowired
    private DependenteRepository repository;

    @GetMapping("/listar")
    public @ResponseBody List<Dependente> listarDependente(){
        //SELECT * FROM dependente

        return repository.findAll();
    }

    @PostMapping("/inserir")
    public @ResponseBody String salvarDependente(@RequestBody Dependente dependente){
        //INSERT no banco de dados

        repository.save(dependente);
        return "saved";
    }
}

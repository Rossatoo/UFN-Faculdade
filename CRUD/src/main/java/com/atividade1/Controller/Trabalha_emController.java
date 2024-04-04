package com.atividade1.Controller;

import com.atividade1.Model.TrabalhaEm;
import com.atividade1.Repository.TrabalhaEmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/trabalhaEM")
public class Trabalha_emController {

    @Autowired
    private TrabalhaEmRepository repository;

    @GetMapping("/listar")
    public @ResponseBody List<TrabalhaEm> listarTrabalha_em (){
        //SELECT * FROM trabalha_em

        return repository.findAll();
    }

    @PostMapping("/inserir")
    public @ResponseBody String salvarTrabalha_Em(@RequestBody TrabalhaEm trabalhaEm){
        //INSERT no banco de dados

        repository.save(trabalhaEm);
        return "saved";
    }
}

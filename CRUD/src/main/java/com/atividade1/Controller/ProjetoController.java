package com.atividade1.Controller;

import com.atividade1.Model.Projeto;
import com.atividade1.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;

    @GetMapping("/listar")
    public @ResponseBody List<Projeto> listarProjetos(){
        //SELECT * FROM projetos

        return repository.findAll();
    }

    @PostMapping("/inserir")
    public @ResponseBody String salvarProjeto(@RequestBody Projeto projeto) {
        //INSERIR no banco de dados

        repository.save(projeto);
        return "saved";
    }
}

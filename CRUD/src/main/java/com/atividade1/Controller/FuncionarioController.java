package com.atividade1.Controller;

import com.atividade1.Model.Funcionario;
import com.atividade1.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping("/listar")
    public @ResponseBody List<Funcionario> listarFuncionario(){
        //SELECT * FROM funcionario

        return repository.findAll();
    }

    @PostMapping("/inserir")
    public @ResponseBody String salvarDependente(@RequestBody Funcionario funcionario){
        //INSERT no banco de dados
        repository.save(funcionario);
        return "saved";
    }
}

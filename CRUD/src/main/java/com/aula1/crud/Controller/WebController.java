package com.aula1.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
    @GetMapping("/cadastro")
    public String redirecionarCadastro(){

        return "cadastro";

    }

    @GetMapping("/listar")
    public String redirecionarListar(){

        return "listar";

    }

    @GetMapping("/alteracao")
    public String redirecionarAlteracao(){

        return "alteracao";

    }


}

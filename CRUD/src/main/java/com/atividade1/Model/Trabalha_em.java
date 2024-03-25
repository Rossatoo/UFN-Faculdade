package com.atividade1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Trabalha_em {

    @EmbeddedId
    private TrabalhaEmKey Id;


    @ManyToOne
    private Funcionario funcionarioCPF;


    @ManyToOne
    @MapsId("numeroProjeto")
    @JoinColumn(name = "pnr")
    private Projeto numeroProjeto;

    private String horas;
}

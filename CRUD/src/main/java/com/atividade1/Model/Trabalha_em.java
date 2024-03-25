package com.atividade1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Trabalha_em {

    @Id
    @ManyToOne
    @JoinColumn(name = "Fcpf")
    private Funcionario funcionarioCPF;

    @Id
    @ManyToOne
    @JoinColumn(name = "pnr")
    private Projeto numeroProjeto;

    private String horas;
}

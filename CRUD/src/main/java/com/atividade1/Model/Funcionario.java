package com.atividade1.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Funcionario {

    @Id
    private Integer Cpf;
    @Embedded
    private Nome nome;

    private Date dataNasc;

    private Float Salario;

    private String Sexo;

    private  String Endereco;

    @ManyToOne
    @JoinColumn(name = "Cpf_supervisor")
    private Funcionario supervisor;

    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Funcionario> supervisionados;

    @OneToMany(mappedBy = "funcionarioParente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dependente> dependente;

    @ManyToOne
    private Departamento departamento;

    @OneToOne
    private Departamento numDepartamento;

    @OneToMany(mappedBy = "funcionarioCPF")
    private List<Trabalha_em> trabalhaEM;
}

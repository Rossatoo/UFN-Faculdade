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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 11)
    private String cpf;
    @Embedded
    private Nome nome;

    private Date dataNasc;

    private Float salario;

    private String sexo;

    private  String endereco;

    @ManyToOne
    @JoinColumn(name = "Cpf_Supervisor")
    private Funcionario supervisor;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dependente> dependentes;

    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Funcionario> supervisionados;

    @OneToMany(mappedBy = "funcionario")
    private List<TrabalhaEm> trabalhaEM;

    @ManyToOne
    @JoinColumn(name = "Dnr")
    private Departamento departamento;

    @OneToOne(mappedBy = "gerente")
    private Departamento departamentoGerente;


}

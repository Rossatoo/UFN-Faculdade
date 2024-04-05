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

    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Funcionario> supervisionados;

    @OneToMany(mappedBy = "funcionarioParente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dependente> dependente;

    @ManyToOne
    @JoinColumn(name = "Dnr")
    private Departamento departamento;

    @OneToOne(mappedBy = "gerente")
    private Departamento dptGerenciado;


    @OneToMany(mappedBy = "funcionarioCPF", cascade = CascadeType.ALL)
    private List<TrabalhaEm> trabalhaEm;





}

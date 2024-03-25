package com.atividade1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Departamento {

    @Id
    @Column(name = "Dnumero")
    private Integer departamentoNum;

    @Column(name = "Dnome")
    private String departamentoNome;

    @Column(name = "Data_inicio_gerente")
    protected Date dataInicioGerente;

    @ElementCollection
    private List<String> localizacoes;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionario;

    @OneToOne(mappedBy = "numDepartamento")
    private Funcionario gerente;

    @OneToMany(mappedBy = "departamento")
    private List<Projeto> projetos;
}

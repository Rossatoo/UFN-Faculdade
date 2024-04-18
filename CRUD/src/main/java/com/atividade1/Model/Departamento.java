package com.atividade1.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @CollectionTable(
            name = "LOCALIZACAO_DEP",
            joinColumns = @JoinColumn(name = "Dnumero")
    )
    @Column(name = "Dlocal")
    private List<String> localizacoes;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Funcionario> listaFuncionarios;

    @OneToOne
    @JoinColumn(name = "idGerente")
    private Funcionario gerente;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Projeto> projetos;
}

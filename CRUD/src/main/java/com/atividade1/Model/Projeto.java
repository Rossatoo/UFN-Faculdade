package com.atividade1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Projeto {

    @Id
    @Column(name = "Pnumero")
    private Integer projetoNumero;

    @Column(name = "Projnome")
    private String projetoNome;

    @Column(name = "Projlocal")
    private String projetoLocal;

    @ManyToOne
    @JoinColumn(name = "Dnum")
    private Departamento departamento;

    @OneToMany(mappedBy = "numeroProjeto")
    private List<TrabalhaEm> trabalhaEm;
}

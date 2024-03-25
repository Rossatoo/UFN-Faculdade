package com.atividade1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;

import java.io.Serializable;
@Embeddable
public class DependenteKey implements Serializable {

    @Column(name = "Nome_dependente")
    private String nome;
    @Column (name = "Fcpf")
    private Integer funcionarioParente;
}

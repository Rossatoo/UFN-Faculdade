package com.atividade1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TrabalhaEmKey {

    @Column(name = "fcpf")
    private String FuncCPF;
    @Column (name = "pnr")
    private Integer numeroProjeto;
}

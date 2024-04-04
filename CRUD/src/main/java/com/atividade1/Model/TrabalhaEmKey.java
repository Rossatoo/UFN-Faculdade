package com.atividade1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TrabalhaEmKey {

    @Column(name = "Fcpf")
    private String funcionarioId;
    @Column (name = "Pnr")
    private Integer projetoId;
}

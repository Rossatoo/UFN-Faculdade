package com.atividade1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Embeddable
@Setter
@Getter
@RequiredArgsConstructor
public class TrabalhaEmKey {

    @Column(name = "Fcpf")
    private String funcionarioId;
    @Column (name = "Pnr")
    private Integer projetoId;
}

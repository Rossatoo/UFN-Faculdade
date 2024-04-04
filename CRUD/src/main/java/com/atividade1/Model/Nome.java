package com.atividade1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Embeddable
public class Nome implements Serializable {

    @Column(name = "Pnome")
    private String nomeInicial;

    @Column(name = "Minicial", length = 1)
    private String nomeMeio;

    @Column(name = "Unome")
    private String nomeFinal;
}

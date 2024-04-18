package com.atividade1.Model;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;

@Embeddable
@Setter
@Getter
public class Nome implements Serializable {

    @Column(name = "Pnome")
    private String nomeInicial;

    @Column(name = "Minicial", length = 1)
    private String nomeMeio;

    @Column(name = "Unome")
    private String nomeFinal;
}

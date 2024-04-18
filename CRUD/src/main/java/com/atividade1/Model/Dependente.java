package com.atividade1.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
public class Dependente {

    @EmbeddedId
    private DependenteKey dependenteId;
    private String sexo;

    private Date dataNasc;

    private String Parentesco;

    @ManyToOne
    @MapsId("funcionarioCPF")
    @JoinColumn(name = "Fcpf")
    private Funcionario funcionarioParente;

    public Dependente(DependenteKey dependenteId, String sexo, Date dataNasc, String parentesco) {
        this.dependenteId = dependenteId;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        Parentesco = parentesco;
    }
}

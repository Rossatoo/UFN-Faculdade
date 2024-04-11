package com.atividade1.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Entity
public class Dependente {

    @EmbeddedId
    private DependenteKey dependenteId;
    private String sexo;

    private Date dataNasc;

    private String Parentesco;

    @ManyToOne
    @MapsId("funcionarioParente")
    @JoinColumn(name = "Fcpf")
    private Funcionario funcionarioParente;
}

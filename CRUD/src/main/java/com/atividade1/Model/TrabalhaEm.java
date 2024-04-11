package com.atividade1.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TrabalhaEm {

    @EmbeddedId
    private TrabalhaEmKey Id;

    private float horas;

    @ManyToOne
    @MapsId("funcionarioId")
    private Funcionario funcionario;


    @ManyToOne
    @MapsId("projetoId")
    @JoinColumn(name = "Pnr")
    private Projeto numeroProjeto;

}

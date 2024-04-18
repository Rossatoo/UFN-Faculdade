package crud.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String descricao;

    private double preco;

    private String categoria;

    private boolean disponivel;

    @ManyToMany(mappedBy = "produtos")  //Um produto pode estar em varios pedidos
    //@JsonManagedReference
    private List<Pedido> pedidos;


}

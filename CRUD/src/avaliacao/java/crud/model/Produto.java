package crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
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
    private List<Pedido> pedidos;
}

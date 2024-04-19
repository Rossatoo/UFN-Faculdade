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
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nome;

    private String email;

    private String telefone;

    private String endereco;

    private String formaPagamento;


    @OneToMany(mappedBy = "cliente")    //Um cliente pode ter varios pedidos
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "cliente")
    private List<Pagamento> pagamentos;

}

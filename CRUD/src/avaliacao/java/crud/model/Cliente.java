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

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    private String telefone;

    private String endereco;

    private String formaPagamento;

    private String historicoPedido; //talvez fazer uma entidade separado para o historico de pedidos

    @OneToMany(mappedBy = "cliente")    //Um cliente pode ter varios pedidos
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "cliente")
    private List<Pagamento> pagamentos;

}

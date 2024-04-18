package crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne      //Um pedido pertence a um unico cliente
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToMany     // Um pedido pode conter muitos produtos
    @JoinTable(                                                     //usado para especificar a tabela intermediaria ( * - * )
            name = "pedido_produto",                                //nome da tabela intermediaria
            joinColumns = @JoinColumn(name = "pedido_id"),          //coluna da tabela que ira mapear para a tabela Pedido
            inverseJoinColumns = @JoinColumn(name = "produto_id"))  //coluna que ira mapear para a tabela Produto
    private List<Produto> produtos;

    @OneToMany(mappedBy = "pedido")
    private List<Pagamento> pagamentos;

    private LocalDateTime dataPedido;

    private LocalDateTime dataEntrega;

    private int quantidade;

    private double valorTotal;

    private String instrucaoEntrega;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;
}

enum StatusPedido {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDO
}

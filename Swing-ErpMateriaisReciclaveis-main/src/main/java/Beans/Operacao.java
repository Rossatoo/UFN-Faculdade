/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.Date;
import java.util.Objects;

import lombok.*;

/**
 *
 * @author laboratorio
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Operacao {
    private int id_operacao;
    private Produto id_produto;
    private Usuario id_usuario;
    private String tipo_operacao;
    private String motivo;
    private int quantidade;
    private Date data_hora; 
    
    public static class Builder {
        private Integer idOperacao;
        private Produto produto;
        private Usuario usuario;
        private String tipo;
        private String motivo;
        private Integer quantidade;
        private Date dataHora;

        public Builder idOperacao(int id) { this.idOperacao = id; return this;}
        public Builder produto(Produto p) { this.produto = p; return this;}
        public Builder usuario(Usuario u) { this.usuario = u; return this;}
        public Builder tipo(String tipo) { this.tipo = tipo; return this;}
        public Builder motivo(String m) { this.motivo = m; return this;}
        public Builder quantidade(int q) { this.quantidade = q; return this;}
        public Builder dataHora(Date d) { this.dataHora = d; return this;}

        public Operacao build(){
            Objects.requireNonNull(produto);
            Objects.requireNonNull(usuario);
            Objects.requireNonNull(tipo);
            Objects.requireNonNull(quantidade);
            
            Operacao op = new Operacao();
            if(idOperacao != null) op.setId_operacao(idOperacao);
            op.setId_produto(produto);
            op.setId_usuario(usuario);
            op.setTipo_operacao(tipo);
            op.setMotivo(motivo);
            op.setQuantidade(quantidade);
            op.setData_hora(dataHora != null ? dataHora : new Date());
            return op;
        }
    }
}

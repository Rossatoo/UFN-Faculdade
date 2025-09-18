package factory;

import java.util.Date;

import Beans.Operacao;
import Beans.Produto;
import Beans.Usuario;

public abstract class OperacaoFactory {
    public abstract Operacao criar (Produto produto, Usuario usuario, String motivo, int quantidade, Date data);

    protected Operacao base (Produto p, Usuario u, String tipo, String motivo, int qtd, Date data) {
        return new Operacao.Builder()
        .produto(p)
        .usuario(u)
        .tipo(tipo)
        .motivo(motivo)
        .quantidade(qtd)
        .dataHora(data != null ? data : new Date())
        .build();
    }
} 
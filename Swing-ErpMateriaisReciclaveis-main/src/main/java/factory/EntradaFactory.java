package factory;

import java.util.Date;

import Beans.Operacao;
import Beans.Produto;
import Beans.Usuario;

public class EntradaFactory extends OperacaoFactory {
    @Override
    public Operacao criar(Produto produto, Usuario usuario, String motivo, int quantidade, Date data){
        return base(produto, usuario, "Entrada", motivo, quantidade, data);
    }
}

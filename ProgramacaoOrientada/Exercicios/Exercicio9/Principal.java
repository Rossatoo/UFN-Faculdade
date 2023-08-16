package Exercicio9;

public class Principal {

	public static void main(String[] args) {
		AcessoDados d = new BancoDeDados();
		d.conectar();
		d.desconectar();
		d.atualizar();
		d.inserir();
		d.excluir();

	}

}

package Exercicio9;

public class BancoDeDados implements AcessoDados{

	@Override
	public void conectar() {
		System.out.println("Conectando!");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando!!");
		
	}

	@Override
	public void inserir() {
		System.out.println("Inserindo!!");
		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando!!");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo!!");
		
	}
	
	
}

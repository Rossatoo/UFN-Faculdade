package Exercicio8;

public class Livro implements Produto {
	String nome, descricao;
	double preco;
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public double getPreco() {
		
		return preco;
	}
	@Override
	public String getDescricao() {	
		return descricao;
	}
	
	
}

package serial;

import java.io.Serializable;

public class Produto implements Serializable {
	private String codigo;
	private String nome;
	private double preco;
	private transient String temporario;
	
	public Produto(String codigo, String nome, double preco, String temporario) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.temporario = temporario;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getTemporario() {
		return temporario;
	}
	
	public String toString() {
		return "Produto [codigo = " + codigo + ", nome = " + nome + ", preco = " + preco + "]";
	}
	
}

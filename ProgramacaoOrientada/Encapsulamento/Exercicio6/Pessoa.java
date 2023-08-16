package Exercicio6;

public class Pessoa {
	private String nome;
	private int idade, cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public boolean ehMaiorDeIdade() {
		if(this.idade >= 18) {
		return true;
		}
		else return false;
	}
}

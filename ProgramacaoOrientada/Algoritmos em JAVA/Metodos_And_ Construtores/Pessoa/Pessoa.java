package Pessoa;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nomeP, int idadeP) {
		nome = nomeP;
		idade = idadeP;
		System.out.println("Nome: "+nome+ " Idade: "+idade);
	}
	
	public Pessoa(int idadeP) {
		idade = idadeP;
		System.out.println("Idade: "+idade);
	}
}	

	
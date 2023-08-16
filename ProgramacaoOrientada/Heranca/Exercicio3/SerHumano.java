package Exercicio3;

public class SerHumano extends Animal{
	protected String nome;
	protected int idade;
	
	public SerHumano(String nome, int idade, String tipo) {
		super(tipo);
		this.nome = nome;
		this.idade = idade;
	}
	
	public void falar() {
		System.out.println("Nem todos falam");
	}
}

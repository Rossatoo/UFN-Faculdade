package Exemplos;

public class Gato implements Animal{
	String nome;
	int idade;
	
	public void emitirSom() {
		System.out.println("Miaaaaaaaaaaaaaaaaaaaau");
	}
	
	public void exibeDados(){
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
}

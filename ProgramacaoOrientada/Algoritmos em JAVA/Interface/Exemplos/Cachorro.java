package Exemplos;

public class Cachorro implements Animal{
	String nome;
	int idade;
	
	public void emitirSom() {
		System.out.println("AUUUUUUUUUUUUUUUUUUUUUUUUUU");
	}
	
	public void cuidarPatio() {
		System.out.println("Cuidando!!");
	}
	
	public void exibeDados(){
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
}

package Exercicio5;

public class Pessoa {
	
	public void falar(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void falar(String mensagem, int repeticao) {
		for(int i = 0; i < repeticao; i++) {
			System.out.println(mensagem);
		}
	}
}

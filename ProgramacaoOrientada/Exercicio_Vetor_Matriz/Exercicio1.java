package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];

		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = sc.nextLine();
		}
		
		for(int i = 0; i <= nomes.length; i++) {
			System.out.println("Nome na posicao " +i+ ": " + nomes[i]);
		}
	}

}
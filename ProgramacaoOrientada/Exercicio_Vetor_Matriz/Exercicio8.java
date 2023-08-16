package pacote;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int contPar = 0, contImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor para o elemento: " + i);
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0)
				contPar++;
			else
				contImpar++;
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println("\n\n\n" + contPar + "Pares");
		System.out.println(contImpar + "Impar");

	}

}

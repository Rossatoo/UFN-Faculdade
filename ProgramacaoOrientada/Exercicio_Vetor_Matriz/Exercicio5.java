package pacote;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior = vetor[0], menor=99999;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posicao: " + i);
			vetor[i] = sc.nextInt();
			
			if(vetor[i] > maior)
				maior = vetor[i];
			
			if(vetor[i] < menor)
				menor = vetor[i];
		}
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println("\nMaior valor do vetor: " + maior );
		System.out.println("Menor valor do vetor: " + menor);

	}

}

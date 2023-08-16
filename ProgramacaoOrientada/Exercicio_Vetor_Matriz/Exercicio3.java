package pacote;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float soma=0, media;
		
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[5];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + i + ":");
			notas[i] = sc.nextFloat();
			
			soma = soma + notas[i];
		}
		
		media = soma / notas.length;
		System.out.println("A media eh : " + media);
	}
}


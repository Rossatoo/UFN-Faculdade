package pacote;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		 Faça um algoritmo para ler um número e verificar se ele é par ou ímpar
		
		double num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = teclado.nextDouble();
		
		if(num%2==0)
			System.out.println("O numero é par");
		else
			System.out.println("O numero é impar");
	}

}

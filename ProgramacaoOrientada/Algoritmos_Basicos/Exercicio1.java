package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para leitura de dois números e após faça as quatro operações
		 * matemáticas (Soma, Subtração, Multiplicação e divisão)
		 */
		double num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero: ");
		num1 = teclado.nextDouble();
		System.out.println("digite outro numero: ");
		num2 = teclado.nextDouble();
		
		System.out.println("A soma dos numeros eh: " +(num1 + num2));
		System.out.println("A subtração dos numeros eh: " +(num1 - num2));
		System.out.println("A multiplicação dos numeros eh: " +(num1 * num2));
		System.out.println("A divisao dos numeros eh: " +(num1/num2));

	}

}

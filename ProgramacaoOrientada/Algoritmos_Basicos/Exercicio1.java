package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa para leitura de dois n�meros e ap�s fa�a as quatro opera��es
		 * matem�ticas (Soma, Subtra��o, Multiplica��o e divis�o)
		 */
		double num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero: ");
		num1 = teclado.nextDouble();
		System.out.println("digite outro numero: ");
		num2 = teclado.nextDouble();
		
		System.out.println("A soma dos numeros eh: " +(num1 + num2));
		System.out.println("A subtra��o dos numeros eh: " +(num1 - num2));
		System.out.println("A multiplica��o dos numeros eh: " +(num1 * num2));
		System.out.println("A divisao dos numeros eh: " +(num1/num2));

	}

}

package pacote;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		 Fa�a um algoritmo para ler um n�mero e verificar se ele � par ou �mpar
		
		double num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = teclado.nextDouble();
		
		if(num%2==0)
			System.out.println("O numero � par");
		else
			System.out.println("O numero � impar");
	}

}

package pacote;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0)
			System.out.println("Os numero sao multiplos");
		
		else
			System.out.println("Os numeros nao sao multiplos");

	}

}

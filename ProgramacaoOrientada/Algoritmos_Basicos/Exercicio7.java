package pacote;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primerio valor: ");
		num1 = teclado.nextInt();	
		
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = teclado.nextInt();
		
		if(num1 < num2 && num2 < num3) 
			System.out.println("Valores em ordem crescente: " + num1 + num2 + num3);
			
		else if(num1 < num3 && num3 < num2)
			System.out.println("Valores em ordem crescente: " + num1 + num3 + num2);
		
		else if(num2 < num1 && num1 < num3)
			System.out.println("Valores em ordem crescente: " + num2 + num1 + num3);
		
		else if(num2 < num3 && num3 < num1)
			System.out.println("Valores em ordem crescente: " + num2 + num3 + num1);
		
		else if(num3 < num1 && num1 < num2)
			System.out.println("Valores em ordem crescente: " + num3 + num1 + num2);
		
		else if(num3 < num2 && num2 < num1)
			System.out.println("Valores em ordem crescente: " + num3 + num2 + num1);
		
	}

}

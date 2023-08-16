package pacote;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int num1, num2, num3, maior;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primerio valor: ");
		num1 = teclado.nextInt();	
		
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = teclado.nextInt();
		
		maior = num1;
		
		if(num2 > maior) 
			maior = num2;
		
		if(num3 > maior) 
			maior = num3;
		
		System.out.println("O maior valor eh: " + maior);
		
		
	}
}
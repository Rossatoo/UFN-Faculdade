package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcao;
		
		realizaConta c = new realizaConta();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero: ");
		c.a = teclado.nextDouble();
		System.out.println("digite outro numero: ");
		c.b = teclado.nextDouble();
		
		do {
			System.out.println("Escolha a opera��o desejada: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			System.out.println("5 - Sair");
			System.out.println("Opcao desejada: ");
			opcao = teclado.nextInt();
		
			switch (opcao) {
			
			case 1:
				System.out.println("A soma dos numeros eh: " +c.somar());
				System.out.println("---------------------------------------\n");
			break;
		
			case 2:
				System.out.println("A subtra��o dos numeros eh: " +c.subtrair());
				System.out.println("---------------------------------------\n");
			break;
			
			case 3:
				System.out.println("A multiplica��o dos numeros eh: " +c.multiplicar());
				System.out.println("---------------------------------------\n");
			break;
			
			case 4:	
				System.out.println("A divisao dos numeros eh: " +c.dividir());	
				System.out.println("---------------------------------------\n");
			break;
			
			case 5:
				System.out.println("Tchaaaaaau!!!!");
			break;
			
			default: 
				System.out.println("Opcao invalida!");
			break;
			}
		
		} while(opcao !=5);	
		
		
	}

}

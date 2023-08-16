package TryCatch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		try {
			double num1, num2;
			int opcao;
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("digite um numero: ");
			num1 = teclado.nextDouble();
			System.out.println("digite outro numero: ");
			num2 = teclado.nextDouble();
			
			do {
				System.out.println("Escolha a operação desejada: ");
				System.out.println("1 - Soma");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicacao");
				System.out.println("4 - Divisao");
				System.out.println("5 - Sair");
				System.out.println("Opcao desejada: ");
				opcao = teclado.nextInt();
			
				switch (opcao) {
				
				case 1:
					System.out.println("A soma dos numeros eh: " +(num1 + num2));
					System.out.println("---------------------------------------\n");
				break;
			
				case 2:
					System.out.println("A subtração dos numeros eh: " +(num1 - num2));
					System.out.println("---------------------------------------\n");
				break;
				
				case 3:
					System.out.println("A multiplicação dos numeros eh: " +(num1 * num2));
					System.out.println("---------------------------------------\n");
				break;
				
				case 4:	
					System.out.println("A divisao dos numeros eh: " +(num1/num2));	
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
			
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}
}
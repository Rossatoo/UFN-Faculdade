package Pessoa;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("1 = Passar nome e idade");
			System.out.println("2 - Passar somente idade");
			System.out.println("3 - Sair");
			System.out.println("Opcao desejada: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				Pessoa p = new Pessoa("Matheus", 20);
				
				break;
			
			
			case 2:
				Pessoa p2 = new Pessoa(20);
				break;
			
			case 3:
				System.out.println("Tchaaaaau!");
				break;
				
			default:
				System.out.println("Opcao invalida!!");
				break;
			
				}
			
		

	}

}

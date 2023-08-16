package pacote;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		int fatorial = 1;
		
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		for(int i=1; i<= valor ; i++) {
			fatorial = fatorial * i; 
		}
		System.out.println("O fatorial eh: " +fatorial);
	}

}

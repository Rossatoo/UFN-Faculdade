package pacote;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		float valor, soma=0, cont=0, media;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero diferente de 0: ");
			valor = sc.nextInt();
			
			soma = soma + valor;
			cont++;
			media = soma/(cont - 1);
			
		}while(valor != 0);
		
		System.out.println("A media dos valores lidos eh: " + media);

	}

}

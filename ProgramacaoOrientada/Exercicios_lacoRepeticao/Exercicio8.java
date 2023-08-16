package pacote;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cidade;
		
		do {
			System.out.println("Digite o nome de uma cidade: ");
			cidade = sc.nextLine();
			
		}while(!cidade.equals("sao paulo"));
		
	}

}

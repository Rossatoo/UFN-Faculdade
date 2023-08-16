package TryCatch;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		try {
			String nome;
			double nomeDouble;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com o nome: ");
			nome = sc.nextLine();
			
			nomeDouble = Double.parseDouble(nome);
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}

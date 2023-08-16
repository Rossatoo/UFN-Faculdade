package TryCatch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		try {
			int numero1;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com um numero: ");
			numero1 = sc.nextInt();
			System.out.println("Raiz Quadrada do numero: "+Math.sqrt(numero1));
		} catch (Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}

	}

}

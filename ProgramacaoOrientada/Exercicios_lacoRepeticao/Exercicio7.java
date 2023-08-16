package pacote;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota;
		int cont = 1;

		do {
			System.out.println("Digite a nota do aluno " +cont+ ": ");
			nota = sc.nextFloat();
			cont++;
			
		}while(nota != -1);
	}

}

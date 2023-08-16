package pacote;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		
		if(idade < 16)
			System.out.println("Nao apto a votar");
		
		else if(idade >= 16 && idade < 18 || idade > 70)
			System.out.println("O voto e facultativo");
		
		else 
			System.out.println("Voto obrigatorio");

	}

}

package Exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Entre com o nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Entre com o cpf da pessoa: ");
		pessoa.setCpf(sc.nextInt());
		
		System.out.println("Entre com a idade da pessoa: ");
		pessoa.setIdade(sc.nextInt());
		
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("CPF: "+pessoa.getCpf());
		
		if(pessoa.ehMaiorDeIdade()== true) {
			System.out.println("Eh maior de idade");
		}
		
		else {
			System.out.println("Eh menor de idade");
		}

	}

}

package pessoa;

import java.util.Scanner;

public class Pessoa {
	public String nome;
	public String genero;
	public int idade;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome da pessoa: ");
		p.nome = sc.nextLine();
		System.out.println("Digite o genero da pessoa: ");
		p.genero = sc.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		p.idade = sc.nextInt();
		
		System.out.println("Nome: " + p.nome + " Genero: " +p.genero+ " Idade: " +p.idade);
		

	}

}

package livro;

import java.util.Scanner;

public class Livro {
	public String titulo;
	public String autor;
	public int anoPublic;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Livro liv = new Livro();
		System.out.println("Digite o titulo do livro: ");
		liv.titulo = sc.nextLine();
		System.out.println("Digite o nome do autor do livro: ");
		liv.autor = sc.nextLine();
		System.out.println("Digite o ano de publicacao do livro: ");
		liv.anoPublic = sc.nextInt();
		
		System.out.println("Livro: " + liv.titulo+ " Autor: " +liv.autor+ " Ano de Publicacao: " + liv.anoPublic);
	}

}

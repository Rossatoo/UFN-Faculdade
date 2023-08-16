package projeto;

import java.util.Scanner;

public class SobrescritaExemplo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.fazerSom();
		
		animal = new Cachorro();
		animal.fazerSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		Animal a;
		System.out.println("Digite 1 para ser um cachorro, 2 para um animal generico, 3 para ser um peixe");
		op = sc.nextInt();
		
		if(op == 1) {
			a = new Cachorro();
			a.fazerSom();
		}
		
		if(op == 2) {
			a = new Animal();
			a.fazerSom();
		}
		
		if(op == 3) {
			a = new Peixe();
			a.fazerSom();
		}

	}

}

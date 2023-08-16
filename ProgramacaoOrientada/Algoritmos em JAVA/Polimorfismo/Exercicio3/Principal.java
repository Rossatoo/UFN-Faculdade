package Exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Entre com o preco do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println(+preco);
		p = new ProdutoComDesconto();
		
		
		System.out.println("Preco com desconto: "+p.desconto(preco));
	}

}

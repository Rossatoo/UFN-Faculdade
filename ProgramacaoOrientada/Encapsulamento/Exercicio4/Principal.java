package Exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Entre com a marca do carro: ");
		carro.setMarca(sc.nextLine());
		
		System.out.println("Entre com o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		
		System.out.println("Entre com o ano do carro: ");
		carro.setAno(sc.nextInt());
		
		carro.exibeDetalhes();

	}

}

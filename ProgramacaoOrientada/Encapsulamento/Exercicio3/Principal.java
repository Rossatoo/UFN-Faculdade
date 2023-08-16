package Exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com o valor da base: ");
		retangulo.setBase(sc.nextDouble());
		
		System.out.println("Entre com o valor da altura: ");
		retangulo.setAltura(sc.nextDouble());
		
		System.out.println("Area do retangulo: "+retangulo.calculaArea());

	}

}

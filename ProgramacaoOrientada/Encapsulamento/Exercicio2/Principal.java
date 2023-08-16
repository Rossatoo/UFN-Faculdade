package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo circulo = new Circulo();
		
		System.out.println("Entre com o valor do raio do circulo: ");
		circulo.setRaio(sc.nextDouble());
		
		System.out.println("Area do circulo: "+circulo.calculaArea());

	}

}

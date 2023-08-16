package Exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com o primeiro lado: ");
		triangulo.setLadoA(sc.nextDouble());
		
		System.out.println("Entre com o segundo lado: ");
		triangulo.setLadoB(sc.nextDouble());
		
		System.out.println("Entre com o terceiro lado: ");
		triangulo.setLadoC(sc.nextDouble());
		
		if(triangulo.ehEquilatero()== true) {
			System.out.println("Eh Equilatero");
		}
		else {
			System.out.println("Nao eh equilatero");
		}

	}

}

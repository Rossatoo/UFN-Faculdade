package carro;

import java.util.Scanner;


public class CarroExec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro car = new Carro();	
		System.out.println("Digite a marca do carro: ");
		car.marca = sc.nextLine();
		System.out.println("Digite o modelo do carro: ");
		car.modelo = sc.nextLine();
		System.out.println("Digite o ano de fabricacao: (dd/mm/aaaa");
		car.anoFabricacao = sc.nextLine();

		Carro car2 = new Carro();
		System.out.println("Digite a marca do segundo carro: ");
		car2.marca = sc.nextLine();
		System.out.println("Digite o modelo do segundo carro: ");
		car2.modelo = sc.nextLine();
		System.out.println("Digite o ano de fabricacao do segundo carro: (dd/mm/aaaa");
		car2.anoFabricacao = sc.nextLine();
		
		System.out.println("CARROS: ");
		System.out.println("Marca: "+car.marca + " - Modelo: " + car.modelo+ " - Ano de Fabricacao: " + car.anoFabricacao);
		System.out.println("Marca: "+car2.marca + " - Modelo: " + car2.modelo+ " - Ano de Fabricacao: " + car2.anoFabricacao);
	}

}

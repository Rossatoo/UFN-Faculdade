package Exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Computador c = new Computador("","Portatil");
		Notebook not = new Notebook("","");
		Netbook net = new Netbook("","");
		
		System.out.println("Insira a marca do notebook: ");
		not.Marca = sc.nextLine();
		
		System.out.println("Insira a marca do netbook: ");
		net.Marca = sc.nextLine();
		
		System.out.println("Notebook - Marca: "+not.exibeMarca(not.Marca)+ "\tModelo: "+c.exibeModelo());
		System.out.println("Netbook - Marca: "+net.exibeMarca(net.Marca)+ "\tModelo: "+c.exibeModelo());
	}

}

package computador;

import java.util.Scanner;

public class ComputadorExec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Computador pc = new Computador();
		System.out.println("Digite a marca do computador: ");
		pc.marca = sc.nextLine();
		System.out.println("Digite o modelo do computador: ");
		pc.modelo = sc.nextLine();
		System.out.println("Digite o tipo do computador: ");
		pc.tipo = sc.nextLine();
		System.out.println("Digite o preço do computador: ");
		pc.preco = sc.nextFloat();
		sc.nextLine();
		
		
		System.out.println("---------COMPUTADORES---------");
		System.out.println("Marca: " + pc.marca + " - Modelo: " + pc.modelo + " - Tipo: " + pc.tipo + " - Preco: " + pc.preco);
		
	}

}

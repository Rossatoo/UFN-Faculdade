package Locadora;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Carro c = new Carro();
		Moto m = new Moto();
		Moto m2 = new Moto();
		String marcaC,modeloC, modeloM1, marcaM1,modeloM2, marcaM2;
		int cilindradas1, cilindradas2;
		
		//Atribuindo valores para o objeto carro
		System.out.println("Entre com a marca do carro: ");
		marcaC = sc.nextLine();
		System.out.println("Entre com o modelo do carro: ");
		modeloC = sc.nextLine();
		c.atribuirValores(marcaC, modeloC);
		
		System.out.println("Entre com a marca da primeira moto: ");
		marcaM1 = sc.nextLine();
		System.out.println("Entre com o modelo da primeira moto: ");
		modeloM1 = sc.nextLine();
		System.out.println("Entre com as cilindradas da primeira moto: ");
		cilindradas1 = sc.nextInt();
		sc.nextLine();
		m.AtribuirValores(marcaM1, modeloM1, cilindradas1);
		
		
		System.out.println("Entre com a marca da segunda moto: ");
		marcaM2 = sc.nextLine();
		System.out.println("Entre com o modelo da segunda moto: ");
		modeloM2 = sc.nextLine();
		System.out.println("Entre com as cilindradas da segunda moto: ");
		cilindradas2 = sc.nextInt();
		sc.nextLine();
		m2.AtribuirValores(marcaM2, modeloM2, cilindradas2);
		
		
		System.out.println("Dados da primeira moto: "+m.retornaMarca()+ " "+m.retornaModelo()+ " "+m.retornaCilindradas());
		System.out.println("Dados do Carro: "+c.exibirMarca()+ " "+c.exibirModelo());
		System.out.println("Dados da segunda moto: "+m2.retornaMarca()+ " "+m2.retornaModelo()+ " "+m2.retornaCilindradas());
		sc.close();
		
	}

}

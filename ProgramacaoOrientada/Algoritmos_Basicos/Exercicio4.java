package pacote;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Escrever um algoritmo para ler quatro valores inteiros, calcular a sua m�dia, e escrever na tela os que s�o 
		//superiores � m�dia.
		
		int num1, num2, num3, num4;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = teclado.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		num4 = teclado.nextInt();
		
		media = (num1 + num2 + num3 + num4)/4;
		
		if(num1>media)
			System.out.println("O primeiro valor � maior que a media");		
		
		if(num2>media)
			System.out.println("O segundo valor � maior que a media");
		
		if(num3>media)
			System.out.println("O terceiro valor � maior que a media");
		
		if(num4>media)
			System.out.println("o quarto valor � maior que a media");
	}

}

package pacote;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int x,y;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de x: ");
		x = teclado.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = teclado.nextInt();
		
		if(x>0 && y>0)
			System.out.println("O ponto esta no primeiro quadrante");
		
		if(x<0 && y>0)
			System.out.println("O ponto esta no segundo quadrante");
		
		if(x<0 && y<0)
			System.out.println("O ponto esta no terceiro quadrante");
		
		if(x>0 && y<0)
			System.out.println("o ponto esta no quarto quadrante");
	}

}

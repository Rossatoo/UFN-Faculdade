package pacote;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Um motorista de taxi deseja calcular o rendimento de seu carro na pra�a.
		 * Sabendo-se que o pre�o do combust�vel � deR$4,90, escreva um algoritmo para
		 * ler a marca��o do od�metro (marcador de quilometragem) no in�cio do dia, a
		 * marca��o no final do dia, o n�mero de litros de combust�vel gasto e o valor
		 * total (R$) recebido dos passageiros.
		 *  Calcule e escreva a m�dia do consumo em Km/l e o lucro l�quido do dia. 
		 *  F�rmulas: Total quilometragem = marca��o od�metro final do dia - marca��o od�metro inicio do dia 
		 *  M�dia do consumo = Total quilometragem/quantidade de combust�vel gasto
		 *  Lucro do dia = Valor total recebido -(quantidade de combust�vel gasto * 4,90)
		 */
		
		double kmInicio, kmFinal, litros, valorRecebido, kmTotal, media, lucro;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a marca��o do odometro do inicio do dia: ");
		kmInicio = teclado.nextDouble();
		
		System.out.println("Digite a marca��o do odometro do final do dia: ");
		kmFinal = teclado.nextDouble();
		
		System.out.println("Digite o numero de litros de combustivel gasto: ");
		litros = teclado.nextDouble();
		
		System.out.println("Digite o valor total de R$ recebido durante o dia: ");
		valorRecebido = teclado.nextDouble();
		
		kmTotal = kmInicio + kmFinal;
		System.out.println("A media de consumo foi: " +(kmTotal/litros));
		System.out.println("Lucro do dia foi: " +(valorRecebido - (litros * 4.90)));
		
		

	}

}

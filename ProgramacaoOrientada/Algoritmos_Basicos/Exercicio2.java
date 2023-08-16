package pacote;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Um motorista de taxi deseja calcular o rendimento de seu carro na praça.
		 * Sabendo-se que o preço do combustível é deR$4,90, escreva um algoritmo para
		 * ler a marcação do odômetro (marcador de quilometragem) no início do dia, a
		 * marcação no final do dia, o número de litros de combustível gasto e o valor
		 * total (R$) recebido dos passageiros.
		 *  Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia. 
		 *  Fórmulas: Total quilometragem = marcação odômetro final do dia - marcação odômetro inicio do dia 
		 *  Média do consumo = Total quilometragem/quantidade de combustível gasto
		 *  Lucro do dia = Valor total recebido -(quantidade de combustível gasto * 4,90)
		 */
		
		double kmInicio, kmFinal, litros, valorRecebido, kmTotal, media, lucro;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a marcação do odometro do inicio do dia: ");
		kmInicio = teclado.nextDouble();
		
		System.out.println("Digite a marcação do odometro do final do dia: ");
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

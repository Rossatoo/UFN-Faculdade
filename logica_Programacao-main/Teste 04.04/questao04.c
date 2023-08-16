/* Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$6,90, escreva um algoritmo para
 ler a marcação do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido 
 dos passageiros. Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.

Fórmulas: Total quilometragem =  marcação odômetro final do dia - marcação odômetro inicio do dia 

Média do consumo = Total quilometragem/ quantidade de combustível gasto

Lucro do dia = Valor total recebido - (quantidade de combustível gasto * 6,90) */ 

#include <stdio.h>

main(){
	float odometroInicio, odometroFinal, combustivelGasto, valorRecebidoPassageiros, totalQuilometragem, mediaConsumo, lucroDia;
	
	printf("Digite a marcacao do odometro no inicio do dia: ");
	scanf("%f", &odometroInicio);
	
	printf("Digite a marcacao do odometro no final do dia: ");
	scanf("%f", &odometroFinal);
	
	printf("Digite o numero de litros de combustivel gasto: ");
	scanf("%f", &combustivelGasto);
	
	printf("Digite o valor total recebido dos passageiros: ");
	scanf("%f", &valorRecebidoPassageiros);
	
	totalQuilometragem = odometroFinal - odometroInicio;
	
	mediaConsumo = totalQuilometragem / combustivelGasto;
	
	lucroDia = valorRecebidoPassageiros - (combustivelGasto * 6.90);
	
	printf("A media de consumo do dia = %f", mediaConsumo);
	printf("\nO lucro liquido do dia = R$%.2f", lucroDia); 
	
	
	getch();
}

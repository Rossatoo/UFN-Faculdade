//Desenvolva um algoritmo para ler as medidas de uma caixa, calcular e mostrar o seu volume.

#include <stdio.h>

main(){
	int valorComprimento, valorAltura, valorLargura, valorVolume;
	
	printf("Entre com o comprimento da caixa: ");
	scanf("%d", &valorComprimento);
	fflush(stdin);
	
	printf("Entre com a altura da caixa: ");
	scanf("%d", &valorAltura);
	fflush(stdin);
	
	printf("Entre com a largura da caixa: ");
	scanf("%d", &valorLargura);
	fflush(stdin);
	
	valorVolume = (valorComprimento * valorAltura * valorLargura);
	
	printf("\nO volume da caixa eh: %d", valorVolume);
	
	getch();
	
	
}

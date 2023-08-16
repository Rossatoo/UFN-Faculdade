//Fazer um algoritmo que leia cem números float e escreva o percentual de números que são maiores que a média dos mesmos.

#include <conio.h>
#include <stdio.h>

main(){
	int i,cont=0;
	float soma=0, media, vetorA[100], percentual;
	
	//Leitura dos valores 
	for(i=0; i<100; i++)
	{
		printf("Digite o valor da posicao %d: ", i);
		scanf("%f", &vetorA[i]);
	}
	
	//Fazendo a soma dos valores do vetor
	for(i=0; i<100; i++)
	{
		soma = soma + vetorA[i];
	}
	
	//Calculando a media dos valores do vetor
	media = soma / 100;
	
	//Verificando quantos numeros sao maiores que a media
	for(i=0; i<100; i++)
	{
		if(vetorA[i] > media){
			cont++;
		}	
	}
	
	/* Logica para calcular a porcentagem
	5 ---- 100%
	2 ----  x
	
	x = (2 * 100) / 5;
	*/
	
	//Calculando a porcentagem de valores que sao maiores que a media
	percentual = (cont * 100) / 100;
	
	
	printf("\n%.2f%% dos numeros sao maiores que a media deles", percentual);
	getch();
}

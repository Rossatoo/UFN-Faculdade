//Faça um programa para leitura de dois números e após faça as quatro operações matemáticas (Soma, Subtração, Multiplicação e divisão)

#include <stdio.h>

main(){
	float n1, n2, soma, subt, mult, div;
	
	printf("Digite o primeiro numero: ");
	scanf("%f", &n1);
	
	printf("Digite o segundo numero: ");
	scanf("%f", &n2);
	
	printf("\nValor do primeiro numero: %f", n1);
	printf("\nValor do segundo numero: %f", n2);
	
	printf("\n\nOperacoes basicas: ");
	
	soma = n1 + n2;
	subt = n1 - n2;
	mult = n1 * n2;
	div = n1 / n2;
	
	printf("\n\nSoma: %f + %f = %f", n1, n2, soma);
	printf("\nSubtracao: %f - %f = %f", n1, n2, subt);
	printf("\nMultiplicacao: %f * %f = %f", n1, n2, mult);
	printf("\nDivisao: %f / %f = %f", n1, n2, div);
	
	
	getch();
}

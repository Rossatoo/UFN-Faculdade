//Faça um algoritmo para calcular e mostrar a área de um triângulo a partir dos valores da base e da altura lidos pelo teclado:

#include <stdio.h>

main(){
	float valorBase, valorAltura, valorArea;
	
	printf("Digite o valor da base do triangulo: ");
	scanf("%f", &valorBase);
	
	printf("Digite o valor da altura do triangulo: ");
	scanf("%f", &valorAltura);
	
	printf("\n\nValor da base: %f", valorBase);
	printf("\nValor da altura: %f", valorAltura);
	
	valorArea = (valorBase * valorAltura)/2;
	
	printf("\n\nO valor da area do triangulo = %f", valorArea);
	
	getch();
}

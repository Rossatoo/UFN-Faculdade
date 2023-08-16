/*Faça um programa que leia um número inteiro n, inteiro e positivo e mostre a seguinte soma: S = 1 + 1/2 + 1/3 + 1/4 + 1/5 .... 1/n*/

#include <conio.h>
#include <stdio.h>

main(){
	int n, i;
	float soma,a;
	
	printf("Digite um numero inteiro e positivo: ");
	scanf("%d", &n);
	
	if(n > 0){
		for(i=1; i<=n; i++){
			a=i;
			soma = soma + 1/a;
			
		}
		printf("A soma eh %.2f", soma);
	}
	
	else {
		printf("Digite um valor inteiro e positivo!!!");
	}

	
	getch();
}

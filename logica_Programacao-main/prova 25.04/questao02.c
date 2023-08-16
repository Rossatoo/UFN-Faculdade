/*Fazer um algoritmo que leia a nota final de um aluno e escreva se ele foi aprovado ou não (considerar nota final maior ou igual a seis para aprovação)*/

#include <stdio.h>
#include <conio.h>

main(){
	float notaFinal;
	
	printf("Digite a nota final do aluno: ");
	scanf("%f", &notaFinal);
	
	if(notaFinal >= 6){
		printf("APROVADO!!");
	}
	else {
		printf("REPROVADO!!");
	}
	
	getch();
} 

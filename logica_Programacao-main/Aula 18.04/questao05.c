/*Escreva um algoritmo para ler a idade de uma pessoa e mostrar qual sua situação de eleitor, conforme as seguintes condições:

· Se a idade for menor que 16 anos, informar que a pessoa não está apta a votar.

· Se a idade for maior ou igual a 16 anos e menor que 18 anos ou superior a 70 anos, informar que o voto é facultativo.

· Caso contrário, informar que o voto é obrigatório.*/

#include <stdio.h>
#include <conio.h>

main(){
	int idade;
	
	printf("Digite a sua idade: ");
	scanf("%d", &idade);
	
		if(idade < 16){
			printf("\nVoce nao esta apto para votar");
		}
	
		else if(idade >= 16 && idade < 18){
			printf("\nO voto eh facultativo");
		}
		else {
			printf("\nO voto eh obrigatorio");
		}
	getch();
}

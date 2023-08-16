/* Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.*/

#include <stdio.h>
#include <conio.h>

main(){
	int n1, n2, n3;
	
	printf("Digite o primeiro numero: ");
	scanf("%d", &n1);
	
	printf("Digite o segundo numero: ");
	scanf("%d", &n2);
	
	printf("Digite o terceiro numero: ");
	scanf("%d", &n3);
	
	if (n1 > n2 && n1 > n3){
		printf("O primeiro numero eh o maior");
	}
	else if(n2 > n1 && n2 > n3){
		printf("O segundo numero eh o maior");
	}
	else {
		printf("O terceiro numero eh o maior");
	}
	
	
	getch();
}

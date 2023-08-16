/* Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.*/

#include <stdio.h>
#include <conio.h>

main(){
	int n1, n2;
	
	printf("Digite o primeiro numero: ");
	scanf("%d", &n1);
	
	printf("Digite o segundo numero: ");
	scanf("%d", &n2);
	
	if (n1 % n2 == 0 || n2 % n1 == 0){
		printf("Os numeros sao multiplos");
	}
	else {
		printf("Os numeros nao sao multiplos");
	}
}

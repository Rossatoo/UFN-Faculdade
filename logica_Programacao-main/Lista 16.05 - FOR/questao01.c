/* Faça um programa que leia um número e apresente a tabuada deste número.*/

#include <stdio.h>
#include <conio.h>

main (){
	int i, num, tabuada;
	 printf("Digite um numero: ");
	 scanf("%d", &num);
	
	for(i=0; i<=10; i++){
		tabuada = num * i;
		printf("%d x %d = %d\n", num, i, tabuada);
	}
	getch();
}

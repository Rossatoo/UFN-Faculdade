#include <conio.h>
#include <stdio.h>
#include <string.h>

main(){
	char palavra[10], inversao[10], aux;;
	
	printf("Digite uma palavra: ");
	gets(palavra);
	
	strcpy(inversao, palavra);
	
	strrev(inversao);
	
	printf("\nPalavra ao contrario: ");
	puts(inversao);
	
	aux = strcmp(palavra, inversao);
	
	if(aux == 0){
		printf("A palavra eh palindroma");
	}
	
	else{
		printf("A palavra nao eh palindroma");
	}
	getch();
}

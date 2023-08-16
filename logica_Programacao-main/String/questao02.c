#include <conio.h>
#include <stdio.h>
#include <string.h>

main(){
	int i;
	char palavra[20], letra;
	
	printf("Digite uma palavra: ");
	gets(palavra);
	printf("Digite uma letra: ");
	scanf("%c", &letra);
	
	for(i=0; i<strlen(palavra); i++){
		if(palavra[i] == letra){
			palavra[i] = '\0';
			puts(palavra);
		}
		
		
	}
	
	getch();
}

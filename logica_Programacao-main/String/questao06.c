#include <conio.h>
#include <stdio.h>
#include <string.h>

main(){
	int i;
	char palavra[20]; 
	
	printf("Digite uma palavra: ");
	gets(palavra);
	
	for(i=0; i<strlen(palavra); i++){
			if(palavra[i] != 'a' && palavra[i] != 'e' && palavra[i] != 'i' && palavra[i] != 'o' && palavra[i] != 'u'){
				palavra[i] = '*';
			}
	}
	
	puts(palavra);
	getch();
}

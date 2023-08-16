#include <conio.h>
#include <stdio.h>
#include <string.h>

main(){
	
	int i, n;
	char palavra[20];
	
	printf("digite uma palavra:");
	gets(palavra);
	
	printf("Digite um numero: ");
	scanf("%d", &n);
		
		for(i=0; i<strlen(palavra); i++){
			if(i == strlen(palavra) - 3){
				palavra[i] = '\0';
			}
			}	 
		
		
	puts(palavra);
    
	getch();
	}
	
	


#include <stdio.h>
#include <conio.h>
#include <string.h>

main(){
	int i, cont=0;
	char palavra[20];
	
	printf("Digite uma palavra: ");
	gets(palavra);
	
	for(i=0; i<strlen(palavra); i++){
		if(palavra[i]== 'a' || palavra[i] == 'e' || palavra[i] == 'i' || palavra[i] == 'o' || palavra[i] == 'u'){
			cont++;
		}
	}
	puts(palavra);
	printf("Tem %d vogais nessa palavra", cont);
	getch();
}

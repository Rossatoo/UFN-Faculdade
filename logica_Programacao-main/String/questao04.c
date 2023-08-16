#include <conio.h>
#include <stdio.h>
#include <string.h>

main () {
	
	int i, v=0;
	char vogais[5], palavra[20];
	
	printf("Digite uma palavra: ");
	gets(palavra);
	
	for(i=0; i<strlen(palavra); i++){
		if(palavra[i] == 'a' || palavra[i] == 'e' || palavra[i] == 'i' || palavra[i] == 'o' || palavra[i] == 'u'){
			vogais[v++] = palavra[i];
		} 
	}	
	
	puts(vogais);
	getch();
}

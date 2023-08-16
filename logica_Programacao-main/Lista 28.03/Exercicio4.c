#include <stdio.h>

main(){
	int idade, mesNiver, mesAtual, anoNasc;
	
	printf("Digite a sua idade: ");
	scanf("%d", &idade);
	
	printf("Digite o numero do mes de seu aniversario: ");
	scanf("%d", &mesNiver);
	
	printf("Digite o numero do mes atual: ");
	scanf("%d", &mesAtual);
	
	if (mesNiver > mesAtual){
	
	anoNasc = 2022 - idade;
	anoNasc = anoNasc - 1;	
	
	}
	
	
	else {
	
	anoNasc = 2022 - idade;
	
	}
	
	
	printf("Voce nasceu em: %d", anoNasc);
	
	
	
	getch();
}

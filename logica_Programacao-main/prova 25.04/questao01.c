/*Fazer uma algoritmo que leia valores para as variáveis hora, minuto e segundo; verificando e escrevendo se elas correspondem a um horário válido ou não.
 Para um horário ser válido, a hora deve estar no intervalo de 0 a 23, o minuto e o segundo no intervalo de 0 a 59.*/
 
 #include <stdio.h>
 #include <conio.h>
 
 main(){
 	int hora, minuto, segundo;
 	
 	printf("Digite a hora: ");
 	scanf("%d", &hora);
 	
 	printf("Digite os minutos: ");
 	scanf("%d", &minuto);
 	
 	printf("Digite os segundos: ");
 	scanf("%d", &segundo);
 	
 	if(hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59){
 		printf("\nHorario valido");
	}
	
	else {
		printf("\nHorario nao valido");
	}
 	getch();
 }

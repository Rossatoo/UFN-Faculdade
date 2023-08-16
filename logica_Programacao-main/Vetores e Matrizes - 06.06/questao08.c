//Escreva um programa que leia uma matriz de ordem 5 (ou seja, 5x5) e verifique se a soma dos elementos da diagonal principal é igual a soma dos elementos da diagonal secundária.

#include <conio.h>
#include <stdio.h>

main(){
	int i, j, matrizA[5][5], soma_diagonalP=0, soma_diagonalS=0;
	
	//Montando a matriz 5 x 5 
	for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		matrizA[i][j] = i + j;
	}
	}
	
	//Mostrando a matriz 
	for(i=0;i<5;i++){
    for(j=0;j<5;j++){
            
		printf("%d |",matrizA[i][j]);
    }
        printf("\n");
    }
    
    //Calculando a soma da diagonal principal da matriz
    for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		if(i==j){
			soma_diagonalP = soma_diagonalP + matrizA[i][j];
		}
	}
	}
	
	//Calculando a soma da diagonal secundaria da matriz
	for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		if(i == 5-1-j){
			soma_diagonalS = soma_diagonalS + matrizA[i][j];
		}
	}
	}
	
	//Mostrando a soma das duas diagonais
	printf("\n\nA soma da diagonal principal eh %d", soma_diagonalP);
	printf("\nA soma da diagonal secundaria eh %d\n\n", soma_diagonalS);
	
	//Verificando se a soma das diagonais sao iguais
	if(soma_diagonalP == soma_diagonalS){
		printf("A soma da diagonal principal eh igual a soma da diagonal secundaria");
	}
	
	else{
		printf("A soma da diagonal principal eh diferente da soma da diagonal secundaria");
	}
	getch();
}

/* Escreva um programa que leia os valores de uma matriz 4x3, e em seguida mostre na tela apenas os valores cuja soma dos índices (i+j) seja um número par.*/

#include <conio.h>
#include <stdio.h>

main(){
	int i, j;
	float matriz[4][3];
	
	for(i=0;i<4;i++){
        for(j=0;j<3;j++){
           matriz[i][j] = i+j;
        }
    }
    
    for(i=0;i<4;i++){
        for(j=0;j<3;j++){
            printf("%.0f ",matriz[i][j]);
        }
        printf("\n");
    }
    
    printf("\n\nSoma dos indices eh par\n");
    for(i=0;i<4;i++){
        for(j=0;j<3;j++){
        	
            if((i+j) % 2 == 0){
            	
             printf("[%d][%d]=%.2f \n",i,j,matriz[i][j]);
        }}
    }
	getch();
}

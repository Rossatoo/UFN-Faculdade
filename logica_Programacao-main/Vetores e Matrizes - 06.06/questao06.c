/*Escreva um programa em C que faça atribuição automática dos valores da matriz 3x3, utilizando os índices. Em seguida apresente os valores da diagonal principal*/

#include <stdio.h>
#include <conio.h>

main(){
	int i, j;
	float matriz[3][3];
	
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
			matriz[i][j] = i*j;
		}
	}
	
	 for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%.0f |",matriz[i][j]);
        }
        printf("\n");
    }
    
	printf("\n\nDiagonal principal\n\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i==j) printf("[%d][%d]=%.0f \n",i,j,matriz[i][j]);
        }
    }
	getch();
}

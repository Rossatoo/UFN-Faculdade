#include <conio.h>
#include <stdio.h>

main(){
	int mat[5][5], i, j, cont=0, pri[5], sec[5], s;
	
	for(i=0; i<5; i++){
		for(j=0; j<5; j++){
			printf("Digite o elemento %i x %i da matriz ", i,j);
			scanf("%d", &mat[i][j]);
		}
	}
	
	s=0;
	
	for(i=0; i<5; i++){
		for(j=0; j<5; j++){
			if(i==j){
				pri[i] = mat[i][j];
			}
			if(i+j==4){
				sec[s] = mat[i][j];
				s++;
			}
		}
	}
	
	printf("Diagonal principal: ");
	for(i=0; i<5; i++){
		printf("%d", pri[i]);
	}
	printf("\n\nDiagonal secundaria: ");
	for(i=0; i<5; i++){
		printf("%d", sec[i]);
	}
	
	for(i=0; i<5; i++){
		if(sec[i]==pri[i]){
			printf("\n\nElemento %d da diagonal principal e secudnaria sao iguais\n", i);
			cont++;
		}
	}
	
	if(cont == 5){
		printf("\n\nElementos da diagonal primaria e secundaria sao iguais");
	}
	else{
		printf("\n\n%d Elementos da diagonal primaria e secundaria sao iguais", cont);
		
	}
}

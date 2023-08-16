#include <stdio.h>
#include <conio.h>

main(){
	int idade[40], i, conta=0;
	
	printf("Informa as idades dos alunos da turma: \n\n");
	
	for(i=0; i<4; i++){
		scanf("%d", &idade[i]);
		if(idade[i]>=18){
			conta++;
		}	
	}
	printf("Existem %d alunos com idade maior igual a 18\n\n", conta);
	for(i=0; i<4; i++){
		if(idade >= 18){
			printf("aluno %d tem %d anos\n", i, idade[i]);
		}
	}
	
	getch();
}


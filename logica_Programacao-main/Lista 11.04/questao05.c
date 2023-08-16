#include <stdio.h>
#include <conio.h>

main(){
	float nota1, nota2, media, notaExame;
	
	printf("Digite a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Digite a segunda nota: ");
	scanf("%f", &nota2);
	
	media = (nota1 + nota2)/2;
	
	printf("\n\nMedia = %.1f\n\n", media);
	
	if(media >= 7){
		printf("APROVADO, PARABENS!!");
	}
	else{
		printf("Digite a nota do exame do aluno: \n");
		scanf("%f", &notaExame);
		
		if(notaExame >= 5){
			printf("APROVADO!!");
		}
		else{
			printf("REPROVADO!!");
		}
	}
	
	getch();
}

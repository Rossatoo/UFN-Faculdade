#include <stdio.h>

main(){
	float totalAulas, faltas, frequencia, percent_faltas;
	
	printf("Digite o numero total de aulas: ");
	scanf("%f", &totalAulas);
	
	printf("Digite o numero de faltas do aluno: ");
	scanf("%f", &faltas);
	
	percent_faltas = (faltas * 100)/totalAulas;
	frequencia = 100 - percent_faltas;
	
	printf("\nA frequencia do aluno foi = %.1f %%", frequencia);
	
	getch();
}

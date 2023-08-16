//Escreva um algoritmo para ler o salário mensal e o percentual de reajuste. O algoritmo deve calcular o novo salário e exibi-lo.
#include <stdio.h>

main(){
	float salario, novoSalario, porcent_aumento, aumento;
	
	printf("Entre com o valor do salario: ");
	scanf("%f", &salario);
	
	printf("Entre com o valor da porcentagem de aumento: ");
	scanf("%f" ,&porcent_aumento);
	
	aumento = salario*(porcent_aumento/100);
	novoSalario = salario + aumento;
	
	printf("O seu aumento foi de: %f\n", aumento);
	printf("Com isso o novo salario eh de: %f", novoSalario);
	
	getch();
	
}

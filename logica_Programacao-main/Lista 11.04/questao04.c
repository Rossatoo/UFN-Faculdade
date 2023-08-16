#include <stdio.h>
#include <conio.h>

main(){
	float quant_HorasAulas1, valorHora1, quant_HorasAulas2, valorHora2, salario1, salario2;
	
	printf("Digite a quantidade de horas aula do primeiro professor: "); 
	scanf("%f", &quant_HorasAulas1);
	
	printf("Digite o valor recebido por hora do primeiro professor: ");
	scanf("%f", &valorHora1);
	
	printf("\nDigite a quantidade de horas aula do segundo professor: ");
	scanf("%f", &quant_HorasAulas2);
	
	printf("Digite o valor recebido por hora do segundo professor: ");
	scanf("%f", &valorHora2);
	
	salario1 = quant_HorasAulas1 * valorHora1;
	salario2 = quant_HorasAulas2 * valorHora2;
	
	printf("\n\nSalario primeiro professor: R$%.2f\n", salario1);
	printf("Salario segundo professor: R$%.2f" , salario2);
	
	if (salario1 > salario2){
		printf("\n\nO salario do primeiro professor eh maior");
	}	
	else if (salario1 <salario2){
		printf("\n\nO salario do segundo professor eh maior");
	}
	else{
		printf("\n\nOs salarios sao iguais");
	}
	getch();
}

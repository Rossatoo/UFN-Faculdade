/*Considere a tabela de Alíquota de Imposto de Renda (IR) a seguir. Desenvolva um algoritmo para ler um valor de salário mensal,
mostrar o % da alíquota do imposto de Renda e o valor em R$ da alíquota.

Base de cálculo mensal em R$

Alíquota %

Até 1.566,61

-

De 1.566,62 até 2.347,85

7,5

De 2.347,86 até 3.130,51

15,0

De 3.130,52 até 3.911,63

22,5

Acima de 3.911,64

27,5

*/

#include <stdio.h>
#include <conio.h>

main(){
	float salarioMensal, impostoRenda;
	
	printf("Digite o salario mensal: ");
	scanf("%f", &salarioMensal);
	
	if (salarioMensal <= 1566.61){
		printf("Nao tem aliquota, portanto nao tem imposto de renda");
	}
	
	else if (salarioMensal > 1566.61 && salarioMensal <2347.86){
		
		impostoRenda = (salarioMensal * 7.5)/100;
		
		printf("\nAliquota = 7.5%");
		printf("\nImposto de renda = %.2f", impostoRenda);
	}
	else if (salarioMensal >=2347.86 && salarioMensal < 3130.52){
		
		impostoRenda = (salarioMensal * 15)/100;
		
		printf("\nAliquota = 15%");
		printf("\nImposto de renda = %.2f", impostoRenda);
	}
	
	else if (salarioMensal >=3130.52 && salarioMensal <= 3911.63){
		
		impostoRenda = (salarioMensal * 22.5)/100;
		
		printf("\nAliquota = 22.5%");
		printf("\nImposto de renda = %.2f", impostoRenda);
	}
	else if (salarioMensal >3911.63){
		
		impostoRenda = (salarioMensal * 27.5)/100;
		
		printf("\nAliquota = 27.5%");
		printf("\nImposto de renda = %.2f", impostoRenda);
	}
	
	
	getch();
}

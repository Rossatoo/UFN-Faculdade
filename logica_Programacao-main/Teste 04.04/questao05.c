/* Uma loja vende bicicletas com um acréscimo de 50% sobre o preço de custo. Ela paga a cada vendedor 2 salários mínimos mensais, mais uma comissão de 15%
 sobre o preço de custo de cada bicicleta vendida.
Desenvolva um algoritmo que leia o valor do salário mínimo, o preço de custo de cada bicicleta e o número de bicicletas vendidas pelo vendedor, calcule e mostre: 
o salário do empregado */

#include <stdio.h>

main(){
	float salarioMinimo, precoCusto, biciVendidas, comissao, salarioEmpregado;
	
	printf("Digite o valor da salario minimo: ");
	scanf("%f", &salarioMinimo);
	
	printf("Digite o preco de custo das bicicletas: ");
	scanf("%f", &precoCusto);
	
	printf("Digite o numero de bicicletas vendidas: ");
	scanf("%f", &biciVendidas);
	
	comissao = precoCusto * 0.15;	
	salarioEmpregado = (salarioMinimo *2) + (comissao * biciVendidas);
	
	printf("O salario do empragado = R$%.2f", salarioEmpregado); 
	
	getch();
}

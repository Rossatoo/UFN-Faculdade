#include <stdio.h>
#include <conio.h>

main(){
	char operacao;
	float num1, num2, resultado;
	
	printf("Digite um numero: ");
	scanf("%f", &num1);
	
	printf("Digite outro numero: ");
	scanf("%f", &num2);
	
	printf("\n\nNumero 1 = %.0f \nNumero 2 = %.0f", num1,num2);
	
	printf("\n\nSelecione uma operacao para ser realizada com os numeros:");
	printf("\nAdicao -> +");
	printf("\nSubtracao -> -");
	printf("\nMultiplicacao -> *");
	printf("\nDivisao -> /\n\n");
	scanf("%s", &operacao);
	
	switch (operacao){
		case '+':
			resultado = num1 + num2;
			printf("\n%.0f + %.0f = %.0f", num1, num2, resultado);
		break;
		
		case '-':
			resultado = num1 - num2;
			printf("\n%.0f - %.0f = %.0f", num1, num2, resultado);
		break;
		
		case '*':
			resultado = num1 * num2;
			printf("\n%.0f * %.0f = %.0f", num1, num2, resultado);
		break;
		
		case '/':
			resultado = num1 / num2;
			printf("\n%.0f / %.0f = %.0f", num1, num2, resultado);
		break;
		
		default:
			printf("\n\nSelecione uma operacao valida!");
	}
	
	getch();
}

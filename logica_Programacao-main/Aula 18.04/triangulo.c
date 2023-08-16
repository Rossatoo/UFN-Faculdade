#include <stdio.h>
#include <conio.h>

main(){
	float n1, n2, n3;
	
	printf("Digite um numero: ");
	scanf("%f", &n1);
	
	printf("Digite o segundo numero: ");
	scanf("%f", &n2);
	
	printf("Digite o terceiro numero: ");
	scanf("%f", &n3);
	
		if(n1 < n2 + n3  && n2 < n1 + n3 && n3 < n1 + n2){
			
			if(n1 == n2 && n2 == n3){
				printf("\nO triangulo eh equilatero");
			}
			else if(n1 == n2 || n1 == n3 || n2 == n3){
				printf("O triagulo eh isosceles");
			}
			else {
				printf("O triangulo eh escaleno");
			}
			
		}
			else {
				printf("Valores invalidos para ser um triangulo");
			}	
				
			
		
	getch();
}

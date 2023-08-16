// Converta a temperatura dada em Celsius para Fahrenheit

#include <stdio.h>

main(){
	
	float temp_celsius, temp_fahrenheit;
	
	printf("Entre com a temperatura em Celsius: ");
	scanf("%f", &temp_celsius);
	
	temp_fahrenheit = (temp_celsius * 1.8) + 32;
	
	printf("A temperatura em Fahrenheit eh: %f", temp_fahrenheit);
	
	getch();
}

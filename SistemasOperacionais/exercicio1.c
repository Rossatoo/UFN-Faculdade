
#include <pthread.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void* calculaPerimetro(void* lado) {
	int l = atoi(lado);
	int perimetro = l * 4;
	printf("O perimetro eh: %d" , perimetro); 
	

       pthread_exit(0); //finaliza a thread
}

void* calculaArea(void* lado){
	int l = atoi(lado);
	int area = l * l;
	printf("\nA area eh: %d", area);

	pthread_exit(0);
}
int main()
{
       int i;
       pthread_t thUm, thDois;


       pthread_create(&thUm, 0, calculaPerimetro, "5");
       pthread_create(&thDois, 0, calculaArea, "5");


       pthread_join(thUm, 0);
       pthread_join(thDois, 0);


       return 0;
}

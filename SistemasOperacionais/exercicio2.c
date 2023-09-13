
#include <pthread.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void* lacoUm(void* N) {
	int valor = atoi(N);
	for(int i; i <= valor; i++){
		printf("A %d", i);
	}
	
	printf("\n");
       pthread_exit(0); //finaliza a thread
}

void* lacoDois(void* N){

	int valor = atoi(N);
	for(int i; i <= valor; i++){
		printf("B %d", i);
	}
	printf("\n");
}

void* lacoTres(void* N){

	int valor = atoi(N);
	for(int i; i <= valor; i++){
		printf("C %d", i);
	}
	printf("\n");
}
int main()
{
       int i;
       pthread_t thUm, thDois, thTres;


       pthread_create(&thUm, 0, lacoUm, "1000");
       
       pthread_create(&thDois, 0, lacoDois, "5000");
      
       pthread_create(&thTres, 0, lacoTres, "15000");
      

       pthread_join(thUm, 0);
       pthread_join(thDois, 0);
       pthread_join(thTres, 0);

       return 0;
}

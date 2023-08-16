#include <conio.h>
#include <stdio.h>

main(){
	int i, o, vetor[10], ord[10],m;
	
	for(i=0; i<10; i++){
		printf("Digite o elemento da posicao %d: ", i);
		scanf("%d", &vetor[i]);
	}
	
	m=0;
	
	for(o=0; o <10; o++)
	{
		for(i=0; i<10; i++)
		{
			if(vetor[i]<vetor[m]){
				m=i;
			}
		}
		ord[o] = vetor[m];
		vetor[m] = 999999;
	}
	printf("VETOR ORDENADO: ");
	for(i=0; i<10; i++){
		printf("%d ", ord[i]);
	}
	
	
	
	getch();
}

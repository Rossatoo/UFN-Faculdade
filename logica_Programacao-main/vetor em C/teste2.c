#include <conio.h>
#include <stdio.h>

main(void){
	int i, vetorA[15], vetorB[15];
	
	for(i=0; i<15; i++){
		printf("Digite o valor %d: \n", i);
		scanf("%d", &vetorA[i]);
			
			if(vetorA[i] % 2 == 0){
				vetorB[i] = vetorA[i] * 5;
			}
			else {
				vetorB[i] = vetorA[i] + 5;
				}
			}
	for(i=0; i<15; i++){
		printf("\n\nVetorB[%d] = %d\n", i, vetorB[i]);
	} 
	
	
	getch();
}

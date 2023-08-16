#include <stdio.h>
#include <conio.h>

main(){
	int i, parteA, parteB;
	float resultado;
	
	for (i=1000; i<=9999; i++){
	
		parteA = i / 100;
		parteB = i % 100;
		
		if((parteA + parteB) * (parteA + parteB) == i){
			printf("%d\n", i);
		}
	
}
	
	getch();
}

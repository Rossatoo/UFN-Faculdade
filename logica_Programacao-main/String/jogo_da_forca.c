#include <conio.h>
#include <stdio.h>
#include <string.h>


main() {
	
	char palavra[20], letra, espacoLetra[20];
	int i, j , chances = 5, cont=0, ganhar=0;
	
	printf("Digite a palavra da forca: ");//Entrando com a palavra para ser adivinhada
	gets(palavra);//Lendo a palavra
	system("cls");//Limpando a tela
	
	for(i=0; i<strlen(palavra); i++){//For para colocar '_' de acordo com a quantidade de letra da palavra 
		espacoLetra[i] = '_';
	}
	
	while(chances > 0 && ganhar==0){//Enquanto as chances nao zerar ou a variavel "ganhar" for 0 vai executar o código dentro dele
	
		system("cls");//toda nova execução limpa a tela
		
		printf("Numero de letras: %d\n", strlen(palavra));//Mostrando o numero de letras que a palavra tem
		
	
		printf("%s", espacoLetra);//mostrando os "_"
		
		printf("\n\nVoce tem %d chances\n", chances);//mostrando os numero de chances
		
		printf("Digite uma letra: ");//pedindo para digitar uma letra
		
		letra = getch();//a variavel letra recebe a letra digitada 
		printf("%c", letra);//e mostra na tela
		
		for(j=0; j<strlen(palavra); j++)//for para percorrer a palavra digitada
		{
			
				if(palavra[j] == letra)//teste para ver se a letra digitada esta presente na palavra
				{
					espacoLetra[j] = letra;//se sim, o "_" correspondente a posicao da letra na palavra vira a letra
					cont++; //contador passa de 0 para 1
				}
		}
		
		if(cont == 0){//se o contador for 0, mostra que a letra nao esta presente na palavra
			printf("\nVoce errou! Nao existe a letra %c", letra);
			chances--;//o jogador perde uma vida
			sleep(2);
		}
		
		if(cont>0){//se o contador foi maior que 0, ou seja, o jogador acertou uma letra e o cont passou a ser 1 
			printf("\nVoce acertou uma letra");
			sleep(2);
		}
		
		cont=0;//no fim de cada volta o contador volta a ser 0, para assim os testes dos "if" funcionarem adequadamente
		
		
		if(strcmp(palavra, espacoLetra)==0){//confere se as duas strings estao iguais
			ganhar = 1; // se sim a variavel ganhar passa a ser 1 e nao entra mais no loop
		}
			
		}
		
		
		
		if (ganhar == 1){// se a variavel ganhar for 1, ou seja, as strings estao iguais, significa que o jogador ganhou
			printf("\n\nVOCE GANHOU!");
			printf("\nA palavra era: ");
			puts(palavra);		
		}
			
		if(chances == 0){//caso a variavel chances for igual a 0, ou seja, o jogador errou 5 vezes, significa que ele perdeu;
			printf("\n\nVOCE PERDEU!");
			printf("\nA palavra era: ");
			puts(palavra);
		}
		
		
		
	
		
		
	printf("Pressione qualquer tecla para sair");
	getch();
}

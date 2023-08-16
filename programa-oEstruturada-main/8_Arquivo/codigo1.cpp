#include <iostream>
#include <stdio.h>

using namespace std;

main(){
    FILE *procurador;
    char nomeArquivo[100];
    cout << "Digite o nome do arquivo: ";
    cin >> nomeArquivo;
    procurador = fopen(nomeArquivo, "a");
    char nome[100], email[100];
    int opcao;

    do{
        cout << "Nome: ";
        cin >> nome;
        cout << "Email: ";
        cin >> email;

        fprintf(procurador, "%s; %s\n", nome, email);
        fflush(procurador);

        cout << "1 - continuar; 2 - sair";
        cin >> opcao;


    } while(opcao == 1);
    fclose(procurador);


    return 0;
}
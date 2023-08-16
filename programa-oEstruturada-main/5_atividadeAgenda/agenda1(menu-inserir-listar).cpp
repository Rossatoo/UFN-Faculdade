#include <iostream>
#include <string>
#include <stdio.h>
#define TAM 10

using namespace std;

#include "util.h"

int main (){
    Contato vetor[TAM];
    inicializar(vetor, TAM);
    int opcao;
    int qtdContatos = 0;
    //montar o menu
    do
    {
        system("cls");
        cout << "Menu Contatos\n";
        cout << "1 - Inserir contato\n";
        cout << "2 - Renomear\n";
        cout << "3 - Atualizar\n";
        cout << "4 - Listar\n";
        cout << "5 - Pesquisar\n";
        cout << "6 - Sair\n";
        cout << "Opcao; ";
        cin >> opcao;
        fflush(stdin);

        switch (opcao)
        {
        case 1:
            cout << "Inserindo contato...\n";  
            if (inserir(vetor, &qtdContatos))
            {
                cout << "Contato cadastrado com sucesso\n";
            }
            else{
                cout << "Problemas para cadastras contato. Falta de espaco\n";
            }
                      
            break;

        case 2:
            cout << "Renomeando contato...\n";
            break;
        
        case 3:
            cout << "Atualizando contato...\n";
            break;

        case 4:
            cout << "Listando contatos...\n";
            if (listar(vetor, qtdContatos))
            {
                cout << "Contatos cadastrados\n";
            }
            else{
                cout << "Estrutura vazia\n";
            }
            
            break;

        case 5:
            cout << "Pesquisando contato...\n";
            break;

        case 6:
            cout << "Obrigado por usar o sistema\n";
            break;

        default:
            cout << "Opcao invalida!";
            break;
        }

    system("pause");
    } while (opcao != 6);
    

    return 1;
}
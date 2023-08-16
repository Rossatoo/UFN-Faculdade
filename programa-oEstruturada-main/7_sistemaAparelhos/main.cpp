#include <iostream>
#include <string>
#include <stdio.h>
#define TAM 10

using namespace std;

#include "util.h"

int main (){
    Aparelhos vetor[TAM];
    inicializar(vetor, TAM);
    int opcao;
    int qtdAparelhos = 0;
    //montar o menu
    do
    {
        system("cls");
        cout << "Menu\n";
        cout << "1 - Cadastrar Ordens de Servico\n";
        cout << "2 - Listar Ordens de Servicos\n";
        cout << "3 - Pesquisar/Atualizar Ordem de Servico\n";
        cout << "4 - Sair\n";
        cout << "Opcao; ";
        cin >> opcao;
        fflush(stdin);

        switch (opcao)
        {
        case 1:
            cout << "CADASTRAR\n";
            if (inserir(vetor, &qtdAparelhos))
            {
                cout << "Aparelho cadastrado com sucesso\n";
            }
            else{
                cout << "Problemas para cadastrar aparelho. Falta de espaco\n";
            }
                      
            break;

        case 2:
            cout << "LISTAR\n";
            if (listar(vetor, qtdAparelhos))
            {
                cout << "Degustacoes cadastradas\n";
            }
            else{
                cout << "Estrutura vazia\n";
            }
            
            break;
        
        case 3:
            cout << "PESQUISAR/ATUALIZAR\n";
            if(pesquisarAtualizar(vetor, qtdAparelhos))
                {
                    cout << "Degustacao atualizada\n";
                }
                else{
                    cout << "Estrutura vazia\n";
                }
            break;
    
        case 4:
             cout << "Obrigado por usar o sistema\n";
            break;

        default:
            cout << "Opcao invalida!";
            system("cls");
            break;
        }

    system("pause");
    } while (opcao != 4);
    

    return 1;
}
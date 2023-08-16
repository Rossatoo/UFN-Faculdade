#include <iostream>
#include <string>
#include <stdio.h>
#define TAM 10

using namespace std;

#include "util.h"

int main (){
    Degustacao vetor[TAM];
    inicializar(vetor, TAM);
    int opcao;
    int qtdContatos = 0;
    //montar o menu
    do
    {
        system("cls");
        cout << "Menu Contatos\n";
        cout << "1 - Inserir degustacao\n";
        cout << "2 - Remover\n";
        cout << "3 - Atualizar\n";
        cout << "4 - Listar\n";
        cout << "5 - Pesquisar\n"; //por tipo de cerveja
        cout << "6 - Sair\n";
        cout << "Opcao; ";
        cin >> opcao;
        fflush(stdin);

        switch (opcao)
        {
        case 1:
            cout << "INSERIR\n";  
            if (inserir(vetor, &qtdContatos))
            {
                cout << "Degustacao cadastrada com sucesso\n";
            }
            else{
                cout << "Problemas para cadastrar degustacao. Falta de espaco\n";
            }
                      
            break;

        case 2:
            cout << "REMOVER\n";
            if (remover(vetor, &qtdContatos))
            {
                cout << "Degustacao removida\n";
            }
            else{
                cout << "Degustacao nao removida. Estrutura vazia ou degustacao nao localizada\n";
            }
            
            break;
        
        case 3:
            cout << "ATUALIZAR\n";
            if(atualizar(vetor, qtdContatos))
                {
                    cout << "Degustacao atualizada\n";
                }
                else{
                    cout << "Estrutura vazia\n";
                }
            break;

        case 4:
            cout << "LISTAR\n";
            if (listar(vetor, qtdContatos))
            {
                cout << "Degustacoes cadastradas\n";
            }
            else{
                cout << "Estrutura vazia\n";
            }
            
            break;

        case 5:
            cout << "PESQUISAR\n";
            if (pesquisar(vetor, qtdContatos))
            {
                cout << "Pesquisa realizada com sucesso\n";
            }
            else{
                cout << "Estrutura vazia\n";
            }
            break;

        case 6:
            cout << "Obrigado por usar o sistema\n";
            break;

        default:
            cout << "Opcao invalida!";
            system("cls");
            break;
        }

    system("pause");
    } while (opcao != 6);
    

    return 1;
}
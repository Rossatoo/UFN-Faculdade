#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>

using namespace std;

#include "desafio.h"

Celula *popularListaConteudoArquivo(char *nomeArquivo, Celula *lista) {
    ifstream procuradorArquivo; //tipo de arquivo para leitura
    procuradorArquivo.open(nomeArquivo); 

    if (!procuradorArquivo) {
        cout << nomeArquivo << " Nao eh um arquivo valido." << endl;
        return lista;
    }
 
   	cout << "Populando o conteudo do arquivo : " << nomeArquivo << endl;
	//le o arquivo capturando as frases
	string linha;
	while (!procuradorArquivo.eof()) {
		getline(procuradorArquivo,linha); //lendo a linha inteira
		lista = inserirOrdenado(linha, lista);
	}
	procuradorArquivo.close();
    return lista;
}

int main(int quantidadeArgumentos, char **vetorArgumentos) {
    int opcao;
    Celula *listaOrdenada = NULL; //nao precisa guardar a ocorrencia (0)
    Celula *listaControleOcorrencia = NULL; //nao precisa guardar a data (NULL)
    
    for (int i = 1; i < quantidadeArgumentos; i++){
        listaOrdenada = popularListaConteudoArquivo(vetorArgumentos[i], listaOrdenada);
    }

    listaControleOcorrencia = copiaListaControleDuplicidade(listaOrdenada);
    listaControleOcorrencia = ordenarPelasOcorrencias(listaControleOcorrencia);
    
    //menu

    do
    {
        system("cls");
        cout << "Menu\n";
        cout << "1 - Media dos dados glicemicos\n";
        cout << "2 - Mediana\n";
        cout << "3 - Moda\n";
        cout << "4 - Maior valor glicemico\n";
        cout << "5 - Menor valor glicemico\n";
        cout << "6 - Exibir valores\n";
        cout << "7 - Exibir valores ordenados por ocorrencia\n";
        cout << "8 - Sair\n"; //por tipo de cerveja
        cout << "Opcao; ";
        cin >> opcao;
        fflush(stdin);

        switch (opcao)
        {
        case 1:
            cout << "MEDIA\n";  
            cout << media(listaOrdenada) << endl;                      
            break;

        case 2:
            cout << "MEDIANA\n";
            cout << mediana(listaOrdenada) << endl;
            break;
        
        case 3:
            cout << "MODA\n";
            moda(listaControleOcorrencia);
            break;

        case 4:
        cout << "MAIOR VALOR: ";
        cout << max(listaOrdenada);
            break;

        case 5:
        cout << "MENOR VALOR: ";
        cout << min(listaOrdenada);
            break;

        case 6:
            cout << "Lista\n";
            exibirListaSimples(listaOrdenada);
            break; 

        case 7:
            cout << "Lista por Ocorrencia\n";
            exibirOcorrencias(listaControleOcorrencia);
            break;         

        case 8:
        cout << "Obrigado por usar o sistema!"; 
        break;
        default:
            cout << "Opcao invalida!";
            system("cls");
            break;
        }

    system("pause");
    } while (opcao != 8);
    
    return 1;
}
#include <ctime>
#include <fstream>
#include <iostream>
#include <string>

using namespace std;

int contarLinhasArquivos(string nomeArquivo) {
  ifstream procuradorLeitura;
  procuradorLeitura.open(nomeArquivo);

  if (!procuradorLeitura)
    return 0;

  int qtdLinhas = 0;
  string linha;
  while (!procuradorLeitura.eof()) {
    getline(procuradorLeitura, linha);
    if (linha == "")
      break;
    qtdLinhas++;
  }
  procuradorLeitura.close();
  return qtdLinhas;
}

void popularListaDefeitos(string *defeitos, string nomeArquivo) {
  ifstream procuradorLeitura;
  procuradorLeitura.open(nomeArquivo);

  string defeito;
  int i = 0;
  string linha;

  while (!procuradorLeitura.eof()) {
    getline(procuradorLeitura, linha);
    if (linha == "")
      break;

    defeitos[i] = linha;
    i++;
  }
  procuradorLeitura.close();
}

void popularListaQualidades(string *qualidades, string nomeArquivo){
    ifstream procuradorLeitura;
    procuradorLeitura.open(nomeArquivo);

    string qualidade;
    int i = 0;
    string linha;

    while(!procuradorLeitura.eof()){
        getline(procuradorLeitura, linha);
        if(linha == "")break;

        qualidades[i] = linha;
        i++;
    }
    procuradorLeitura.close();
}

void exibirListaDefeitos (string *defeitos, int qtdDefeitos){
    for (int i = 0; i < qtdDefeitos; i++)
    {
        cout << defeitos[i] << endl;
    }
    
}

void exibirListaQualidades (string *qualidades, int qtdQualidades){
    for (int i = 0; i < qtdQualidades; i++)
    {
        cout << qualidades[i] << endl;
    }
    
}

void conferirTexto(string *defeitos, int qtdDefeitos, string *qualidades, int qtdQualidades, string nomeArquivo){
    int contDefeitos=0;
    int contQualidades=0;
    ifstream procuradorLeitura;
    procuradorLeitura.open(nomeArquivo);

    //verificando se tem defeitos no texto e quantos
    for (int i = 0; i < qtdDefeitos; i++)
    {
        if (nomeArquivo.find(defeitos[i]))
        {
            contDefeitos++;
        }
    }

    //verificando se tem qualidades no texto e quantas 
    for (int i = 0; i < qtdQualidades; i++)
    {
        if (nomeArquivo.find(qualidades[i]))
        {
            contQualidades++;
        }
        
    }
    
    if (contDefeitos > contQualidades)
    {
        cout << "O texto fala mal" << endl;
    }

    else
    {
        cout << "O texto fala bem\n";
    }
    
    procuradorLeitura.close();
}
void menu(string *defeitos, string *qualidades, int qtdDefeitos, int qtdQualidades,  string nomeArquivoDefeitos,
          string nomeArquivoQualidades, string nomeArquivoProduto) {

  int opcao;

  do {
    cout << "MENU\n";
    cout << "1 - Listar Lista de Defeitos\n";
    cout << "2 - Listar lista de Qualidades\n";
    cout << "3 - Conferir se o texto fala bem/mal\n";
    cout << "4 - Sair\n";
    cout << "Opcao: ";
    cin >> opcao;
    cin.ignore();

    switch (opcao) {
    case 1:
        cout << "Listando defeitos\n:";
        exibirListaDefeitos(defeitos, qtdDefeitos);
        break;

    case 2:
        cout << "Listando qualidades\n";
        exibirListaQualidades(qualidades, qtdQualidades);
        break;

    case 3:
        cout << "Conferindo texto\n";
        conferirTexto(defeitos, qtdDefeitos, qualidades, qtdQualidades, nomeArquivoProduto);
        break; 
    }
  } while (opcao != 4);
}

int main() {
  string *defeitos;
  string *qualidades;
  int qtdDefeitos;
  int qtdQualidades;
  string nomeArquivoDefeitos = "defeitos.txt";
  string nomeArquivoQualidades = "qualidades.txt";
  string nomeArquivoProduto = "produto.txt";

  //cout << "vai tomar no cu argentina";

  qtdDefeitos = contarLinhasArquivos(nomeArquivoDefeitos);
  defeitos = (string *)malloc(sizeof(string) * (qtdDefeitos + 100));
  popularListaDefeitos(defeitos, nomeArquivoDefeitos);

  qtdQualidades = contarLinhasArquivos(nomeArquivoQualidades);
  qualidades = (string *)malloc(sizeof(string) * (qtdQualidades + 100));
  popularListaQualidades(qualidades, nomeArquivoQualidades);

  

  menu(defeitos, qualidades, qtdDefeitos, qtdQualidades, nomeArquivoDefeitos, nomeArquivoQualidades, nomeArquivoProduto);

  

  return 1;
}
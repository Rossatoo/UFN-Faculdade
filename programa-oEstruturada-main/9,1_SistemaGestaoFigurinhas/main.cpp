#include <ctime>
#include <fstream>
#include <iostream>
#include <string>
using namespace std;

string paraMaiusculo(string frase) {
  for (int i = 0; i < frase.length(); i++) {
    frase[i] = toupper(frase[i]);
  }
  return frase;
}

string pegarPrimeiroNome(string nome) {
  string primeiroNome = "";
  int i;
  for (i = 0; i < nome.length(); i++) {
    if (nome[i] == ' ' || nome[i] == '\0' || nome[i] == '\n') {
      break;
    }
    primeiroNome.append(1, nome[i]);
  }
  return primeiroNome;
}

bool validaNomeCompleto(string nome) {
  for (int i = 0; i < nome.length(); i++) {
    if (nome[i] == ' ' && (nome[i + 1] != ' ' || nome[i + 1] != '\n')) {
      return true;
    }
  }
  return false;
}

void splitstr(string str, string deli = " ") {
  int start = 0;
  int end = str.find(deli);
  while (end != -1) {
    cout << str.substr(start, end - start) << endl;
    start = end + deli.size();
    end = str.find(deli, start);
  }
  cout << str.substr(start, end - start);
}

typedef struct {
  string codFigurinha;
  string jogador;
  string selecao;
} Figurinhas;

int contarLinhasArquivo(string nomeArquivo) {
  ifstream procuradorLeitura;
  procuradorLeitura.open(nomeArquivo);

  if (!procuradorLeitura)
    return 0;

  int qtdLinhas = 0;
  string linha;
  while (!procuradorLeitura.eof()) {
    getline(procuradorLeitura, linha); // lendo a linha inteira
    if (linha == "")
      break;
    qtdLinhas++;
  }
  procuradorLeitura.close();
  return qtdLinhas;
}

void popularListaRepetidas(Figurinhas *lista, string nomeArquivo) {
  ifstream procuradorLeitura;
  procuradorLeitura.open(nomeArquivo);
  string codFigurinha, jogador, selecao;
  int i = 0;

  string linha;
  while (!procuradorLeitura.eof()) {
    getline(procuradorLeitura, linha); // lendo a linha inteira
    if (linha == "")
      break;

    int posicaoPrimeiroPontoVirgula = linha.find(";");
    int posicaoUltimoPontoVirgula = linha.find_last_of(";");
   

    codFigurinha = linha.substr(0, posicaoPrimeiroPontoVirgula);
    jogador = linha.substr(posicaoPrimeiroPontoVirgula + 1,
                           posicaoUltimoPontoVirgula -
                               (posicaoPrimeiroPontoVirgula + 1));
    selecao = linha.substr(posicaoUltimoPontoVirgula + 1, 200);

    lista[i].codFigurinha = codFigurinha;
    lista[i].jogador = jogador;
    lista[i].selecao = selecao;
    i++;
  }
  procuradorLeitura.close();
}

void popularListaFaltantes(Figurinhas *lista, string nomeArquivo) {
  ifstream procuradorLeitura;
  procuradorLeitura.open(nomeArquivo);
  string codFigurinha, jogador, selecao;
  int i = 0;

  string linha;
  while (!procuradorLeitura.eof()) {
    getline(procuradorLeitura, linha); // lendo a linha inteira
    if (linha == "")
      break;

    int posicaoPrimeiroPontoVirgula = linha.find(";");
    int posicaoUltimoPontoVirgula = linha.find_last_of(";");
   

    codFigurinha = linha.substr(0, posicaoPrimeiroPontoVirgula);
    jogador = linha.substr(posicaoPrimeiroPontoVirgula + 1,
                           posicaoUltimoPontoVirgula -
                               (posicaoPrimeiroPontoVirgula + 1));
    selecao = linha.substr(posicaoUltimoPontoVirgula + 1, 200);

    lista[i].codFigurinha = codFigurinha;
    lista[i].jogador = jogador;
    lista[i].selecao = selecao;
    i++;
  }
  procuradorLeitura.close();
}

void exibirListaRepetidas(Figurinhas *lista, int quantidadeRepetidas) {
  for (int i = 0; i < quantidadeRepetidas; i++) {
    cout << "Codigo: " << lista[i].codFigurinha
         << ". Jogador: " << lista[i].jogador
         << ". Selecao: " << lista[i].selecao << endl;
  }
}

void exibirListaFaltantes(Figurinhas *lista, int quantidadeFaltantes) {
  for (int i = 0; i < quantidadeFaltantes; i++) {
    cout << "Codigo: " << lista[i].codFigurinha
         << ". Jogador: " << lista[i].jogador
         << ". Selecao: " << lista[i].selecao << endl;
  }
}

void cadastrarNaListaRepetidas(Figurinhas *lista, int *quantidadeRepetidas,
                               string nomeArquivo) {
  ofstream procuradorEscrita;
  string codigo, jogador, selecao;
  procuradorEscrita.open(nomeArquivo, ios::out | ios::app);
  cout << "Figurinhas Sendo cadastrada na posicao " << *quantidadeRepetidas
       << endl;
  do {
    cout << "Digite o codigo da figurinha: ";
    getline(cin, codigo);
  } while (codigo.length() != 5);

  do {
    cout << "Digite o nome completo do jogador: ";
    getline(cin, jogador);
    jogador = paraMaiusculo(jogador);
  } while (!validaNomeCompleto(jogador));

  cout << "Digite a selecao do jogador: ";
  cin >> selecao;

  lista[*quantidadeRepetidas].codFigurinha = codigo;
  lista[*quantidadeRepetidas].jogador = jogador;
  lista[*quantidadeRepetidas].selecao = selecao;
  *quantidadeRepetidas = *quantidadeRepetidas + 1;
  // adicionar no final do arquivo
  procuradorEscrita << codigo << ";" << jogador << ";" << selecao << endl;
  procuradorEscrita.close();
}

void cadastrarNaListaFaltantes(Figurinhas *lista, int *quantidadeFaltantes,
                               string nomeArquivo) {
  ofstream procuradorEscrita;
  string codigo, jogador, selecao;
  procuradorEscrita.open(nomeArquivo, ios::out | ios::app);

  cout << "Figurinha faltante cadastrada na posicao " << *quantidadeFaltantes
       << endl;
  do {
    cout << "Digite o codigo da figurinha: ";
    getline(cin, codigo);
  } while (codigo.length() != 5);

  do {
    cout << "Digite o nome completo do jogador: ";
    getline(cin, jogador);
    jogador = paraMaiusculo(jogador);
  } while (!validaNomeCompleto(jogador));

  cout << "Digite a selecao do jogador: ";
  cin >> selecao;

  lista[*quantidadeFaltantes].codFigurinha = codigo;
  lista[*quantidadeFaltantes].jogador = jogador;
  lista[*quantidadeFaltantes].selecao = selecao;
  *quantidadeFaltantes = *quantidadeFaltantes + 1;
  // adicionar no final do arquivo
  procuradorEscrita << codigo << ";" << jogador << ";" << selecao << endl;
  procuradorEscrita.close();
}

void menu(Figurinhas *listaRepetidas, Figurinhas *listaFaltantes,
          int quantidadeRepetidas, int quantidadeFaltantes,
          string nomeArquivoRepetidas, string nomeArquivoFaltantes) {
  int opcao;
  int tecla;
  do {
    // system("clear");
    cout << "MENU\n";
    cout << "1 - Cadastrar Figurinhas Repetidas\n";
    cout << "2 - Cadastrar Figurinhas Faltantes\n";
    cout << "3 - Listar Repetidas\n";
    cout << "4 - Listar Faltantes\n";
    cout << "5 - Sair\n";
    cout << "Opcao: ";
    cin >> opcao;
    cin.ignore();

    switch (opcao) {
    case 1:
      cout << "CADASTRO DE REPETIDAS\n";
      cadastrarNaListaRepetidas(listaRepetidas, &quantidadeRepetidas,
                                nomeArquivoRepetidas);
      break;
    case 2:
      cout << "CADASTRO DE FALTANTES\n";
      cadastrarNaListaFaltantes(listaFaltantes, &quantidadeFaltantes,
                                nomeArquivoFaltantes);

      break;
    case 3:
      cout << "LISTAGEM DE FIGURINHAS REPETIDAS\n";
      exibirListaRepetidas(listaRepetidas, quantidadeRepetidas);
      break;
    case 4:
      cout << "LISTAGEM DE FIGURINHAS FALTANTES\n";
      exibirListaFaltantes(listaFaltantes, quantidadeFaltantes);
      break;
    case 5:
      break;
    default:
      cout << "Opcao invalida!!\n";
      break;
    }

    // system("sleep 10s");

  } while (opcao != 5);
}

int main() {
  Figurinhas *listaRepetidas;
  Figurinhas *listaFaltantes; // somente a matricula dos presentes
  int quantidadeRepetidas;
  int quantidadeFaltantes;
  string nomeArquivoRepetidas = "repetidas.csv";
  string nomeArquivoFaltantes = "faltantes.csv";

  quantidadeRepetidas = contarLinhasArquivo(nomeArquivoRepetidas);
  quantidadeFaltantes = contarLinhasArquivo(nomeArquivoFaltantes);
  listaRepetidas =
      (Figurinhas *)malloc(sizeof(Figurinhas) * (quantidadeRepetidas + 100));
  listaFaltantes =
      (Figurinhas *)malloc(sizeof(Figurinhas) * (quantidadeFaltantes + 100));

  // popular lista com dados do arquivo ao iniciar o sistema
  popularListaRepetidas(listaRepetidas, nomeArquivoRepetidas);
  popularListaFaltantes(listaFaltantes, nomeArquivoFaltantes);
  // chamar menu
  menu(listaRepetidas, listaFaltantes, quantidadeRepetidas, quantidadeFaltantes,
       nomeArquivoRepetidas, nomeArquivoFaltantes);

  return 1;
}

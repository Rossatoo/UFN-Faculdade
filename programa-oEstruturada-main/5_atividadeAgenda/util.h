typedef struct 
{
    string nome;
    string email;
    string telefone;
} Contato;

// -------------------------------------------------------
// METODOS UTILIZADOS NO "INSERIR" DO ARQUIVO "agenda1.cpp"
string paraMaiusculo(string frase){

    for (int i = 0; i < frase.length(); i++)
    {
        frase[i] = toupper(frase[i]);
    }

    return frase;
    }

string pegarPrimeiroNome(string nome){
    string primeiroNome = "";
    int i;
    for ( i = 0; i < nome.length() ; i++)
    {
        if (nome[i] == ' ' || nome[i] == '\0' || nome[i] == '\n')
        {
            break;
        }
        primeiroNome.append(1, nome[i]);

    }
    return primeiroNome;
    
}

// funçao para iniciar o vetor com as posicões vazias
void inicializar(Contato vetor[], int n){
    for (int i = 0; i < n; i++)
    {
        vetor[i].nome = "";
        vetor[i].email = "";
        vetor[i].email = "";
    }
}

//funcao para verificar se o usuario entrou com um nome completo
bool validaNomeCompleto(string nome){
    for (int i = 0; i < nome.length(); i++)
    {
        if (nome[i] == ' ' && (nome[i+1] != ' ' || nome[i+1] != '\n'))
        {
            return true;
        }
        
    }
    return false;
}

// funcao para inserir valores no vetor de contatos
bool inserir(Contato vetor[], int *qtd){
    if (*qtd == TAM)
    {
        return false;
    }

    string nome, email; //variaveis internas para receber os dados do usuario e realizar a validação
    for (int i = 0; i < TAM; i++)
    {
        if (vetor[i].nome == "")
        {
            *qtd = *qtd + 1;

            do
            {
            //recebendo um nome
                cout << "Entre com o nome completo: ";
                getline(cin, nome);
                nome = paraMaiusculo(nome);
            }   while (!validaNomeCompleto(nome));
            vetor[i].nome = nome;

            //recebendo um email
            cout << "Entre com o email: ";
            getline(cin, email);
            vetor[i].email = email;

            //recebendo um telefone
            cout << "entre com o telefone celular: ";
            getline(cin, vetor[i].telefone);
            break;
        }
    }

    return true;    
}

//------------------------------------------------------------------------
// METODOS UTILZADOS NO "LISTAR" DOS ARQUIVO "agenda1.cpp"

bool listar(Contato vetor[], int qtd){
    if (qtd == 0)return false;

    for (int i = 0; i < qtd; i++)
    {
        if (vetor[i].nome != "")
        {
            cout << "Nome: " << vetor[i].nome << endl;
            cout << "Email: " << vetor[i].email << endl;
            cout << "Telefone: " << vetor[i].telefone << endl;
            cout << "----------------------------------------" << endl;
        }
    }
    return true;
    
}

// ----------------------------------------------------------------------------
// METODO UTILIZADO NO "PESQUISAR" DO ARQUIVO 
bool pesquisar(Contato vetor[], int qtd){
    if (qtd == 0)return false;
    
    string nome;
    cout << "Digite o nome do contato desejado: " << endl;
    getline(cin, nome);
    nome = paraMaiusculo(nome);

    for (int i = 0; i < qtd; i++)
    {
        if (nome == vetor[i].nome)
        {
            cout << "-----------------------------------------" << endl;
            cout << "Nome: " << vetor[i].nome << endl;
            cout << "Email: " << vetor[i].email << endl;
            cout << "Telefone: " << vetor[i].telefone << endl;
            cout << "-----------------------------------------" << endl;
        }
        
        else return false;
    }
    
    
    return true;
}

// -----------------------------------------------------------------------------
// METODO UTILIZADO NO "REMOVER" DO ARQUIVO "agenda3.cpp"
bool remover(Contato vetor[], int *qtd) {
    if (*qtd == 0) return false;
    string nomePesquisa;
    cout << "Digite parte do nome ou nome completo: ";
    getline(cin,nomePesquisa);
    nomePesquisa = paraMaiusculo(nomePesquisa);
    int confirma;

    for (int i = 0; i < *qtd; i++) {
        if (vetor[i].nome != "") {
            if (vetor[i].nome == nomePesquisa) {
                cout << "Nome: " << vetor[i].nome << endl;
                cout << "Email: " << vetor[i].email << endl;
                cout << "Telefone: " << vetor[i].telefone << endl;
                cout << "1 - Confirma a remocao; 2 - Aborta a remocao!";
                cin >> confirma;

                if (confirma == 1) {
                    vetor[i].nome = "";
                    vetor[i].email = "";
                    vetor[i].telefone = "";
                    *qtd = *qtd - 1;
                    return true;
                } 
            }
        }
    }
    return false;
}

// ---------------------------------------------------------------------------------
// METODO UTILIZADO NO "ATUALIZAR" DO ARQUIVO "agenda4.cpp"
bool atualizar(Contato vetor[], int qtd){
    if (qtd == 0) return false;
    string nome;
    string email;
    string telefone;

    cout << "Qual contato voce deseja ataulizar?" << endl;
    getline(cin, nome);
    nome = paraMaiusculo(nome);
    for (int i = 0; i < qtd; i++)
    {
        if (nome == vetor[i].nome)
        {
             //recebendo um email
            cout << "Entre com o novo email: ";
            getline(cin, email);
            vetor[i].email = email;

            //recebendo um telefone
            cout << "entre com o novo telefone celular: ";
            getline(cin, telefone);
            vetor[i].telefone = telefone;
        }

        else return false;
        
    }
    return true;
}
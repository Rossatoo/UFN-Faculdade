typedef struct 
{
    string fabricante;
    string tipoCerveja;
    string dataDegustacao;
    int nota;
} Degustacao;

string paraMaiusculo(string frase){

    for (int i = 0; i < frase.length(); i++)
    {
        frase[i] = toupper(frase[i]);
    }

    return frase;
    }

void inicializar(Degustacao vetor[], int n){
    for (int i = 0; i < n; i++)
    {
        vetor[i].fabricante = "";
        vetor[i].tipoCerveja = "";
        vetor[i].dataDegustacao = "";
    }
}

bool inserir(Degustacao vetor[], int *qtd){
    if (*qtd == TAM)
    {
        return false;
    }

    string fabricante, tipoCerveja, dataDegustacao; 
    for (int i = 0; i < TAM; i++)
    {
        if (vetor[i].fabricante == "")
        {
            *qtd = *qtd + 1;

            cout << "Entre com a fabricante: ";
            getline(cin, fabricante);
            fabricante = paraMaiusculo(fabricante);
            vetor[i].fabricante = fabricante;

            cout << "Entre com o tipo da cerveja: ";
            getline(cin, tipoCerveja);
            tipoCerveja = paraMaiusculo(tipoCerveja);
            vetor[i].tipoCerveja = tipoCerveja;

           
            do{
                cout << "Informe a data: [dd/mm/aaaa]";
                getline(cin, dataDegustacao);
                } while (dataDegustacao.length() != 10);

            vetor[i].dataDegustacao = dataDegustacao;

            cout << "Informe a nota (0 a 5): ";
            cin >> vetor[i].nota;
            break;
        }
    }

    return true;    
}


bool listar(Degustacao vetor[], int qtd){
    if (qtd == 0)return false;

    for (int i = 0; i < qtd; i++)
    {
        if (vetor[i].fabricante != "")
        {
            cout << "Fabricante: " << vetor[i].fabricante << endl;
            cout << "Tipo da Cerveja: " << vetor[i].tipoCerveja << endl;
            cout << "Data: " << vetor[i].dataDegustacao << endl;
            cout << "Nota: " << vetor[i].nota << endl;
            cout << "----------------------------------------" << endl;
        }
    }
    return true;
    
}

bool pesquisar(Degustacao vetor[], int qtd){
    if (qtd == 0)return false;
    
    string fabricante;
    cout << "Digite o nome da fabricante desejada: " << endl;
    getline(cin, fabricante);
    fabricante = paraMaiusculo(fabricante);

    for (int i = 0; i < qtd; i++)
    {
        if (vetor[i].fabricante != ""){
        if (vetor[i].fabricante.find(fabricante) != -1)
        {
            cout << "-----------------------------------------" << endl;
            cout << "Fabricante: " << vetor[i].fabricante << endl;
            cout << "Tipo da Cerveja: " << vetor[i].tipoCerveja << endl;
            cout << "Data: " << vetor[i].dataDegustacao << endl;
            cout << "Nota: " << vetor[i].nota << endl;
            cout << "-----------------------------------------" << endl;
        }}
        
        else return false;
    }
    
    
    return true;
}


bool remover(Degustacao vetor[], int *qtd) {
    if (*qtd == 0) return false;
    string fabricante;
    cout << "Digite a fabricante que deseja remover: ";
    getline(cin, fabricante);
    fabricante = paraMaiusculo(fabricante);
    int confirma;

    for (int i = 0; i < *qtd; i++) {
        if (vetor[i].fabricante != "") {
            if (vetor[i].fabricante == fabricante) {
                cout << "Fabricante: " << vetor[i].fabricante << endl;
                cout << "Tipo da Cerveja: " << vetor[i].tipoCerveja << endl;
                cout << "Data: " << vetor[i].dataDegustacao << endl;
                cout << "Nota: " << vetor[i].nota << endl;
                cout << "1 - Confirma a remocao; 2 - Aborta a remocao!";
                cin >> confirma;

                if (confirma == 1) {
                    vetor[i].fabricante = "";
                    vetor[i].tipoCerveja = "";
                    vetor[i].dataDegustacao = "";
                    vetor[i].nota = 0;
                    *qtd = *qtd - 1;
                    return true;
                } 
            }
        }
    }
    return false;
}


bool atualizar(Degustacao vetor[], int qtd){
    if (qtd == 0) return false;
    string fabricante;
    string tipo;
    string data;
    int nota;

    cout << "Qual fabricante voce deseja ataulizar?" << endl;
    getline(cin, fabricante);
    fabricante = paraMaiusculo(fabricante);
    for (int i = 0; i < qtd; i++)
    {
        if (fabricante == vetor[i].fabricante)
        {
            do{
                cout << "Informe a nova data: [dd/mm/aaaa]";
                getline(cin, data);
                } while (data.length() != 10);
            vetor[i].dataDegustacao = data;

            cout << "Entre com a nova nota (0 a 5): ";
            cin >> nota;
            vetor[i].nota = nota; 
        }

        else return false;
        
    }
    return true;
}
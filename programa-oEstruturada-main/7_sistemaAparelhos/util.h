typedef struct 
{
    int numeroServico;
    string data;
    string hora;
    string marca;
    string modelo;
    string descricaoProblema;
    string nomeDono;
    string contato;
    string previsaoDataEntrega;
    string previsaoHoraEtrega;
} Aparelhos;

string paraMaiusculo(string frase){

    for (int i = 0; i < frase.length(); i++)
    {
        frase[i] = toupper(frase[i]);
    }

    return frase;
    }

void inicializar(Aparelhos vetor[], int n){
    for (int i = 0; i < n; i++)
    {
        vetor[i].data = "";
        vetor[i].hora = "";
        vetor[i].marca = "";
        vetor[i].modelo = "";
        vetor[i].descricaoProblema = "";
        vetor[i].nomeDono = "";
        vetor[i].contato = "";
    }
}

bool inserir(Aparelhos vetor[], int *qtd){
    if (*qtd == TAM)
    {
        return false;
    }

    string marca, modelo, nomeDono, contato; 
    for (int i = 0; i < TAM; i++)
    {
        if (vetor[i].nomeDono == "")
        {
            *qtd = *qtd + 1;
            vetor[i].numeroServico = *qtd;

             do
                    {
                        cout << "Informe a data: [dd/mm/aaaa]";
                        cin >> vetor[i].data;
                    } while (vetor[i].data.length() != 10);

                    do
                    {
                        cout << "Informe a hora de entrada: [hh:mm]";
                        cin >> vetor[i].hora;

                    } while (vetor[i].hora.length() != 5);
                

            cout << "Entre com a marca do aparelho: ";
            getline(cin, marca);
            marca = paraMaiusculo(marca);
            vetor[i].marca = marca;

            cout << "Entre com o modelo do aparelho: ";
            getline(cin, modelo);
            modelo = paraMaiusculo(modelo);
            vetor[i].modelo = modelo;

            cout << "Entre com o nome do dono: ";
            getline(cin, nomeDono);
            nomeDono = paraMaiusculo(nomeDono);
            vetor[i].nomeDono = nomeDono;

            cout << "Entre com o contato do cliente: ";
            getline(cin, contato);
            contato = paraMaiusculo(contato);
            vetor[i].contato = contato;

            cout << "Digite o problema do aparelho: ";
            getline(cin, vetor[i].descricaoProblema);

            do
                    {
                        cout << "Informe a data da previsao de entrega: [dd/mm/aaaa]";
                        cin >> vetor[i].previsaoDataEntrega;
                    } while (vetor[i].previsaoDataEntrega.length() != 10);

                    do
                    {
                        cout << "Informe a hora de previsao de entrega: [hh:mm]";
                        cin >> vetor[i].previsaoHoraEtrega;

                    } while (vetor[i].previsaoHoraEtrega .length() != 5);
            break;
        }
    }

    return true;    
}


bool listar(Aparelhos vetor[], int qtd){
    if (qtd == 0)return false;

    for (int i = 0; i < qtd; i++)
    {
        if (vetor[i].nomeDono != "")
        {
            cout << "Numero do servico: " << vetor[i].numeroServico << endl;
            cout << "Marca: " << vetor[i].marca << endl;
            cout << "Modelo: " << vetor[i].modelo << endl;
            cout << "Data: " << vetor[i].data << endl;
            cout << "Hora: " << vetor[i].hora << endl;
            cout << "Descrição do Problema: " << vetor[i].descricaoProblema << endl;
            cout << "Nome do Cliente: " << vetor[i].nomeDono << endl;
            cout << "Contato: " << vetor[i].contato << endl;
            cout << "Previsao de Entrega: Dia: " << vetor[i].previsaoDataEntrega << " Hora:" << vetor[i].previsaoHoraEtrega << endl; 
            cout << "----------------------------------------" << endl;
        }
    }
    return true;
    
}

 bool pesquisarAtualizar(Aparelhos vetor[], int qtd){
    if (qtd == 0)return false;
    
    int pesquisaNumeroServico, confirma;
    string marca, modelo, nomeDono, contato;
    cout << "Digite o numero de servico: " << endl;
    cin >> pesquisaNumeroServico;

    for (int i = 0; i < qtd; i++)
    {
        if (vetor[i].nomeDono != ""){
        if (vetor[i].numeroServico == pesquisaNumeroServico)
        {
           cout << "Numero do servico: " << vetor[i].numeroServico << endl;
            cout << "Marca: " << vetor[i].marca << endl;
            cout << "Modelo: " << vetor[i].modelo << endl;
            cout << "Data: " << vetor[i].data << endl;
            cout << "Hora: " << vetor[i].hora << endl;
            cout << "Descrição do Problema: " << vetor[i].descricaoProblema << endl;
            cout << "Nome do Cliente: " << vetor[i].nomeDono << endl;
            cout << "Contato: " << vetor[i].contato << endl;
            cout << "Previsao de Entrega: Dia: " << vetor[i].previsaoDataEntrega << " Hora:" << vetor[i].previsaoHoraEtrega << endl; 
            cout << "----------------------------------------" << endl;
            cout << "1 - Atualizar Servico; 2 - Voltar";
            cin >> confirma;

            if (confirma == 1)
            {
                do
                    {
                        cout << "Informe a data: [dd/mm/aaaa]";
                        cin >> vetor[i].data;
                    } while (vetor[i].data.length() != 10);

                    do
                    {
                        cout << "Informe a hora de entrada: [hh:mm]";
                        cin >> vetor[i].hora;

                    } while (vetor[i].hora.length() != 5);
                

            cout << "Entre com a marca do aparelho: ";
            getline(cin, marca);
            marca = paraMaiusculo(marca);
            vetor[i].marca = marca;

            cout << "Entre com o modelo do aparelho: ";
            getline(cin, modelo);
            modelo = paraMaiusculo(modelo);
            vetor[i].modelo = modelo;

            cout << "Entre com o nome do dono: ";
            getline(cin, nomeDono);
            nomeDono = paraMaiusculo(nomeDono);
            vetor[i].nomeDono = nomeDono;

            cout << "Entre com o contato do cliente: ";
            getline(cin, contato);
            contato = paraMaiusculo(contato);
            vetor[i].contato = contato;

            cout << "Digite o problema do aparelho: ";
            getline(cin, vetor[i].descricaoProblema);

            do
                    {
                        cout << "Informe a data da previsao de entrega: [dd/mm/aaaa]";
                        cin >> vetor[i].previsaoDataEntrega;
                    } while (vetor[i].previsaoDataEntrega.length() != 10);

                    do
                    {
                        cout << "Informe a hora de previsao de entrega: [hh:mm]";
                        cin >> vetor[i].previsaoHoraEtrega;

                    } while (vetor[i].previsaoHoraEtrega .length() != 5);
            }
            
        }}
        
        else return false;
    }
    
    
    return true;
}

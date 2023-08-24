package projeto;

public class Bubble {
    public static void main(String[] args) {
        String texto = "A Reuniao de Camara de Ensino a a oportunidade de compartilhar com corpo academico e tecnico da Universidade Franciscana (UFN) todas as acoes de ensino e as movimentacoes estrategicas pensadas juntamente com os cursos, setores administrativos e grupo da Reitoria. No encontro realizado neste dia 22 de agosto (terca-feira), dois grandes temas nortearam a reuniao realizada no Auditorio do Predio 7 – Conjunto III: a Mostra UFN e o Dashboard UFN.\r\n"
        		+ "A Mostra UFN, que tem proposito de fortalecer os lacos da Universidade com a comunidade, tera a sua edicao de 2023 descentralizada ao ser realizada em outras cidades alem de Santa Maria. Como e o caso de Faxinal do Soturno que recebera a Mostra contemplando todas as cidades da Quarta Colonia, no dia 30 de agosto. Como explicado pela Diretora de Comunicacao, Carina Bohnert e pela Coordenadora de Relacionamento, Laise Chaves, outros municipios tambem estao programados para receber esta acao itinerante que compartilhara a vivencia universitaria a partir de rodas de conversa com egressos locais, espaços de apresentacao de projetos, serviços de apoio a comunidade, workshops, oportunidades e entretenimento. Em Santa Maria, a Mostra ocorre no dia 20 de outubro no Conjunto III da UFN.\r\n"
        		+ "De acordo com a Vice-reitora, professora Solange Binotto Fagan, a Mostra UFN esta alinhada aos objetivos estrategicos do Plano de Desenvolvimento Institucional (PDI) ao fortalecer eixos de trabalho que colaboram o relacionamento politico-institucional; o atendimento a comunidade; inovacao e tecnologia; e o ensino-aprendizagem. “Este modelo de Mostra surgiu da nossa Mostra Extensionista pois, ao ver projetos e ações que geram este grande impacto, percebemos que temos que mostrar mais e expandir estes horizontes”, explica a professora Solange ao se referir a primeira Mostra de Extensão UFN com a Comunidade, realizada em junho deste ano e que apresentou o impacto positivo que da Universidade junto a comunidade que esta inserida.\r\n"
        		+ "Apresentado pelo Diretor Academico Administrativo, Leonardo de Camargo, o Dashboard UFN e uma plataforma web de gestao de dados com a funcao de favorecer o acesso a informacao e de revisitar a base de tipificacao de cadastro do Sistema Academico. Este Painel de Controle com Indicadores foi desenvolvido pelo setor de Tecnologia da Informacao e capitaneado pela Pro-reitora Academica (PROAC) para fornecer, aos coordenadores de cursos e gestores, informações atualizadas em tempo real de modo a registrar os movimentos universitários como processos seletivos, matriculas, ingresso e evasao. Alem de um conhecimento mais aprofundado do ambiente universitario, estas estatisticas tambem servirao de norte para as futuras ações da UFN.";
        
        String[] palavras = texto.strip().split(" ");

        bubbleSort(palavras);

        System.out.println("\nPalavras apos a ordenacao:");
        printArray(palavras);
        System.out.println();
    }

    public static void bubbleSort(String[] texto) {
    	
        int tamanhoTexto = texto.length;
        

        for (int i = 0; i < tamanhoTexto - 1; i++) {

            for (int j = 0; j < tamanhoTexto - i - 1; j++) {
                if (texto[j].compareTo(texto[j + 1]) > 0) {
                  
                    String temp = texto[j];
                    texto[j] = texto[j + 1];
                    texto[j + 1] = temp;
                    
                }
            }
            
        }
        }

    public static void printArray(String[] texto) {
        for (String palavra : texto) {
            System.out.print(palavra + "\n");
        }
        System.out.println();
    }
}


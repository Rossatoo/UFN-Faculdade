package banco;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteContaBancaria {
 public static void main(String[] args) {
     String enderecoServidor = "localhost"; // Endereço do servidor
     int porta = 4213; // Porta do servidor

     try (
         Socket socket = new Socket(enderecoServidor, porta);
         PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
         BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         Scanner scanner = new Scanner(System.in)
     ) {
         System.out.println("Conectado ao servidor de conta bancária!");

         while (true) {
             // Apresenta o menu ao usuário
             System.out.println("\nEscolha uma operação:");
             System.out.println("1. Saque");
             System.out.println("2. Depósito");
             System.out.println("3. Consultar Saldo");
             System.out.println("4. Sair");
             System.out.print("Opção: ");
             int opcao = scanner.nextInt();

             if (opcao == 4) {
                 System.out.println("Encerrando o cliente.");
                 break;
             }

             double valor = 0;
             String operacao = "";

             switch (opcao) {
                 case 1:
                     operacao = "saque";
                     System.out.print("Digite o valor do saque: ");
                     valor = scanner.nextDouble();
                     break;
                 case 2:
                     operacao = "deposito";
                     System.out.print("Digite o valor do depósito: ");
                     valor = scanner.nextDouble();
                     break;
                 case 3:
                     operacao = "saldo";
                     break;
                 default:
                     System.out.println("Opção inválida. Tente novamente.");
                     continue;
             }

             // Envia a operação e o valor (se aplicável) para o servidor
             if (opcao == 1 || opcao == 2) {
                 saida.println(operacao + " " + valor);
             } else {
                 saida.println(operacao);
             }

             // Recebe e exibe a resposta do servidor
             String resposta = entrada.readLine();
             System.out.println("Resposta do servidor: " + resposta);
         }
     } catch (IOException e) {
         System.err.println("Erro ao se comunicar com o servidor: " + e.getMessage());
     }
 }
}

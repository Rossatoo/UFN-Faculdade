package banco;

//ServidorContaBancaria.java

import java.io.*;
import java.net.*;

public class ServidorContaBancaria {
 private static double saldo = 1000.00; // Saldo inicial da conta

 public static void main(String[] args) {
     int porta = 1234; // Porta para o servidor escutar

     try (ServerSocket servidorSocket = new ServerSocket(porta)) {
         System.out.println("Servidor de conta bancária iniciado na porta " + porta);

         while (true) {
             try (
                 Socket clienteSocket = servidorSocket.accept();
                 BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                 PrintWriter saida = new PrintWriter(clienteSocket.getOutputStream(), true)
             ) {
                 String requisicao = entrada.readLine();
                 System.out.println("Requisição recebida: " + requisicao);

                 // Processa a requisição
                 String[] partes = requisicao.split(" ");
                 String operacao = partes[0];
                 double valor = 0;
                 String resposta;

                 switch (operacao) {
                     case "saque":
                         valor = Double.parseDouble(partes[1]);
                         synchronized (ServidorContaBancaria.class) {
                             if (valor <= saldo) {
                                 saldo -= valor;
                                 resposta = "Saque realizado com sucesso. Saldo atual: " + saldo;
                             } else {
                                 resposta = "Erro: Saldo insuficiente para realizar o saque.";
                             }
                         }
                         break;
                     case "deposito":
                         valor = Double.parseDouble(partes[1]);
                         synchronized (ServidorContaBancaria.class) {
                             saldo += valor;
                             resposta = "Depósito realizado com sucesso. Saldo atual: " + saldo;
                         }
                         break;
                     case "saldo":
                         synchronized (ServidorContaBancaria.class) {
                             resposta = "Saldo atual: " + saldo;
                         }
                         break;
                     default:
                         resposta = "Erro: Operação inválida.";
                         break;
                 }

                 // Envia a resposta de volta ao cliente
                 saida.println(resposta);
             } catch (IOException | NumberFormatException e) {
                 System.out.println("Erro ao processar a requisição: " + e.getMessage());
             }
         }
     } catch (IOException e) {
         System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
     }
 }
}


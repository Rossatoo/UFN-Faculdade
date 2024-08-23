package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteCalculadora {

	public static void main(String[] args) {
		String enderecoServidor = "localhost";
		int porta = 4213;
		
		try (
			Socket socket = new Socket(enderecoServidor, porta);
			PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			Scanner scanner = new Scanner(System.in)
		){
			System.out.println("Conectado ao servidor!");
			
			while(true) {
				System.out.println("Escolha uma operacao:");
				System.out.println("1. Soma");
				System.out.println("2. Subtracao");
				System.out.println("3. Multiplicacao");
				System.out.println("4. Divisao");
				System.out.println("5. Sair");
				System.out.print("Opcao: ");
				int opcao = scanner.nextInt();
				
				if(opcao == 5) {
					System.out.println("Encerrando o cliente");
					break;
				}
				
				System.out.println("Digite o primeiro numero: ");
				double num1 = scanner.nextDouble();
				System.out.println("Digite o segundo numero: ");
				double num2 = scanner.nextDouble();
				
				String operacao = "";
				
				switch (opcao) {
					case 1:
						operacao = "soma";
						break;
					case 2:
						operacao = "subtracao";
						break;
					case 3:
						operacao = "multiplicacao";
						break;
					case 4:
						operacao = "divisao";
						break;
					default:
						System.out.println("Opcao invalidade! Tente Novamente");
						continue;
				}
				
				saida.println(operacao + " " + num1 + " " + num2);
				
				String resposta = entrada.readLine();
				System.out.println("Resposta do servidor: " + resposta);
			}
		} catch(IOException e) {
			System.err.println("Erro ao se comunicar com o servidor: " + e.getMessage());
		}

	}

}

package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCalculadora {

	public static void main(String[] args) {
		int porta = 4213;
		
		try(ServerSocket servidorSocket = new ServerSocket(porta)){
			System.out.println("Servidor iniciado na porta " + porta);
			
			while (true) {
				try (
					Socket clienteSocket = servidorSocket.accept();
					BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
					PrintWriter saida = new PrintWriter(clienteSocket.getOutputStream(), true) 
					){
					String requisicao = entrada.readLine();
					System.out.println("Requisicao recebida: " + requisicao);
					
					String[] partes = requisicao.split(" ");
					String operacao = partes[0];
					double num1 = Double.parseDouble(partes[1]);
					double num2 = Double.parseDouble(partes[2]);
					double resultado = 0;
					
					switch (operacao) {
					case "soma":
						resultado = num1 + num2;
						break;
					case "subtracao":
						resultado = num1 - num2;
						break;
					case "multiplicacao":
						resultado = num1 * num2;
						break;
					case "divisao":
						resultado = num1 / num2;
						break;
					default:
						saida.println("Erro: Operacao invalida");
						continue;
					} 
					
					saida.println("resultado: " + resultado);
				} catch(IOException | NumberFormatException e) {
					System.out.println("Erro ao processar a requisicao: " + e.getMessage());
				}
			}
		} catch (IOException e) {
			System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
		}

	}

}

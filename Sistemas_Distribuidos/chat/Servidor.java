
package com.mycompany.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Servidor {
    ArrayList<Socket> listaClientes = new ArrayList<>();
    HashMap<Socket, String> clientesNick = new HashMap<>(); // Mapeia clientes com seus nicknames

    public Servidor() throws IOException {
        try {
            ServerSocket servidor = new ServerSocket(1234);

            while (true) {
                Socket cliente = servidor.accept();
                listaClientes.add(cliente);
                System.out.println("Recebi uma conexão");

                // Thread para cada cliente
                Thread t = new Thread() {
                    Socket meuCliente = cliente;

                    public void run() {
                        try {
                            DataInputStream in = new DataInputStream(meuCliente.getInputStream());
                            DataOutputStream out = new DataOutputStream(meuCliente.getOutputStream());
                            
                            // Recebe o nickname do cliente
                            String nickname = in.readUTF();
                            clientesNick.put(meuCliente, nickname); // Adiciona o nickname do cliente
                            
                            // Notifica todos os clientes sobre o novo cliente conectado
                            enviarParaTodos(nickname + " entrou no chat!");
                            atualizarListaClientes();

                            while (true) {
                                String msgRecebida = in.readUTF();

                                // Repassa a mensagem para todos os clientes
                                enviarParaTodos(nickname + " disse: " + msgRecebida);
                            }
                        } catch (IOException e) {
                            System.out.println("Erro em uma das threads");
                            String nickname = clientesNick.get(meuCliente);
                            listaClientes.remove(meuCliente);
                            clientesNick.remove(meuCliente);

                            // Notifica os clientes sobre a saída
                            enviarParaTodos(nickname + " saiu do chat.");
                            atualizarListaClientes();
                        }
                    }
                };
                t.start();
            }
        } catch (IOException ex) {
            System.out.println("Porta já utilizada");
        }
    }

    // Envia uma mensagem para todos os clientes
    private void enviarParaTodos(String mensagem) {
        for (Socket cli : listaClientes) {
            try {
                DataOutputStream out = new DataOutputStream(cli.getOutputStream());
                out.writeUTF(mensagem);
            } catch (IOException e) {
                System.out.println("Erro ao enviar mensagem para um cliente");
            }
        }
    }

    // Atualiza a lista de clientes conectados
    private void atualizarListaClientes() {
        StringBuilder lista = new StringBuilder("Clientes conectados: ");
        for (String nick : clientesNick.values()) {
            lista.append(nick).append(", ");
        }

        enviarParaTodos(lista.toString());
    }

    public static void main(String[] args) throws IOException {
        Servidor serv = new Servidor();
    }
}

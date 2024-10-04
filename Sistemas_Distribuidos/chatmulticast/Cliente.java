/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.chatmulticast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;


public class Cliente extends javax.swing.JFrame {

    MulticastSocket socket;
    InetAddress grupo;
    int porta = 1234;
    
    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblIP = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        txtMsg = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtClientes = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Multicast");

        lblIP.setText("IP Multicast: ");

        txtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPActionPerformed(evt);
            }
        });

        jLabel1.setText("Nick:");

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel2.setText("Clientes:");

        txtClientes.setColumns(20);
        txtClientes.setRows(5);
        jScrollPane3.setViewportView(txtClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar)))
                    .addComponent(jScrollPane3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        //criar o socket do cliente para se conectar ao servidor
       try{
           this.socket = new MulticastSocket(porta);
           grupo = InetAddress.getByName("224.0.0.1");
           socket.joinGroup(grupo);
           
           txtChat.append("Conectado ao grupo Multicast\n");
           
           enviarMensagemEntrada();
           
           criaThreadRecebimento();
       } catch(Exception ex){
           txtChat.append("Erro ao se conectar ao grupo multicast");
       }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void enviarMensagemEntrada() {
        try {
            String mensagem = "ENTRADA:" + txtNick.getText();
            byte[] buffer = mensagem.getBytes();
            DatagramPacket msgOut = new DatagramPacket(buffer, buffer.length, grupo, porta);
            socket.send(msgOut);
        }catch (IOException ex) {
            txtChat.append("Erro ao enviar mensagem de entrada\n");
           }
    }
    
    private void enviarMensagemSaida() {
    try {
        String mensagem = "SAIDA:" + txtNick.getText();
        byte[] buffer = mensagem.getBytes();
        DatagramPacket msgOut = new DatagramPacket(buffer, buffer.length, grupo, porta);
        socket.send(msgOut);
    } catch (IOException ex) {
        txtChat.append("Erro ao enviar mensagem de saída\n");
    }
}

// Método para ser chamado ao fechar o programa (por exemplo, no evento de fechamento da janela)
private void formWindowClosing(java.awt.event.WindowEvent evt) throws IOException {
    enviarMensagemSaida();
    socket.leaveGroup(grupo); // Cliente sai do grupo multicast
    socket.close();
}
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarMensagem();
    }//GEN-LAST:event_btnEnviarActionPerformed

    
    public void criaThreadRecebimento(){
        Thread t = new Thread(){
            public void run(){
                while(true){
                    try{
                        byte[] buffer = new byte[1024];
                        DatagramPacket msgEnviada = new DatagramPacket(buffer, buffer.length);
                        socket.receive(msgEnviada);                        
                        String mensagemRecebida = new String(msgEnviada.getData(), 0, msgEnviada.getLength());
                        
                        if (mensagemRecebida.startsWith("ENTRADA:")) {
                        // Cliente entrou
                            String nomeCliente = mensagemRecebida.split(":")[1];
                            txtChat.append(nomeCliente + " entrou no chat\n");
                            adicionarCliente(nomeCliente);

                        } else if (mensagemRecebida.startsWith("SAIDA:")) {
                        // Cliente saiu
                            String nomeCliente = mensagemRecebida.split(":")[1];
                            txtChat.append(nomeCliente + " saiu do chat\n");
                            removerCliente(nomeCliente);

                        } else {
                        // Mensagem normal
                            txtChat.append(mensagemRecebida + "\n");
                        }
                                
                    } catch(IOException e){
                        txtChat.append("Erro ao receber mensagem");
                    }
                }
            }
        };
        t.start();
    }
    
    private void adicionarCliente(String nome) {
    txtClientes.append(nome + "\n");
}

private void removerCliente(String nome) {
    String[] clientesAtuais = txtClientes.getText().split("\n");
    StringBuilder clientesAtualizados = new StringBuilder();
    
    for (String cliente : clientesAtuais) {
        if (!cliente.equals(nome)) {
            clientesAtualizados.append(cliente).append("\n");
        }
    }
    
    txtClientes.setText(clientesAtualizados.toString());
}
    
    public void enviarMensagem(){
        try{
            String mensagem = txtNick.getText() + " diz: " + txtMsg.getText();
            byte[] buffer = mensagem.getBytes();
            DatagramPacket msgOut = new DatagramPacket(buffer, buffer.length, grupo, porta);
            socket.send(msgOut);
            
            txtMsg.setText("");
        } catch(IOException ex){
            txtChat.append("Erro ao enviar mensagem");
        }
    }
    
    private void atualizarListaClientes(String listaClientes) {
    // Remove o prefixo "Clientes conectados: " e exibe os nicks no campo de clientes
    String[] clientes = listaClientes.replace("Clientes conectados: ", "").split(", ");
    txtClientes.setText(""); // Limpa a área de texto
    for (String cliente : clientes) {
        txtClientes.append(cliente + "\n"); // Adiciona cada cliente na área de texto
    }
}
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblIP;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextArea txtClientes;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtNick;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multicast.multicastThread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MulticastCommunication {

    private static final String IP_GRUPO = "239.1.2.3";
    private static final int PORTA = 1234;

    public static void main(String[] args) {
        
        Thread receptorThread = new Thread(new Receptor());
        receptorThread.start();

       
        Thread emissorThread = new Thread(new Emissor());
        emissorThread.start();
    }

    static class Emissor implements Runnable {
        @Override
        public void run() {
            try (
                MulticastSocket socket = new MulticastSocket()) {
                InetAddress ipGrupo = InetAddress.getByName(IP_GRUPO);
                Scanner teclado = new Scanner(System.in);

                while (true) {
                    System.out.println("\nDigite a Mensagem: \n");
                    String msg = teclado.nextLine();
                    DatagramPacket mensagem = new DatagramPacket(msg.getBytes(), msg.length(), ipGrupo, PORTA);
                    socket.send(mensagem);
                }
            } catch (IOException ex) {
                System.out.println("Erro de E/S: " + ex.getMessage());
            }
        }
    }

    static class Receptor implements Runnable {
        @Override
        public void run() {
            try (
                MulticastSocket socket = new MulticastSocket(PORTA)) {
                InetAddress ipGrupo = InetAddress.getByName(IP_GRUPO);
                socket.joinGroup(ipGrupo);

                while (true) {
                    byte[] buf = new byte[1000];
                    DatagramPacket pacoteReceber = new DatagramPacket(buf, buf.length);
                    socket.receive(pacoteReceber);

                    String msgRecebida = new String(pacoteReceber.getData(), 0, pacoteReceber.getLength());
                    System.out.println("\nMENSAGEM RECEBIDA: ");
                    System.out.println("Recebi: " + msgRecebida);
                }
            } catch (UnknownHostException ex) {
                System.out.println("IP inválido: " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Erro de E/S: " + ex.getMessage());
            }
        }
    }
}


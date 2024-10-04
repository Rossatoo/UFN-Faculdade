/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tokenring;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

class TokenRing {
    private final int numeroProcessos;
    private final AtomicBoolean[] tokenStatus;
    private int processoAtual = 0;
    
    public TokenRing(int numeroProcessos) { 
        this.numeroProcessos = numeroProcessos;
        this.tokenStatus = new AtomicBoolean[numeroProcessos];
        for (int i = 0; i < numeroProcessos; i++) {
            tokenStatus[i] = new AtomicBoolean(false);
        }
        tokenStatus[0].set(true); // O processo 0 inicia com o token
    }
    
    public void startProcess(int id) {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep((long) (Math.random() * 1000)); // Espera um tempo aleatório
                    if (tokenStatus[id].get()) { //se for true acessa
                        acessaSecaoCritica(id);
                        tokenStatus[id].set(false); // Perde o token após uso
                        passToken(id);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
    
    private void acessaSecaoCritica(int id) {
        System.out.println("Processo " + id + " acessou a seção crítica.");
        try {
            Thread.sleep(500); // Simula o tempo que leva para processar
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    private void passToken(int id) {
        int proxProcesso = (id + 1) % numeroProcessos;
        tokenStatus[proxProcesso].set(true);
        System.out.println("Token passado para o proximo processo: " + proxProcesso);
    }

    public static void main(String[] args) {
        int numeroProcessos = 5;
        TokenRing tokenRing = new TokenRing(numeroProcessos);
        
        for(int i=0; i < numeroProcessos; i++ ){
            tokenRing.startProcess(i);
        }
    }
}


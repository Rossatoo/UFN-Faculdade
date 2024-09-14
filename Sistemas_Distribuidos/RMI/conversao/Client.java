/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
         try{
            IConversorMoedas cm = (IConversorMoedas) Naming.lookup("rmi://localhost/Conversor");
            
            System.out.println("Entre com o valor em Reais que será convertido: ");
            double valorBRL = sc.nextDouble();
            
            while(true){
                System.out.println("Qual operacao voce deseja fazer?");
                System.out.println("1 - Converter para Dolar");
                System.out.println("2 - Converter para Euro");
                System.out.println("3 - Sair");
                int opcao = sc.nextInt();
                
                System.out.println("-------------------------------------------------------------");
            
                if (opcao == 3){
                    System.out.println("Encerrando o cliente!");
                    break;
                }            
            
            switch (opcao){
                case 1:
                    System.out.println("O valor de R$" + valorBRL + " em Dolar eh: US$" + String.format("%.2f",cm.converteParaDolar(valorBRL)));
                    System.out.println("-------------------------------------------------------------");
                    break;
                
                case 2:
                    System.out.println("O valor de R$" + valorBRL + " em Euro eh: €" + String.format("%.2f",cm.converteParaEuro(valorBRL)));
                    System.out.println("-------------------------------------------------------------");
                    break; 
                
                default:
                    System.out.println("Opcao invalida, tente novamente!");
                    continue;
                }
            }
            
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }
    }
    
}

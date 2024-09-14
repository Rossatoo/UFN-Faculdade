/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author mathe
 */
public class ConversorMoedas extends UnicastRemoteObject implements IConversorMoedas{
    
    public ConversorMoedas() throws RemoteException{
        
    }
    
    @Override
    public double converteParaDolar(double valorBRL){
        return valorBRL/5.65;
    }
    
    @Override
    public double converteParaEuro (double valorBRL){
        return valorBRL/6.23;
    }
}

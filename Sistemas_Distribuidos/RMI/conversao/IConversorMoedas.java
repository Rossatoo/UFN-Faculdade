/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conversao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversorMoedas extends Remote{
    
    public double converteParaDolar(double valorBRL) throws RemoteException;
    
    public double converteParaEuro(double valorBRL) throws RemoteException;
}

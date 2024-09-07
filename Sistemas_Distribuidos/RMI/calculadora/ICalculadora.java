/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora  extends Remote{
    
    public double soma(double num1, double num2) throws RemoteException;
    
    public double sub(double num1, double num2) throws RemoteException;
    
    public double mult(double num1, double num2) throws RemoteException;
    
    public double div(double num1, double num2) throws RemoteException;
        
}

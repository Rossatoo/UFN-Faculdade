
package calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Calculadora extends UnicastRemoteObject implements ICalculadora {
    
    public Calculadora() throws RemoteException{
        
    }
    
    public double soma(double num1, double num2) throws RemoteException{
        return num1 + num2;
    }
    
    public double sub(double num1, double num2) throws RemoteException{
        if (num1 < num2){
            return num2 - num1;
            
        }else{
            return num1 - num2;
        }
    }
    
    public double mult(double num1, double num2) throws RemoteException{
        return num1 * num2;
    }
    
    public double div(double num1, double num2) throws RemoteException{
        if (num2 != 0){
            return num1 / num2;
        } else{
            System.out.println("Nao pode ter divisao por 0");
            return 0;
        }
    }
    
}

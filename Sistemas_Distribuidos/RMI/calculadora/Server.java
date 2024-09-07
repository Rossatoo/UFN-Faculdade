/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    String HOST_URL = "rmi://localhost/Calculadora";
    
    public Server(){
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Calculadora objetoRemoto = new Calculadora();
            Naming.bind(HOST_URL, objetoRemoto);
            
            System.out.println("Servidor Rodando!");
        
        }catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    
    public static void main(String args[]){
        new Server();
    }
}

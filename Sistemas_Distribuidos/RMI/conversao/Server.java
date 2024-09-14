package com.mycompany.conversao;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author mathe
 */
public class Server {
    String HOST_URL = "rmi://localhost/Conversor";
    
    public Server(){
        try{
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            ConversorMoedas objetoRemoto = new ConversorMoedas();
            Naming.bind(HOST_URL, objetoRemoto);
            
            System.out.println("Servidor Rodando!");
            
        }catch(Exception e){
            System.out.println("Erro: " + e);
        }
    }
    
    public static void main(String args[]){
        new Server();
    }
}

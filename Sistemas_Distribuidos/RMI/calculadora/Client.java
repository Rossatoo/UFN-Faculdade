
package calculadora;

import java.rmi.Naming;
import java.util.Scanner;


public class Client {
    
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        try{
            ICalculadora c = (ICalculadora) Naming.lookup("rmi://localhost/Calculadora");
            
            System.out.println("Entre com o primeiro numero: ");
            double num1 = sc.nextDouble();
            System.out.println("Entre com o segundo numero: ");
            double num2 = sc.nextDouble();
            
            while(true){
                System.out.println("Qual operacao voce deseja fazer?");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtracao");
                System.out.println("3 - Multiplicacao");
                System.out.println("4 - Divisao");
                System.out.println("5 - Sair");
                int opcao = sc.nextInt();
            
                if (opcao == 5){
                    System.out.println("Encerrando o cliente!");
                    break;
                }
            
            
            switch (opcao){
                case 1:
                    System.out.println("O resultado da soma eh: " + c.soma(num1, num2));
                    break;
                
                case 2:
                    System.out.println("O resultado da subtração eh: " + c.sub(num1, num2));
                    break;
                
                case 3:
                    System.out.println("O resultado da multiplicacao eh: " + c.mult(num1, num2));
                    break;
                
                case 4:
                    System.out.println("O resultado da divisao eh: " + c.div(num1, num2));
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

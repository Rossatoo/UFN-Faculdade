package Exercicio4;

public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        
        carro.acelerar(80);
        System.out.println("Velocidade apos acelerar: "+carro.velocidade);
        carro.frear(50);
        System.out.println("Velocidade apos frear: "+carro.velocidade);
        System.out.println("----------------------------------");

        Veiculo moto = new Moto();
        moto.acelerar(100);
        System.out.println("Velocidade apos acelerara moto: "+moto.velocidade);
        moto.frear(30);
        System.out.println("Velocidade apos frear a moto: "+moto.velocidade);
    }
    
}

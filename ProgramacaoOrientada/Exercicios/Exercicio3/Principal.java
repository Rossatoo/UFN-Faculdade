package Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        
        cachorro.setNome("Wolly");
        cachorro.setIdade(18);
        System.out.println("Nome: "+cachorro.getNome()+ "\tIdade: "+cachorro.getIdade());
        cachorro.emitirSom();
        System.out.println("------------------------------");

        Animal gato = new Gato();
        gato.setNome("Mimi");
        gato.setIdade(15);
        System.out.println("Nome: "+gato.getNome()+ "\tIdade: "+gato.getIdade());
        gato.emitirSom();
        
    }
}

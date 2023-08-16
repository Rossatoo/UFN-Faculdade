package Exercicio4;

public class Carro extends Veiculo {
    
    @Override
    public double acelerar(double qtd) {
        velocidade += qtd;
        return velocidade;
    }

    @Override
    public double frear(double qtd) {
        velocidade -= qtd;
        return velocidade;
    }

}

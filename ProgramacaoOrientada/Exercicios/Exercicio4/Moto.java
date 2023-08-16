package Exercicio4;

public class Moto extends Veiculo {
    
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

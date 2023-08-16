package Exercicio4;

public abstract class Veiculo {
    protected String marca, modelo;
    protected int ano;
    protected double velocidade = 0;

    public abstract double acelerar(double qtd);
    public abstract double frear(double qtd);
}

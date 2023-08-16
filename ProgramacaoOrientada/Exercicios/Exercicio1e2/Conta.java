package Exercicio1e2;
public abstract class Conta{
    protected double saldo, limite;

    public abstract double sacar(double qtd);
    public abstract double depositar(double qtd);
}
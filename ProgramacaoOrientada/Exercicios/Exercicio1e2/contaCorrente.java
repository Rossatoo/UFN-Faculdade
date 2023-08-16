package Exercicio1e2;
public class contaCorrente extends Conta{

    public double sacar(double qtd){
        saldo -= qtd;
        return saldo;
    }

    public double depositar(double qtd){
        saldo += qtd;
        return saldo;
    }
}
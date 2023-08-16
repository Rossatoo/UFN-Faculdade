package Exercicio1e2;
public class contaInvestimento extends Conta{

    public double sacar(double qtd){
        saldo -= qtd;
        return saldo;
    }

    public double depositar(double qtd){
        saldo += qtd;
        return saldo;
    }
}
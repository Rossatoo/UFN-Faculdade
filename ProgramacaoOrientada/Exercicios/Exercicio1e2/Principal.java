package Exercicio1e2;
public class Principal {
    public static void main(String[] args) {
        Conta c = new contaInvestimento();
        c.saldo = 500;
        c.sacar(20);
        c.depositar(30);
        System.out.println("Saldo apos tranferencias: "+c.saldo);
        System.out.println("-------------------");

        Conta c2 = new contaCorrente();
        c2.saldo = 800;
        c2.sacar(50);
        c2.depositar(80);
        System.out.println("Saldo apos tranferencias: "+c2.saldo);
    }
}

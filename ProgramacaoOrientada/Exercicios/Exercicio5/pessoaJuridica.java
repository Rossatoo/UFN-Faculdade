package Exercicio5;

public class pessoaJuridica extends Pessoa {
    String cnpj;

    @Override
    public void efetuarCompra() {
        System.out.println("Efetuando compra no cnpj: "+cnpj);
    }
}

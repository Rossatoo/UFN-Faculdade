package Exercicio5;

public class pessoaFisica extends Pessoa {
   String cpf;

    @Override
    public void efetuarCompra() {
        System.out.println("Efetuando compra no cpf: "+cpf);        
    }
}

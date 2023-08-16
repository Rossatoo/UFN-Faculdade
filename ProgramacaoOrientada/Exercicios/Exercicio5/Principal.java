package Exercicio5;

public class Principal {
    public static void main(String[] args) {
        pessoaFisica fisica = new pessoaFisica();
        fisica.nome = "matheus";
        fisica.cidade = "Santa Maria";
        fisica.cpf = "02188426002";
        
        System.out.println("Nome: "+fisica.nome+ "\tCidade: "+fisica.cidade);
        fisica.efetuarCompra();
        System.out.println("-------------------------");

        pessoaJuridica juridica = new pessoaJuridica();
        juridica.nome = "UFN";
        juridica.cidade = "Mary Sant";
        juridica.cnpj = "0214567000134";
        System.out.println("Nome: "+juridica.nome+ "\tCidade: "+juridica.cidade);
        juridica.efetuarCompra();

    }
    


    





}

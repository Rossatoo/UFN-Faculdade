package TryCatch;

class  Animal {

}

class  Cachorro  extends  Animal {

}

class leao extends Animal{
	
}

public class Exercicio4 {

	public static void main(String[] args) {
		
		  try { String frase = null; int Salario = 5000;
		  
		  frase = frase.toUpperCase();
		  System.out.println("Frase: "+frase);
		  
		  System.out.println("Erro: ");
		  
		  
		  }catch(Exception e) {
			  System.out.println("Erro: "+e.getMessage()); //Nao tem como manipular uma variavel que esta com o valor NULL }
		  }
		 
		
		 try {
             Animal animal =  new  leao (); //
             Cachorro Tommy = (Cachorro) animal;
 
        } catch ( ClassCastException e) {
             System.out.println("Erro: "+e.getMessage());
        }
	}
}

package pacote;

public class Exercicio9 {

	static int primo (int j) {
		int cont = 0;
		
		for(int i = 1; i <= j; i++) {
			if(j % i == 0) 
				cont++;
		}
		
		if(cont == 2)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 50; i++) {
			if(primo(i) == 1)
				System.out.println( i );
		}

	}

}

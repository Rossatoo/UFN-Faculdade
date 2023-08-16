package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto("ABC123", "Exemplo de Produto", 9.99, "Campo temporario");
		
		//Serialização
		try {
			FileOutputStream arquivoSaida = new FileOutputStream("produto.ser");
			ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);
			
			objetoSaida.writeObject(produto);
			objetoSaida.close();
			arquivoSaida.close();
			
			System.out.println("Objeto serializado e salvo em produto.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Desserializacao
		try {
			FileInputStream arquivoEntrada = new FileInputStream("produto.ser");
			ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);
			
			Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
			objetoEntrada.close();
			arquivoEntrada.close();
			
			System.out.println("Objeto Desserializado: " + produtoDesserializado);//chama metodo sobrescrito toString
			System.out.println("Vai apresentar NULL: " + produtoDesserializado.getTemporario());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

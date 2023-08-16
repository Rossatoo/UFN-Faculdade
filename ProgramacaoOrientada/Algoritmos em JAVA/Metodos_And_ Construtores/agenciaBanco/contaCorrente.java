package agenciaBanco;

public class contaCorrente {
	float saldo;
	
	public  void definirSaldoInicial(float saldoC) {
		saldo = saldoC;
	}
	
	public void depositar(float valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(float valor) {
		
		if(saldo > valor) {
		saldo = saldo - valor;
		return true;
	}
		else {
			System.out.println("Saldo insuficiente para realizar o saque!!");
			return false;
		}
	}
}

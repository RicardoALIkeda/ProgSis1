package acmebank;
public class ContaBasica extends Conta {

	public ContaBasica() {
		super();
	}
	
	public ContaBasica(String titular, int agencia, int numConta, double saldo) {
		super(titular, agencia, numConta, saldo);
	}
	
	public boolean saque(double valor) {
		if ((valor > 0) && (valor <= saldo)) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
}

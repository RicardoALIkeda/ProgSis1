package acmebank;
public class Conta {

	private String titular;
	private int agencia;
	private int numConta;
	protected double saldo;

	public Conta() {
		this.titular = "<não informado>";
		this.agencia = 10;
		this.numConta = 1;
		this.saldo = 0;
	}

	public Conta(String titular, int agencia, int numConta, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		if (valor > 0)
			saldo = saldo + valor;
	}

	public String extrato() {
		String txt = "  -:: Banco Money ::-\n";
		txt += "------------------------\n";
		txt += "Titular: " + titular + "\n";
		txt += "Agência: " + agencia + "\n";
		txt += "Conta #: " + numConta + "\n";
		txt += "------------------------\n";
		txt += "Saldo..: " + saldo + "\n";
		txt += "------------------------";

		return txt;
	}

}

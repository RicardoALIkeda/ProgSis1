package acmebank;
public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, int agencia, int numConta, double saldo, double limite) {
		super(titular, agencia, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean saque(double valor) {
		if ((valor > 0) && (valor <= (saldo + limite))) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String extrato() {
		String txt = super.extrato() + "\n";
		txt += "Limite: " + limite + "\n";
		txt += "------------------------\n";
		txt += "Saldo disp: " + (saldo+limite) + "\n";
		txt += "------------------------";
		return txt;
	}
}

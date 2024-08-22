package acmebank;
import java.util.Calendar;

public class ContaPoupanca extends Conta {

	// O atributo saldo, que foi herdado, será utilizado como
	// um totalizador dos montantes parciais.
	
	// Já o atributo saldos armazenará os valores parciais em
    // depositados em cada data.
	protected double[] saldos;

	public ContaPoupanca() {
		super("<Desconhecido>", 0, 0, 0.0);
		this.saldos = new double[32];
	}

	public ContaPoupanca(String titular, int agencia, int numConta, double saldo) {
		super(titular, agencia, numConta, saldo);
		int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		this.saldos = new double[31];
		this.saldos[dia] = saldo;
	}

	public double getSaldo(int dia) {
		return saldos[dia];
	}
	
	public boolean saque(double valor) {
		if ((valor < 0) || (valor > saldo))
			return false;
		else {
			saldo -= valor;
			int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
			while (valor != 0) {
				if (saldos[dia] != 0) {
					if (saldos[dia] >= valor) {
						saldos[dia] -= valor;
						valor = 0;
					}
					else {
						valor -= saldos[dia];
						saldos[dia] = 0;
						dia--;
					}
				}
				else
					dia--;
				if (dia < 1)
					dia = 31;
			}
			return true;
		}
	}

	public void deposito(double valor) {
		if (valor > 0) {
			int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
			this.saldos[dia] += valor;
			this.saldo += valor;
		}
	}
	
	public void deposito(int dia, double valor) {
		if ((valor > 0) && (1 <= dia) && (dia <= 32)) {
			this.saldos[dia] += valor;
			this.saldo += valor;
		}
	}

	public String extrato() {
		String msg = super.extrato();
		msg += "\nSaldos diários:\n";
		for(int dia = 1; dia <= 31; dia++)
			if (saldos[dia] != 0)
				msg += dia + ": " + saldos[dia] + "\n";
		msg += "Saldo total: " + saldo;
		return msg;
	}
}

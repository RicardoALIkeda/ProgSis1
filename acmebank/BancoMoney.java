package acmebank;
public class BancoMoney {

	public static void main(String[] args) {
		
		Conta c = new ContaEspecial();
		System.out.println( c.extrato() );
		
		c = new ContaPoupanca();
		System.out.println( c.extrato() );
		
//		System.out.println("Simulado uma conta de Básica.");
//		ContaBasica cb = new ContaBasica("John Doe", 23, 45678, 123.45);
//		
//		System.out.println("Após a abertura da conta:");
//		System.out.println(cb.extrato());
//		
//		System.out.println("Efetuando um depósito de R$ 2.500,00:");
//		cb.deposito(2500);
//		System.out.println(cb.extrato());
//		
//		System.out.println("Realizando um saque de R$ 2.501,00:");
//		if (cb.saque(2501))
//			System.out.println("Saque efetuado com sucesso.");
//		else
//			System.out.println("Operação não efetuada.");
//		System.out.println(cb.extrato());
//		
//		System.out.println("---------------------------------");
//		System.out.println("Simulado uma conta Especial.");
//		ContaEspecial ce = new ContaEspecial("Jane Doe", 32, 87654, 543.21, 190.87);
//		
//		System.out.println("Após a abertura da conta:");
//		System.out.println(ce.extrato());
//		
//		System.out.println("Efetuando um depósito de R$ 3.000,00:");
//		ce.deposito(3000);
//		System.out.println(ce.extrato());
//		
//		System.out.println("Realizando um saque de R$ 3.700,00:");
//		if (ce.saque(3700))
//			System.out.println("Saque efetuado com sucesso.");
//		else
//			System.out.println("Operação não efetuada.");
//		System.out.println(ce.extrato());
//		
//		System.out.println("---------------------------------");
//		System.out.println("\nSimulado uma conta de Poupança.");
//		
//		ContaPoupanca cp = new ContaPoupanca();
//		cp.setTitular("Elon Musk");
//		cp.setAgencia(12);
//		cp.setNumConta(345678);
//		
//		System.out.println("Após a abertura da conta:");
//		System.out.println(cp.extrato());
//		
//		System.out.println("Efetuado um depósito de R$ 1.000,00 no dia 10.");
//		cp.deposito(10, 1000);
//		System.out.println("Efetuado um depósito de R$ 1.200,00 no dia 12:");
//		cp.deposito(12, 1200);
//		System.out.println("Efetuado um depósito de R$ 800,00 no dia 23:");
//		cp.deposito(23, 800);
//		System.out.println("Efetuado um depósito de R$ 700,00 no dia 31:");
//		cp.deposito(31, 700);
//		System.out.println("Efetuado um depósito de R$ 500,00 hoje:");
//		cp.deposito(500);
//		System.out.println("Após a série de depósitos, temos:");
//		System.out.println(cp.extrato());
//		
//		System.out.println("Realizando um saque de R$ 2.000,00 (que deve usar o saldo de diferentes dias):");
//		if (cp.saque(2000))
//			System.out.println("Saque efetuado com sucesso.");
//		else
//			System.out.println("Operação não efetuada.");
//		System.out.println(cp.extrato());
	}

}

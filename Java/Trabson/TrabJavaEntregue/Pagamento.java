import java.util.Scanner;

public class Pagamento {
    private double valor;
    private String metodoPagamento;

    public Pagamento(double valor, String metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }
    public double getValor() {
        return valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public static Pagamento processarPagamento(Scanner in, double valor) {
        System.out.println("O valor da viagem é: R$ " + valor);
        System.out.print("Digite o método de pagamento (cartão, dinheiro, etc.): ");
        String metodo = in.nextLine();
        return new Pagamento(valor, metodo);
    }    
    public String toString() {
        return "Valor: R$ " + valor + ", Método de Pagamento: " + metodoPagamento;
    }
}
import java.util.Scanner;

public class Ponto {

	String nome;
	public int x, y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
		this.nome = "";
	}

	public Ponto(int x, int y, String nome) {
		this.x = x;
		this.y = y;
		this.nome = nome;
	}

	public Ponto() {

	}
    public static Ponto inPonto(Scanner in, String nomePonto) {
        System.out.println("Do ponto " + nomePonto + "...:");
        System.out.print("  > X: ");
        int x = in.nextInt();
        System.out.print("  > Y: ");
        int y = in.nextInt();
        return new Ponto(x, y);
    }
    
}
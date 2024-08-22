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

    public static double calculaDistanciaEuclidiana(Ponto a, Ponto b) {

        Ponto c = new Ponto(a.x, b.y);
        
        int base = b.x - c.x;

        int altura = a.y - c.y;

        double distancia = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        return distancia;
    }
    static boolean Retangulo(Ponto a, Ponto b, int c) {
        return c >= a.x && c <= b.x && c <= a.y && c >= b.y;
    }
    static boolean Circulo(Ponto a, double b, Ponto c) {
        double distancia = calculaDistanciaEuclidiana(a, c);
        return distancia <= b;
    }
    public static Ponto inPonto(Scanner in, String nomePonto) {
        System.out.println(nomePonto + "...:");
        System.out.print("  > Longitude: ");
        int x = in.nextInt();
        System.out.print("  > Latitude: ");
        int y = in.nextInt();
        return new Ponto(x, y);
    }
}
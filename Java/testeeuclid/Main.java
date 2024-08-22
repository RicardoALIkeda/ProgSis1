import java.util.Scanner;

public class Main {

    // Funções (Problema 1, 2, 3 e 4) - já definidas anteriormente

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problema 1: Distância Euclidiana
        System.out.println("\nProblema 1: Distância Euclidiana");
        System.out.print("Digite as coordenadas do ponto A (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Digite as coordenadas do ponto B (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("Distância Euclidiana entre A e B: " + distancia);

        // Problema 2: Ponto dentro de um retângulo
        System.out.println("\nProblema 2: Ponto dentro de um retângulo");
        System.out.print("Digite as coordenadas do vértice superior esquerdo (A): ");
        double xa = scanner.nextDouble();
        double ya = scanner.nextDouble();
        System.out.print("Digite as coordenadas do vértice inferior direito (B): ");
        double xb = scanner.nextDouble();
        double yb = scanner.nextDouble();
        System.out.print("Digite as coordenadas do ponto a ser verificado (C): ");
        double xc = scanner.nextDouble();
        double yc = scanner.nextDouble();
        if (dentroRetangulo(xa, ya, xb, yb, xc, yc)) {
            System.out.println("Ponto C está dentro do retângulo.");
        } else {
            System.out.println("Ponto C está fora do retângulo.");
        }

        // Problema 3: Ponto dentro de um círculo
        System.out.println("\nProblema 3: Ponto dentro de um círculo");
        System.out.print("Digite as coordenadas do centro do círculo (A): ");
        xa = scanner.nextDouble();
        ya = scanner.nextDouble();
        System.out.print("Digite as coordenadas de um ponto na circunferência (B): ");
        xb = scanner.nextDouble();
        yb = scanner.nextDouble();
        System.out.print("Digite as coordenadas do ponto a ser verificado (C): ");
        xc = scanner.nextDouble();
        yc = scanner.nextDouble();
        if (dentroRetangulo(xa, ya, xb, yb, xc, yc)) {
            System.out.println("Ponto C está dentro do círculo.");
        } else {
            System.out.println("Ponto C está fora do círculo.");
        }

        // Problema 4: Distância ao centro do círculo
        System.out.println("\nProblema 4: Distância ao centro do círculo");
        System.out.print("Digite as coordenadas do centro do círculo (A): ");
        xa = scanner.nextDouble();
        ya = scanner.nextDouble();
        System.out.print("Digite as coordenadas do ponto (C): ");
        xc = scanner.nextDouble();
        yc = scanner.nextDouble();
        double dist = distanciaAoCentro(xa, ya, xc, yc);
        System.out.println("Distância do ponto C ao centro do círculo: " + dist);

        scanner.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularDistancia'");
    }

    private static double distanciaAoCentro(double xa, double ya, double xc, double yc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'distanciaAoCentro'");
    }

    private static boolean dentroRetangulo(double xa, double ya, double xb, double yb, double xc, double yc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dentroRetangulo'");
    }
}
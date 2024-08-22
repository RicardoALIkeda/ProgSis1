public class DistanciaAoCentro {
    public static double calcularDistanciaAoCentro(double xa, double ya, double xc, double yc) {
        return DistanciaEuclidiana.calcularDistancia(xa, ya, xc, yc);
    }

    public static void main(String[] args) {
        double xa = 2, ya = 4, xb = 5, yb = 3, xc = 3, yc = 3.5;
        double distancia = calcularDistanciaAoCentro(xa, ya, xc, yc);
        System.out.println("Distância ao centro: " + distancia);
    }
}
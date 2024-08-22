public class DistanciaEuclidiana {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double base = x2 - x1;
        double altura = y2 - y1;
        return Math.sqrt(base * base + altura * altura);
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 4, x2 = 5, y2 = 3;
        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("Distância: " + distancia);
    }
}
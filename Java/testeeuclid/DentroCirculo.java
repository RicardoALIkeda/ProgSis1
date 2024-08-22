public class DentroCirculo {
    public static boolean verificarDentro(double xa, double ya, double xb, double yb, double xc, double yc) {
        double raio = DistanciaEuclidiana.calcularDistancia(xa, ya, xb, yb);
        double distCentro = DistanciaEuclidiana.calcularDistancia(xa, ya, xc, yc);
        return distCentro <= raio;
    }
}
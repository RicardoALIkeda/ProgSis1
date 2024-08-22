public class Dento {
    static boolean Retangulo(Ponto a, Ponto b, Ponto c) {
        return c.x >= a.x && c.x <= b.x && c.y <= a.y && c.y >= b.y;
    }
    static boolean Circulo(Ponto a, double b, Ponto c) {
        double distancia = DistanciaEuclidiana.calculaDistanciaEuclidiana(a, c);
        return distancia <= b;
    }
}

import java.util.*;
public class Problema3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Ponto a = Ponto.inPonto(in, "A");
        Ponto b = Ponto.inPonto(in, "B");
        Ponto c = Ponto.inPonto(in, "C");
        double r = DistanciaEuclidiana.calculaDistanciaEuclidiana(a, b);
        if (Dento.Circulo(a, r, c)) {
            System.out.println("Ponto está dentro do círculo.");
        } else {
            System.out.println("Ponto está fora do círculo.");
        }
        in.close();
    }
}

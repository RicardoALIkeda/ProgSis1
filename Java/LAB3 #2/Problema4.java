import java.util.*;
public class Problema4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Ponto a = Ponto.inPonto(in, "A");
        Ponto c = Ponto.inPonto(in, "C");
        double distanciaAoCentro = DistanciaEuclidiana.calculaDistanciaEuclidiana(a, c);
        System.out.printf("Distância: %.2f", distanciaAoCentro);
        in.close();
    }
}

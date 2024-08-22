import java.util.*;
public class Problema2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os pontos....");
        Ponto a = Ponto.inPonto(in, "A");
        Ponto b = Ponto.inPonto(in, "B");
        Ponto c = Ponto.inPonto(in, "C");
        if (Dento.Retangulo(a, b, c)) {
            System.out.println("Ponto C está dentro do retângulo.");
        } else {
            System.out.println("Ponto C está fora do retângulo.");
        }      
        in.close();
    }
}
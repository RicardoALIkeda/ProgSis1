public class DentroRetangulo {
    public static boolean verificarDentro(double xa, double ya, double xb, double yb, double xc, double yc) {
        return (xa <= xc && xc <= xb) && (ya >= yc && yc >= yb);
    }

    public static void main(String[] args) {
        double xa = 2, ya = 4, xb = 5, yb = 3, xc = 3, yc = 3.5;
        if (verificarDentro(xa, ya, xb, yb, xc, yc)) {
            System.out.println("Ponto C está dentro do retângulo.");
        } else {
            System.out.println("Ponto C está fora do retângulo.");
        }
    }
}
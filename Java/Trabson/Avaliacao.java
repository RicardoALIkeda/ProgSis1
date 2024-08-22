import java.util.*;
public class Avaliacao {
    private Passageiro passageiro;
    private int nota;
    private String comentario;

    Scanner in = new Scanner(System.in);

    Avaliacao(){

    }

    public Avaliacao(Passageiro passageiro, int nota, String comentario) {
        this.passageiro = passageiro;
        this.nota = nota;
        this.comentario = comentario;
    }    
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void avaliarViagem(){
        System.out.print("Avalie a viagem com uma nota de 1 a 5: ");
        int nota = in.nextInt();
        this.nota = nota;
        System.out.println();
        System.out.print("Comentario: ");
        in.nextLine();
        String comentario = in.nextLine();
        this.comentario = comentario;
        System.out.println();
        System.out.println("Avaliação registrada. ");
    }
    public static void mediaAvaliacao(int a1, int a2, String aa1, String aa2){
                    float media=(a1+ a2)/2.0f;
                    System.out.println();
                    System.out.println("Media de avaliacoes: " + media);
                    System.out.println(a1+" - "+aa1);
                    System.out.println(a2+" - "+aa2);
                    
    }
    public void exibirAvaliacao() {
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Nota: " + nota);
        if (comentario != null && !comentario.isEmpty()) {
            System.out.println("Comentário: " + comentario);
        }
    }
}
import java.util.List;
import java.util.Scanner;

public class Motorista extends Usuario{  
    Motorista(){
        super();
    }

    public Motorista(String nome, String endereco, String email, String telefone, String login, String senha){
        super(nome, endereco, email, telefone, login, senha);
    }
    public static void menu(){
        System.out.println("************CarONE-M************");
        System.out.println("1) Cadastrar uma viagem");
        System.out.println("2) Confirmar uma carona");
        System.out.println("3) Ver suas avaliações e comentários");
        System.out.println("4) Sair");
        System.out.print("Selecione uma opção: ");
    }
    public static void confirmarCarona(Scanner in, List<Viagem> listViagens) {
    System.out.println("Selecione a viagem que deseja confirmar:");
    for (int i = 0; i < listViagens.size(); i++) {
        Viagem viagem = listViagens.get(i);
        System.out.println((i + 1) + ". " + viagem.getDetalhesViagem());
    }
    int escolha = in.nextInt() -1 ;
    if (escolha >= 0 && escolha < listViagens.size()) {
        Viagem viagemSelecionada = listViagens.get(escolha);
        List<Passageiro> passageiros = viagemSelecionada.getPassageiros();

        if (passageiros.isEmpty()) {
            System.out.println("Nenhum passageiro para confirmar nesta viagem.");
        } else {
            System.out.println("Passageiros para confirmar:");
            for (Passageiro passageiro : passageiros) {
                System.out.println("- " + passageiro.getNome());
            }
            System.out.println("Digite 's' para confirmar cada passageiro ou 'n' para recusar.");
            for (Passageiro passageiro : passageiros) {
                System.out.println("Confirmar " + passageiro.getNome() + "? (s/n)");
                String resposta = in.next();
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.println(passageiro.getNome() + " confirmado.");
                } else {
                    System.out.println(passageiro.getNome() + " recusado.");
                }
            }
        }
    } else {
        System.out.println("Escolha inválida.");
    }
}
}
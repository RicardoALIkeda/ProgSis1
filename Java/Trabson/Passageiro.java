public class Passageiro extends Usuario{
    Passageiro(String nome){
        super(nome);
    }
    Passageiro(){
        super();
    }
    public Passageiro(String nome, String endereco, String email, String telefone, String login, String senha){
        super(nome, endereco, email, telefone, login, senha);
    }
    public static void menu(){
        System.out.println("************CarONE-M************");
        System.out.println("1) Buscar Viagem");
        System.out.println("2) Avaliar uma viagem");
        System.out.println("3) Sair");
        System.out.print("Selecione uma opção: ");
    }
}
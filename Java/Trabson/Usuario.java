import java.util.Scanner;

public class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String login;
    private String senha;
    
    Usuario(){        
    }
    public Usuario(String nome){
        this.nome = nome;
    }
    public Usuario(String nome, String endereco,String email, String telefone, String login, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrarUsuario(Scanner in){
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        this.nome = nome;
        System.out.println();
        System.out.println("Digite seu endereco: ");
        String endereco = in.nextLine();
        this.endereco = endereco;
        System.out.println();
        System.out.print("Digite seu email: ");
        String email = in.nextLine();
        this.email = email;
        System.out.println();
        System.out.print("Digite seu telefone: ");
        String telefone = in.nextLine();
        this.telefone = telefone;
        System.out.println();
        System.out.print("Digite seu login: ");
        String login = in.nextLine();
        this.login = login;
        System.out.println();
        System.out.print("Digite sua senha: ");
        String senha = in.nextLine();
        this.senha = senha;
        System.out.println();
     }
}
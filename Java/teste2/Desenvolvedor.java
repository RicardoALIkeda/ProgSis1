import java.util.*;
public class Desenvolvedor {
    private String nome;
    private String area;
    private Squad squad; 
    private List<Requisito> tarefas = new ArrayList<>();       
    public Desenvolvedor(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }
    public Desenvolvedor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public Squad getSquad() {
        return squad;
    }
    public List<Requisito> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Requisito> tarefas) {
        this.tarefas = tarefas;
    }
    public void setSquad(Squad squad) {
        this.squad = squad;
    }
    public void listarTarefas() {
        System.out.println("Tarefas de " + this.nome + ":");
        for (Requisito tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao() + " (Status: " + tarefa.getStatus() + ")");
        }
        
    }
}
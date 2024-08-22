import java.util.*;
public class Projeto {
    private String titulo;
    private String status;
    private List<Requisito> requisitos = new ArrayList<>();
    private Squad squad;    
    public Projeto(String titulo) {
        this.titulo = titulo;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Requisito> getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }
    public Squad getSquad() {
        return squad;
    }
    public void setSquad(Squad squad) {
        this.squad = squad;
    }
    public void adicionarRequisito(Requisito requisito) {
        requisitos.add(requisito);
        requisito.setProjeto(this);
    }
    public void listarRequisitos() {
        System.out.println("Requisitos:");
        for (Requisito req : requisitos) {
            String responsavel = "";
            responsavel = req.getResponsavel().getNome();
            System.out.println("- " + req.getDescricao() + " (Responsável: " +responsavel + ", Status: " + req.getStatus() + ")");
        }
    }

}
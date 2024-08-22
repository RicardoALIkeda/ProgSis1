import java.util.ArrayList;
import java.util.List;

public class Projeto{
    private String titulo;
    private String status;
    private List<Requisito> requisito = new ArrayList<>();
    private Squad squad;

    
    public void adicionarRequisito(Requisito requisito) {
        this.requisito.add(requisito);
        requisito.setProjeto(this); // Estabelece a ligação bidirecional
    }
    public Projeto(String titulo, String status, List<Requisito> requisito, Squad squad) {
        this.titulo = titulo;
        this.status = status;
        this.requisito = requisito;
        this.squad = squad;
    }
    public void setSquad(Squad squad) {
        this.squad = squad;
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
    public List<Requisito> getRequisito() {
        return requisito;
    }
    public void setRequisito(List<Requisito> requisito) {
        this.requisito = requisito;
    }
    


    
}
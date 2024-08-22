import java.util.*;
public class Requisito {
    private int id;
    private String descricao;
    private Date dataPrevista;
    private String status;
    private Desenvolvedor responsavel;
    private Projeto projeto;    
    public Requisito(int id, String descricao, Date dataPrevista, String status) {
        this.id = id;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataPrevista() {
        return dataPrevista;
    }
    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Desenvolvedor getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Desenvolvedor responsavel) {
        this.responsavel = responsavel;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public void atribuir(Desenvolvedor desenvolvedor) {
        this.responsavel = desenvolvedor;
        desenvolvedor.getTarefas().add(this);
    }
    public void concluir() {
        this.status = "Concluído";
        System.out.println("Tarefa '" + this.descricao + "' concluída com sucesso!");
    }
}
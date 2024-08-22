import java.util.*;
public class Requisito {
    private int id;
    private String descricao;
    private Date dataPrevista;
    private String status;
    private Desenvolvedor desenvolvedor;
    private Projeto projeto;
    public Requisito(int id, String descricao, Date dataPrevista, String status, Desenvolvedor desenvolvedor,
            Projeto projeto) {
        this.id = id;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.status = status;
        this.desenvolvedor = desenvolvedor;
        this.projeto = projeto;
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
    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    

    
}

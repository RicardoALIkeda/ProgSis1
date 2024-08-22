import java.util.ArrayList;
import java.util.List;

public class Squad{
    private String designacao;
    private List<Desenvolvedor> desenvolvedor = new ArrayList<>();
    private Projeto projeto;
    
 
    public Squad(String designacao, List<Desenvolvedor> desenvolvedor, Projeto projeto) {
        this.designacao = designacao;
        this.desenvolvedor = desenvolvedor;
        this.projeto = projeto;
    }
    public String getDesignacao() {
        return designacao;
    }
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    public List<Desenvolvedor> getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(List<Desenvolvedor> desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public void adicionarMembro(Desenvolvedor desenvolvedor){
        this.desenvolvedor.add(desenvolvedor);
        desenvolvedor.setSquad(this);
    }
    public void adicionarProjeto(Projeto projeto) {
        this.projeto.add(projeto);
        projeto.setSquad(this); // Maintain bidirectional link if needed
    }


}
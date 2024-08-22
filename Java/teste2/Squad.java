import java.util.*;
public class Squad {
    private String designacao;
    private List<Desenvolvedor> membros = new ArrayList<>();
    private List<Projeto> projetos = new ArrayList<>();   
    public Squad(String designacao) {
        this.designacao = designacao;
    }
    public String getDesignacao() {
        return designacao;
    }
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public List<Desenvolvedor> getMembros() {
        return membros;
    }
    public void setMembros(List<Desenvolvedor> membros) {
        this.membros = membros;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    public void adicionarMembro(Desenvolvedor desenvolvedor) {
        membros.add(desenvolvedor);
        desenvolvedor.setSquad(this);
    }
    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
        projeto.setSquad(this); 
    }
    public void listarEquipe() {
        if (membros.isEmpty()) {
            System.out.println("A equipe está vazia.");
        } else {
            System.out.println("Membros da equipe " + designacao + ":");
            for (Desenvolvedor dev : membros) {
                System.out.println("- " + dev.getNome() + " (" + dev.getArea() + ")");
            }
        }
    }
    public void listarProjetos() {
        System.out.println();
            System.out.println("Projetos da equipe " + designacao + ":");
            for (Projeto projeto : projetos) {
                System.out.println("- " + projeto.getTitulo());
            }
    }

}
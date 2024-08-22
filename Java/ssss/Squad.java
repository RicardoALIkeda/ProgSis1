public class Squad {

    private String designação;
    private List<Desenvolvedor> membros;
    private List<Projeto> projetos;

    public Squad() {
        membros = new ArrayList<>();
        projetos = new ArrayList<>();
    }

    public String getDesignação() {
        return designação;
    }

    public void setDesignação(String designação) {
        this.designação = designação;
    }

    public List<Desenvolvedor> getMembros() {
        return membros;
    }

    public void adicionarMembro(Desenvolvedor membro) {
        membros.add(membro);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void listarEquipe() {
        
    }

    public void listarProjetos() {
       
    }
}
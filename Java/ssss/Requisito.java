public class Requisito {

    private int id;
    private String descrição;
    private Projeto projeto;

    public Requisito() {
       
    }

    public Requisito(String descrição) {
        this.descrição = descrição;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void listarRequisitos() {
        
    }
}
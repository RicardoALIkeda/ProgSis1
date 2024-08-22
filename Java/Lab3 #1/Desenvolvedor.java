public class Desenvolvedor {
    private String nome;
    private String area;
    private Requisito requisito;
    private Squad squad;
    public Desenvolvedor(String nome, String area, Requisito requisito) {
        this.nome = nome;
        this.area = area;
        this.requisito = requisito;
    }
    public void setSquad(Squad squad) {
        this.squad = squad;
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
    public Requisito getRequisito() {
        return requisito;
    }
    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }


}

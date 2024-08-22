public class Projeto {

    private String título;
    private String status;
    private Date dataPrevista;
    private List<Requisito> requisitos;
    private Desenvolvedor responsável;

    public Projeto() {
        requisitos = new ArrayList<>();
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void adicionarRequisito(Requisito requisito) {
        requisitos.add(requisito);
    }

    public Desenvolvedor getResponsável() {
        return responsável;
    }

    public void atribuirResponsável(Desenvolvedor responsável) {
        this.responsável = responsável;
    }

    public void concluir() {
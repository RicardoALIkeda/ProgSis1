public class Carro extends Veiculo {
    protected int numPortas;
    protected int cambio;
    protected boolean automatico;

    public Carro(){
        super();
        numPortas = 0;
        cambio = 0;
        automatico = false;
    }
    public Carro(String fabricante, String modelo, String cor, int numPortas, int cambio, boolean automatico) {
        super(fabricante, modelo, cor);
        this.numPortas = numPortas;
        this.cambio = cambio;
        this.automatico = automatico;
    }
    
    public int getNumPortas() {
        return numPortas;
    }    
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getCambio() {
        return cambio;
    }
    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
}

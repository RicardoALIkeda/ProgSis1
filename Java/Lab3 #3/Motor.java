public class Motor {
    private int numCilindros;
    private int cilindradas;
    private String combustivel;
    private int potencia;
    private boolean turbo;

    public Motor(){
        numCilindros = 0;
        cilindradas = 0;
        combustivel = "";
        potencia = 0;
        turbo = false;
    }    
    public Motor(int numCilindros, int cilindradas, String combustivel, int potencia, boolean turbo) {
        this.numCilindros = numCilindros;
        this.cilindradas = cilindradas;
        this.combustivel = combustivel;
        this.potencia = potencia;
        this.turbo = turbo;
    }
    
    public int getNumCilindros() {
        return numCilindros;
    }
    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public boolean isTurbo() {
        return turbo;
    }
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    
    

}
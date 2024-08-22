public class Veiculo {
    protected String fabricante;
    protected String modelo;
    protected String cor;
    private Motor motor;

    public Veiculo(){
        fabricante = "";
        modelo = "";
        cor = "";
    }
    public Veiculo(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public static void exibir(Veiculo veiculo) {
        System.out.println("Fabricante: " + veiculo.getFabricante());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Cor: " + veiculo.getCor());
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.println("Numero de portas: " + carro.getNumPortas());
            System.out.println("Automatico: " + carro.isAutomatico());
            System.out.println("Numero de marchas: " + carro.getCambio());
        } else if (veiculo instanceof Caminhao) {
            Caminhao caminhao = (Caminhao) veiculo;
            System.out.println("Capacidade de carga: " + caminhao.getCapacidadedeCarga() + "Kg");
            System.out.println("Quantidade de eixos: " + caminhao.getQtdeEixos());
        }
        Motor motor = veiculo.getMotor();        
        System.out.println("Numero de cilindros: " + motor.getNumCilindros());
        System.out.println("Cilindradas: " + motor.getCilindradas() + "cc");
        System.out.println("Combustível: " + motor.getCombustivel());
        System.out.println("Potencia: " + motor.getPotencia() + "cv");
        System.out.println("Turbo: " + motor.isTurbo());      
        System.out.println("__________________________________");
    }
}

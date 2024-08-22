public class Caminhao extends Veiculo {
    protected double capacidadedeCarga;
    protected int qtdeEixos;

    public Caminhao(){
        super();
        capacidadedeCarga = 0.0;
        qtdeEixos = 0;
    }
    public Caminhao(String fabricante, String modelo, String cor, double capacidadedeCarga, int qtdeEixos) {
        super(fabricante, modelo, cor);
        this.capacidadedeCarga = capacidadedeCarga;
        this.qtdeEixos = qtdeEixos;
    }

    public double getCapacidadedeCarga() {
        return capacidadedeCarga;
    }
    public void setCapacidadedeCarga(double capacidadedeCarga) {
        this.capacidadedeCarga = capacidadedeCarga;
    }
    public int getQtdeEixos() {
        return qtdeEixos;
    }
    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }      
}

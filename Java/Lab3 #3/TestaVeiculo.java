public class TestaVeiculo {
    public static void main(String[] args) {
        Motor mf = new Motor(8, 3588, "Gasolina", 620, true);
        Carro ferrari = new Carro("Ferrari", "Roma Spider", "Vermelho", 2, 7, true);
        System.out.println("__________________________________");
        ferrari.setMotor(mf);
        Motor ms = new Motor(6, 13000, "Diesel/Biodisel", 450, false);
        Caminhao scania = new Caminhao("Scania", "R450", "Preto", 666.666, 4);
        scania.setMotor(ms);
        Veiculo.exibir(ferrari);
        Veiculo.exibir(scania);
    }
}
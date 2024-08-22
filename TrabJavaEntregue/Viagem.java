import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viagem {
    private int qtdLugar;
    private int[] partida = new int[2];
    private int[] destino = new int[2];
    private ArrayList<Integer> parada = new ArrayList<Integer>();
    private ArrayList<Integer> parada1 = new ArrayList<Integer>();
    private ArrayList<String> listPass = new ArrayList<String>();
    private double preco;
    private List<Passageiro> passageiros = new ArrayList<>();
    private List<Ponto> pontosEmbarque = new ArrayList<>();
    private List<Ponto> pontosDesembarque = new ArrayList<>();  
    
    public Viagem(int qtdLugar, int[] partida, int[] destino, ArrayList<Integer> parada, ArrayList<Integer> parada1,
            double preco, List<Passageiro> passageiros) {
        this.qtdLugar = qtdLugar;
        this.partida = partida;
        this.destino = destino;
        this.parada = parada;
        this.parada1 = parada1;
        this.preco = preco;
        this.passageiros = passageiros;
    }


    public Viagem(int qtdLugar, int[] partida, int[] destino, ArrayList<Integer> parada, ArrayList<Integer> parada1,
            List<Passageiro> passageiros) {
        this.qtdLugar = qtdLugar;
        this.partida = partida;
        this.destino = destino;
        this.parada = parada;
        this.parada1 = parada1;
        this.passageiros = passageiros;
    }


    public Viagem(int qtdLugar, int[] partida, int[] destino, ArrayList<Integer> parada, ArrayList<Integer> parada1) {
        this.qtdLugar = qtdLugar;
        this.partida = partida;
        this.destino = destino;
        this.parada = parada;
        this.parada1 = parada1;
    }
    public Viagem() {
        this.passageiros = new ArrayList<>();
    }
    public int getQtdLugar() {
        return qtdLugar;
    }
    public void setQtdLugar(int qtdLugar) {
        this.qtdLugar = qtdLugar;
    }    
    public ArrayList<String> getListPass() {
        return listPass;
    }
    public void setListPass(ArrayList<String> listPass) {
        this.listPass = listPass;
    }
    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    public int[] getPartida() {
        return partida;
    }
    public void setPartida(int[] partida) {
        this.partida = partida;
    }
    public int[] getDestino() {
        return destino;
    }
    public void setDestino(int[] destino) {
        this.destino = destino;
    }
    public ArrayList<Integer> getParada() {
        return parada;
    }
    public void setParada(ArrayList<Integer> parada) {
        this.parada = parada;
    }
    public ArrayList<Integer> getParada1() {
        return parada1;
    }
    public void setParada1(ArrayList<Integer> parada1) {
        this.parada1 = parada1;
    }
    public void addPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }
    public List<Passageiro> getPassageiros() {
        return this.passageiros;
    }
    public void cadastrarViagem(Scanner in){
        System.out.print("Quantidade de lugares disponíveis: ");
        int qtdLugar = in.nextInt();
        this.qtdLugar = qtdLugar;
        in.nextLine();
        System.out.println();
        System.out.println("Partida ...:");
        System.out.print("  > Latitude: ");
        partida[0] = in.nextInt();
        this.partida[0] = partida[0];
        System.out.print("  > Longitude: ");
        partida[1] = in.nextInt();
        this.partida[1] = partida[1];
        System.out.println("Destino ...:");
        System.out.print("  > Latitude: ");
        destino[0] = in.nextInt();
        this.destino[0] = destino[0];
        System.out.print("  > Longitude: ");
        destino[1] = in.nextInt();
        this.destino[1] = destino[1];
        System.out.println("Quantidade de paradas?");
        int qntdParada = in.nextInt();
        for(int i=1; i<=qntdParada; i++){
            System.out.println("Parada "+qntdParada+" ...:");
            System.out.print("  > Latitude: ");
            parada.add(in.nextInt());    
            System.out.print("  > Longitude: ");
            parada1.add(in.nextInt());
            System.out.println("Preco:");
            this.preco = in.nextDouble();
        }    
        
    }
    public boolean isWithinRange(Ponto partidaPassageiro, Ponto destinoPassageiro, double maxDistance) {
        double distPartida = Ponto.calculaDistanciaEuclidiana(partidaPassageiro, new Ponto(partida[0], partida[1]));
        double distDestino = Ponto.calculaDistanciaEuclidiana(destinoPassageiro, new Ponto(destino[0], destino[1]));
        return distPartida <= maxDistance && distDestino <= maxDistance;
    }
    public String getDetalhesViagem() {
        String detalhes = 
                "Partida: (" + partida[0] + ", " + partida[1] + ")\n" +
                "Destino: (" + destino[0] + ", " + destino[1] + ")\n" +
                "Paradas " + "\n" +
                "   Latitude: " +parada.toString().replace("[", "").replace("]", "") +  "\n" +
                "   Longitude: " +parada1.toString().replace("[", "").replace("]", "") + "\n" +
                "Lugares: " + qtdLugar + "\n"+"Preco: R$ " + preco + "\n";

        return detalhes;
    }
    public boolean adicionarPassageiro(Passageiro passageiro, Ponto embarque, Ponto desembarque) {
        if (passageiros.size() < qtdLugar) {
            passageiros.add(passageiro);
            pontosEmbarque.add(embarque);
            pontosDesembarque.add(desembarque);
            qtdLugar--;
            return true;
        } else {
            return false;
        }
    }
}
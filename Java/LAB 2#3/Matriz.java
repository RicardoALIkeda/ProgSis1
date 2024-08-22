public class Matriz{
    String[][] matriz = new String[6][6];

    void Recupera(int x, int y){
        System.out.println("Valor em ["+x+"] ["+y+"] = "+ matriz[x][y]);
    }
    void Armazena(int x, int y, String z){
        matriz[x][y]=z;
        System.out.println("Informaçao: "+z+" , armazenada em ["+x+"] ["+y+"]");
    }
    void RetornaLinha(int y){
        System.out.print("Linha "+y+" : ");
        for(int i=2; i<6;i++){
            System.out.print(matriz[y][i]+" | ");
        }
        System.out.println();       
    }
    void PreencheLinha(int y, String[] x){
        for(int i=0; i<6; i++){
            matriz[y][i]= x[i];
        }
    }
    void ValorTotal(){
        double[][] matrizDouble = new double[matriz.length][matriz[0].length];
        for(int i=1; i<matriz.length; i++){
            for(int j=1; j<matriz[i].length; j++){
                matrizDouble[i][j]= Double.parseDouble(matriz[j][i]);
            }
        }
        for(int j=1; j<matriz.length; j++){
            for(int i=1; i<matriz.length; i++){
                matrizDouble[j][0]+=matrizDouble[j][i];
            }
             
        }   
        for(int i=2; i<matriz.length; i++)  {
            System.out.println("Total de "+matriz[0][i]+" : "+matrizDouble[i][0]);  
        }
        
    }
    void TituloColuna(int x, String y){
        matriz[0][x]=y;
        System.out.println("Titulo: "+y+" Atribuido");
    }
    void PreencheTitulo(String[] x){
        for(int i=1; i<5; i++){
            matriz[0][i+1]= x[i-1];
        }
    }
    void exibir(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
    }



}
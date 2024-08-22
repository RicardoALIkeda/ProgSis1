/*Ricardo Andre Lopes Ikeda 
 10390256
 10390256@mackenzista.com.br
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        int [] arr = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int n=0;
        for(int i=0; i<arr.length; i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
                n = i;
            }
        }        
        System.out.println("Maior valor: "+arr[0]+" , na posicao: "+n);
        in.close();
    }
}
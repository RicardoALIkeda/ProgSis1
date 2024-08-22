import java.util.*;
/*Ricardo Andre Lopes Ikeda 
 10390256
 10390256@mackenzista.com.br
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de elementos do conjunto: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;n>i;i++){
            System.out.print("Informe o "+(i+1)+"º elemento: ");
            arr[i] = in.nextInt();     
        }
        System.out.print("Dados na ordem original: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
            if (i<n-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int z = 0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0) {
                int t = arr[z];
                arr[z] = arr[i];
                arr[i] = t;
                z++;
            }
        }
        System.out.print("Dados reorganizados....: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
            if (i<n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        in.close();
    }
}
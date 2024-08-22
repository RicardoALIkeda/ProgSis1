import java.util.*;
public class MainTeste{
    public static void main(String[] args){
        int[] v = {1,2,3,4,5};
        for(int i = 1; i<v.length;i++){
            v[i-1] = v[i];
            v[i] = v[i-1];
        }
        for(int i=0; i<v.length; i++){
            System.out.print(v[i]);
        }
    }
}
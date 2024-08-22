/*Ricardo Andre Lopes Ikeda 
 10390256
 10390256@mackenzista.com.br

 *OBS*: em minha IDE houve um erro ao usar "." para a entrada do
scanner, tive de optar pelo uso de "," para o teste.
*/

import java.util.*;
public class Main {

    static float calcArea(float b, float h){
        return b*h;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        float b = in.nextFloat();
        System.out.print("Altura: ");
        float h = in.nextFloat();
        System.out.println("Area: "+calcArea(b, h));
        System.out.printf("Area: %.2f",calcArea(b, h));


        in.close();

    }
    
}

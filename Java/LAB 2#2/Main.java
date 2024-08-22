import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CPF x = new CPF();
        System.out.println("UTILIZE O PADRAO XXX.XXX.XXX-XX");
        System.out.print("Digite o CPF: ");
        x.cpf = in.nextLine();
        x.ConverteCPF();
        in.close();

    }
    
}

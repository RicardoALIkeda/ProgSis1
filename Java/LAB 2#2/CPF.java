public class CPF{
    String cpf;
    CPF(){
        cpf = "XXX.XXX.XXX-XX";
    }
    void ConverteCPF(){
        String cpf1 = cpf.replace(".","");
        cpf1 = cpf1.replace("-","");
        char[] sla = cpf1.toCharArray();
        int[] cpfArr = new int[cpf1.length()];
        int[] arr = new int[11];
        int digito1 , digito2;   
        int soma = 0;
        int x = 10;

        for(int i=0; i<cpf1.length(); i++){
            cpfArr[i]= Character.digit(sla[i], 10);
        }
        for(int i=0; i<9; i++){
            arr[i]=cpfArr[i]*x;
            x--;
        }
        for(int i=0; i<=9; i++){
            soma+=arr[i];
        }
        if((soma%11)<2){
            digito1=0;
        }else{
            digito1=11-(soma%11);
        } 
        //etapa 2
        x=11;
        for(int i=0; i<10; i++){
            arr[i]=cpfArr[i]*x;
            x--;     
        }
        soma = 0;
        for(int i=0; i<10; i++){
            soma+=arr[i];
        }
        if((soma%11)<2){
            digito2=0;
        }else{
            digito2=11-(soma%11);
        }
        if(cpfArr[9]==digito1 && cpfArr[10]==digito2){
            System.out.println("CPF VERDADEIRO");
            System.out.println(cpf);
        }else{
            System.out.println("CPF FALSO");
        }
    }
}
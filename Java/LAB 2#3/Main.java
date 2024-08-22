public class Main {
    public static void main(String[] args){
        Matriz x = new Matriz();
        x.matriz[0][1]="Filial";
        x.matriz[0][0]=" ";
        x.matriz[1][0]="1";
        x.matriz[2][0]="2";
        x.matriz[3][0]="3";
        x.matriz[4][0]="4";
        x.matriz[5][0]="5";
        x.Armazena(3, 3, "55");
        String[] dados = {"1","101   ","345     ","477    ","545     ","645     "};
        String[] dados1 = {"2","202   ","354     ","22     ","555     ","6654    "};
        String[] dados2 = {"3","303   ","334     ","45     ","455     ","5466    "};
        String[] dados3 = {"4","404   ","3546    ","445    ","554     ","6666    "};
        String[] dados4 = {"5","505   ","3546    ","445    ","54      ","666     "};
        String[] titulos = {"Setembro","Outubro","Novembro","Dezembro","aa"};
        x.PreencheTitulo(titulos);
        x.PreencheLinha(1, dados);
        x.RetornaLinha(1);
        x.PreencheLinha(2, dados1);
        x.PreencheLinha(3, dados2);
        x.PreencheLinha(4, dados3);
        x.PreencheLinha(5, dados4);
        x.Recupera(3, 3);
        x.ValorTotal();
        x.TituloColuna(3, "Janeiro");
        x.exibir();
    }
    
}

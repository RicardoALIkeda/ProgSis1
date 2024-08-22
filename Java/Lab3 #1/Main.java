public class Main {
    public static void main(String[] args){
        Desenvolvedor d1 = new Desenvolvedor("Ricardo","Maluquisse", null);
        Desenvolvedor d2 = new Desenvolvedor("Alaor", "3", null);
        Desenvolvedor d3 = new Desenvolvedor("Olair", "aerolito", null);

        Squad squad = new Squad("ss", null, null);
        squad.adicionarMembro(d1);
        squad.adicionarMembro(d2);
        squad.adicionarMembro(d3);

        Projeto projeto = new Projeto(null, null, null, squad);
        projeto.setSquad(squad);
        squad.adicionarProjeto();
    }
    
}

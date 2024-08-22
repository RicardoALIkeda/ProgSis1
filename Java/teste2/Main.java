import java.util.*;
public class Main {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Ricardo", "Back-end");
        Desenvolvedor d2 = new Desenvolvedor("Alaor", "Front-end");
        Desenvolvedor d3 = new Desenvolvedor("Olair", "Back-end");

        Squad squad = new Squad("Squad Projeto Final");
        squad.adicionarMembro(d1);
        squad.adicionarMembro(d2);
        squad.adicionarMembro(d3);

        Projeto projeto = new Projeto("Projeto Final da Disciplina");
        projeto.setSquad(squad);
        squad.adicionarProjeto(projeto);
        
        Requisito r1 = new Requisito(1, "Analise de requisitos", new Date(), "Em andamento");
        Requisito r2 = new Requisito(2, "Design da interface", new Date(), "Nao iniciado");
        Requisito r3 = new Requisito(3, "Implementaçao back-end", new Date(), "Finalizado");
        Requisito r4 = new Requisito(4, "Desenvolvimento front-end", new Date(), "Em andamento");
        Requisito r5 = new Requisito(5, "Testes unitarios", new Date(), "Nao iniciado");
        Requisito r6 = new Requisito(6, "Integraçao e testes finais", new Date(), "Nao iniciado");

        projeto.adicionarRequisito(r1);
        projeto.adicionarRequisito(r2);
        projeto.adicionarRequisito(r3);
        projeto.adicionarRequisito(r4);
        projeto.adicionarRequisito(r5);
        projeto.adicionarRequisito(r6);

        r1.atribuir(d1);
        r2.atribuir(d2);
        r3.atribuir(d3);
        r4.atribuir(d1);
        r5.atribuir(d2);
        r6.atribuir(d3);

        System.out.println("____________________________________________________________________________________");
        System.out.println("Situaçao do Projeto: " + projeto.getTitulo());
        projeto.listarRequisitos(); 
        System.out.println("____________________________________________________________________________________");
        squad.listarProjetos();
        System.out.println();
        squad.listarEquipe();
        System.out.println();
        d1.listarTarefas();
        System.out.println();
        d2.listarTarefas();
        System.out.println();
        d3.listarTarefas();    
        System.out.println("____________________________________________________________________________________");  
        r1.concluir();  
        System.out.println();
    }
}
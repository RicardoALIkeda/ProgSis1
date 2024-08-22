public class Main {

    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("João Silva", "Backend");
        Desenvolvedor dev2 = new Desenvolvedor("Maria Souza", "Frontend");

        Squad squad1 = new Squad();
        squad1.setDesignação("Squad Ágil");
        squad1.adicionarMembro(dev1);
        squad1.adicionarMembro(dev2);

        Projeto projeto1 = new Projeto();
        projeto1.setTítulo("Sistema de Vendas");
        projeto1.setStatus("Em Andamento");
        projeto1.setDataPrevista(new Date(2024, 05, 31)); 
        projeto1.atribuirResponsável(dev1);

        Requisito requisito1 = new Requisito("Carrinho de Compras");
        projeto1.adicionarRequisito(requisito1);


        System.out.println("Desenvolvedores:");
        System.out.println(dev1); // Exibe informações do desenvolvedor 1
        System.out.println(dev2); // Exibe informações do desenvolvedor 2

        System.out.println("\nSquad:");
        System.out.println("Designação: " + squad1.getDesignação());
        System.out.println("Membros:");
        for (Desenvolvedor membro : squad1.getMembros()) {
            System.out.println(membro.getNome()); 
        }

        System.out.println("\nProjeto:");
        System.out.println("Título: " + projeto1.getTítulo());
        System.out.println("Status: " + projeto1.getStatus());
        System.out.println("Data Prevista: " + projeto1.getDataPrevista());
        System.out.println("Responsável: " + projeto1.getResponsável().getNome());

        System.out.println("\nRequisito:");
        System.out.println("Descrição: " + requisito1.getDescrição());
        System.out.println("Projeto: " + requisito1.getProjeto().getTítulo()); 
    }
}

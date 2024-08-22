import java.util.*;
/*Nome - TIA / RA
 Ricardo Andre Lopes Ikeda - 32158378 / 10390256
 Diego Estevao Lopes de Queiroz - 32361262 / 10419038
 */
public class Main {
    public static void main(String[] args) {
        int i,t;        
        List<Viagem> viagensCompativeis = new ArrayList<>();
        List<Viagem> listViagens = new ArrayList<>();
        ArrayList<Integer> latp1 = new ArrayList<Integer>(Arrays.asList(13));
        ArrayList<Integer> longp1 = new ArrayList<Integer>(Arrays.asList(14));
        ArrayList<Integer> latp2 = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17));
        ArrayList<Integer> longp2 = new ArrayList<Integer>(Arrays.asList(13,14,15,16));
        ArrayList<Integer> latp3 = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19));
        ArrayList<Integer> longp3 = new ArrayList<Integer>(Arrays.asList(16,17,18,19,20,21,22,23,24,25,26,27,28,29));
        Passageiro newPassageiro1 = new Passageiro("Pinduca");
        Passageiro newPassageiro2 = new Passageiro("Renato Cariani");
        Passageiro newPassageiro3 = new Passageiro("Jorlan Vieira");
        Passageiro newPassageiro4 = new Passageiro("Valdemar Guimaraes");
        Passageiro newPassageiro5 = new Passageiro("Julio balesgreen");
        Passageiro newPassageiro6 = new Passageiro("Mauriciao");
        List<Passageiro> listPass1 = new ArrayList<>();
        List<Passageiro> listPass2 = new ArrayList<>();
        listPass1.add(newPassageiro1);
        listPass1.add(newPassageiro2);
        listPass1.add(newPassageiro3);
        listPass1.add(newPassageiro4);
        listPass2.add(newPassageiro5);
        listPass2.add(newPassageiro6);
        int [] pv1 ={12,13};
        int [] dv1 ={14,15};
        int [] pv2 ={10,17};
        int [] dv2 ={18,12};
        int [] pv3 ={10,30};
        int [] dv3 ={20,15};
        
        Viagem v1 = new Viagem(2,pv1,dv1,latp1,longp1,11.90,listPass1);
        Viagem v2 = new Viagem(0,pv2,dv2,latp2,longp2,35.40,listPass2);
        Viagem v3 = new Viagem(5,pv3,dv3,latp3,longp3);
        Viagem v4 = new Viagem();
        listViagens.add(v1);
        listViagens.add(v2);
        listViagens.add(v3);

        List<Motorista> listMotoristas = new ArrayList<>();
        Motorista m1 = new Motorista("Olair", "morumba", "olair24@gmail.com", "11971729560", "olair13", "batatinha");
        Motorista m2 = new Motorista("1", "1", "1", "1", "1", "1"); //TESTE
        Motorista m3 = new Motorista();
        listMotoristas.add(m1);
        listMotoristas.add(m2);

        List<Passageiro> listPassageiros = new ArrayList<>();
        Passageiro p1 = new Passageiro("Olair", "egeanopoli", "olair24@gmail.com", "11971729560", "olair13","batatinha");
        Passageiro p2 = new Passageiro("2", "2", "2", "2", "2", "2"); //TESTE
        Passageiro p3 = new Passageiro();
        listPassageiros.add(p1);
        listPassageiros.add(p2);
        List<Avaliacao> listAvaliacoes = new ArrayList<>();
        Avaliacao a1 = new Avaliacao(p1, 2, "muito ruim");
        Avaliacao a2 = new Avaliacao(p2, 5, "muito bom");
        Avaliacao a3 = new Avaliacao();
        listAvaliacoes.add(a1);
        listAvaliacoes.add(a2);

        Scanner in = new Scanner(System.in);
        System.out.print("Como deseja logar? " + "\n" + "1)Motorista" + "\n" + "2)Passageiro" + "\n");
        System.out.print("Digite a opção desejada: ");
        int user = in.nextInt();
        String nomeLogin = "";
        String senhaLogin = "";
        Usuario loggedInUsuario = null;
        Usuario loggedInSenha = null;
        int x = 1;
        System.out.println(user);
        do {
            System.out.println("1)Login");
            System.out.println("2)Cadastrar um novo usuário");
            t = in.nextInt();
            in.nextLine();
            if (t == 1) {
                if (user == 1) {//Verificação login motorista
                    System.out.print("Digite seu nome: ");
                    nomeLogin = in.nextLine();
                    System.out.println("");
                    System.out.print("Digite sua senha: ");
                    senhaLogin = in.nextLine();
                    for (Usuario usuarioLogin : listMotoristas) {
                        if (usuarioLogin.getNome().equals(nomeLogin)) {
                            loggedInUsuario = usuarioLogin;
                            if (usuarioLogin.getSenha().equals(senhaLogin)) {
                                System.out.println("** ACESSO GARANTIDO **");
                                loggedInSenha = usuarioLogin;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                } else if (user == 2) {//Verificação login passageiro
                    System.out.print("Digite seu nome: ");
                    nomeLogin = in.nextLine();

                    System.out.println("");
                    System.out.print("Digite sua senha: ");
                    senhaLogin = in.nextLine();
                    for (Usuario usuarioLogin : listPassageiros) {
                        if (usuarioLogin.getNome().equals(nomeLogin)) {
                            loggedInUsuario = usuarioLogin;
                            if (usuarioLogin.getSenha().equals(senhaLogin)) {
                                System.out.println("** ACESSO GARANTIDO **");
                                loggedInSenha = usuarioLogin;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                }
                x = 0;
            } else if (t == 2) { //cadastrando motorista
                if (user == 1) {
                    m3.cadastrarUsuario(in);
                    nomeLogin = m3.getLogin();
                    senhaLogin = m3.getLogin();
                    listMotoristas.add(m3);
                } else if (user == 2) { //cadastrando passageiro
                    p3.cadastrarUsuario(in);
                    nomeLogin = p3.getLogin();
                    senhaLogin = p3.getLogin();
                    listPassageiros.add(p3);
                }
            } else {
                System.out.println("Opção inválida");
            }
        } while (x != 0);
        if (loggedInUsuario == null) {
            System.out.println("Email inválido!!!");
        } else if (loggedInSenha == null) {
            System.out.println("Senha inválida!!!");
        } else {
            if (user == 1) {// Loop Motorista
                do {
                    Motorista.menu();
                    i = in.nextInt();
                    if (i == 1) {// cadastrar viagem
                        v4.cadastrarViagem(in);
                        listViagens.add(v4);
                    } else if (i == 2) {// consultar viagem
                        Motorista.confirmarCarona(in, listViagens);                       
                    } else if (i == 3) {// avaliacao
                        Avaliacao.mediaAvaliacao(a1.getNota(), a2.getNota(), a1.getComentario(), a2.getComentario());
                    } else if (i > 4 || i < 0) {
                        System.out.println("Opção inválida");
                    }
                } while (i != 4);
            } else if (user == 2) {// Loop Passageiro
                do {
                    Passageiro.menu();
                    i = in.nextInt();
                    if (i == 1) {// buscar carona
                        System.out.println();
                        Ponto partidaPassageiro = Ponto.inPonto(in, "Partida");
                        Ponto destinoPassageiro = Ponto.inPonto(in, "Destino");                                        
                        for (Viagem viagem : listViagens) {
                            if (viagem.isWithinRange(partidaPassageiro, destinoPassageiro, 2.0) && viagem.getQtdLugar() > 0) {
                                viagensCompativeis.add(viagem);                                
                            }                            
                        }                    
                        if (viagensCompativeis.isEmpty()) {
                            System.out.println("Nenhuma carona compatível encontrada.");
                        }else {
                            System.out.println("Caronas compatíveis:");
                            int index = 1;
                            for (Viagem viagem : viagensCompativeis) {                                
                                System.out.println(index + ". " + viagem.getDetalhesViagem());
                                index++;
                            }
                            System.out.println("Escolha uma carona inserindo o número correspondente:");
                            int rideChoice = in.nextInt();
                            if (rideChoice > 0 && rideChoice <= viagensCompativeis.size()) {
                                Viagem chosenRide = viagensCompativeis.get(rideChoice - 1);
                                System.out.println("Você escolheu a carona: " + chosenRide.getDetalhesViagem());
                                chosenRide.adicionarPassageiro(new Passageiro("eu"), partidaPassageiro, destinoPassageiro);
                            } else {
                                System.out.println("Escolha inválida.");
                            }
                        }           
                    }else if (i == 2) {// avaliacao
                        a3.avaliarViagem();
                        listAvaliacoes.add(a3);                       
                    } else if (i > 3 || i < 0) {
                        System.out.println("Opção inválida");
                    }
                } while (i != 3);
            }
            in.close();
        }
    }
}
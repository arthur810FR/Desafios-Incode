import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] tarefas = null;
        boolean[] statusTare = null;
        int tarefaCont = 0;

        int opcao;
        do {
            System.out.println("      ======MENU DE TAREFAS======");
            System.out.println("Para adicionar tarefas digite 1;");
            System.out.println("Para marcar as tarefas concluidas digite 2;");
            System.out.println("Para listar as tarefas digite 3;");
            System.out.println("Para remover uma tarefa digite 4");
            System.out.println("Para sair digite 5;");
            System.out.print("Digite aqui:");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Quantas tarefas quer cadastrar?");
                    tarefaCont = entrada.nextInt();
                    entrada.nextLine();

                    tarefas = new String[tarefaCont];
                    statusTare = new boolean[tarefaCont];
                    for (int i = 0; i < tarefaCont; i++) {
                        System.out.println("Loop: " + (i + 1));
                        System.out.print("A tarefa " + (i + 1) + ":");
                        tarefas[i] = entrada.nextLine();
                        statusTare[i] = false;
                    }
                    break;
                case 2:
                    if (tarefas != null){
                        System.out.println("Qual tarefa deseja concluir(Voltar ao menu digite 0)?");
                        for (int i = 0; i < tarefaCont; i++){
                            String status = statusTare[i] ? "(Concluida)" : "(Pendente)";
                            System.out.println("Tarefa " + (i + 1) + " está " + status);
                        }
                        int idTarefa = entrada.nextInt();

                        if(idTarefa == 0){
                            System.out.println("Voltando ao menu...");
                            break;
                        }

                        if (idTarefa > 0 && idTarefa <= tarefaCont){
                            statusTare[idTarefa - 1] = true;
                            System.out.println(" A tarefa " + idTarefa + " esta concluída!");

                        } else {
                            System.out.println("Tarefa inválida!");
                        }
                    } else {
                        System.out.println("Tarefas não cadastradas!");
                    }
                    break;
                case 3:
                    if (tarefas != null) {
                        System.out.println("\nTarefas:");
                        for (int i = 0; i < tarefaCont; i++) {
                            System.out.println("Tarefa " + (i + 1) + ":" + tarefas[i]);
                        }
                    } else {
                        System.out.println("Nenhuma tarefa registrada!");
                    }
                    break;
                case 4:
                    if (tarefas != null && tarefaCont > 0){
                        System.out.println("Qual tarefa quer remover?");
                        for (int i = 0; i < tarefaCont; i++){
                            System.out.println((i + 1) + ". " + tarefas[i]);
                        }

                        int numTareRem = entrada.nextInt();
                        if (numTareRem > 0 && numTareRem <= tarefaCont) {
                            System.out.println("Tarefa " + numTareRem + " removida!");
                            tarefas[numTareRem - 1] = "Tarefa removida!";
                        } else {
                            System.out.println("Numero de tarefa inválido!");
                        }
                    } else {
                        System.out.println("Nenhuma tarefa cadastrada!");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando!");
                    break;
                default:
                    System.out.println("Opção indisponivel!");
                    break;
            }

        } while (opcao != 5);

        entrada.close();
    }
}

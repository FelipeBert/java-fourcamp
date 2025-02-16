import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Tarefa> tarefaList = new ArrayList<>();
        int opcao = 0;

        do {
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o titulo da tarefa: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite a data e hora da tarefa: ");
                    String dataHora = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    LocalDateTime data = LocalDateTime.parse(dataHora, formatter);

                    Tarefa novaTarefa = new Tarefa(data, titulo);

                    boolean tituloExistente = tarefaList.stream()
                            .anyMatch(t -> t.getTitulo().equalsIgnoreCase(novaTarefa.getTitulo()));

                    if (tituloExistente) {
                        System.out.println("Já existe uma tarefa com esse título!");
                    } else {
                        tarefaList.add(novaTarefa);
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Digite o titulo da tarefa que deseja remover: ");
                    String tituloRemover = scanner.nextLine();

                    System.out.println("Tem certeza que deseja remover a tarefa? (S/N)");
                    String confirmacao = scanner.nextLine();

                    if(Objects.equals(confirmacao, "S") || Objects.equals(confirmacao, "s")){
                        for (Tarefa tarefa : tarefaList) {
                            if(tarefa.getTitulo().equalsIgnoreCase(tituloRemover)){
                                tarefaList.remove(tarefa);
                                System.out.println("Tarefa removida com sucesso!");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Operação cancelada!");
                    }
                    break;
                case 3:
                    tarefaList.forEach(System.out::println);
                    break;
                case 4:
                    tarefaList.sort(Tarefa.ordenaPorTitutlo());
                    tarefaList.forEach(System.out::println);
                    break;
                case 5:
                    tarefaList.sort(Tarefa.ordenaPorOrdemCronologica());
                    tarefaList.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }

        }while (opcao != 6);
    }

    private static void menu(){
        System.out.println("""
                Menu
                1 - Adicionar Tarefa
                2 - Remover Tarefa
                3 - Listar Tarefas
                4 - Listar em ordem Alfabetica
                5 - Listar em ordem Cronologica
                6 - Sair
                """);
    }

}

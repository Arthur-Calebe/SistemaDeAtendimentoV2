import java.util.Scanner;

public class SistemaDeAtendimentoV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // criar um limite de atendimentos, no caso 5
        String[] nomes = new String[5];
        String[] dias = new String[5];
        String[] horarios = new String[5];

        int totalAtendimentos = 0;
        int opcao;

        while (true){
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar atendimento");
            System.out.println("2 - Listar atendimentos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1){
                if (totalAtendimentos >= 5){
                    System.out.println("Limite de atendimentos atingido");
                    continue;
                }
                System.out.println("Nome do paciente: ");
                nomes[totalAtendimentos] = scanner.nextLine();

                // Dia da semana
                System.out.print("Dia (1-Seg a 5-Sex): ");
                int dia = scanner.nextInt();
                scanner.nextLine();

                switch (dia){
                    case 1: dias[totalAtendimentos] = "Segunda"; break;
                    case 2: dias[totalAtendimentos] = "Terça"; break;
                    case 3: dias[totalAtendimentos] = "Quarta"; break;
                    case 4: dias[totalAtendimentos] = "Quinta"; break;
                    case 5: dias[totalAtendimentos] = "Sexta"; break;
                    default:
                        System.out.println("Dia invalido");
                        continue;

                }
                // definir o horario
                System.out.print("Horário (1-Manhã, 2-Tarde, 3-Noite): ");
                int horario = scanner.nextInt();
                scanner.nextLine();

                switch (horario){
                    case 1: horarios[totalAtendimentos] = "manhã"; break;
                    case 2: horarios[totalAtendimentos] = "Tarde"; break;
                    case 3: horarios[totalAtendimentos] = "Noite"; break;
                    default:
                        System.out.println("Horario invalido");
                        continue;
                }

                totalAtendimentos++;
                System.out.println("Atendimento marcado com secesso!");

            } else if (opcao == 2) {
                if (totalAtendimentos == 0){
                    System.out.println("Nenhum atendimento cadastrado");
                }

                for (int i = 0; i < totalAtendimentos; i++) {
                    System.out.println((i + 1) + " - " + nomes[i] + " | " + dias[i] + " | " + horarios[i]
                    );
            }
        } else if (opcao == 3) {
                System.out.println("Encerrando projeto...");
                break;
            }else {
                System.out.println("Opção invalida!");
            }

            }
        scanner.close();
        }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        // Criação dos objetos
        Estacionamento estacionamento = new Estacionamento(
            null, 
            "Estacionamento do Natael", 
            "123456789",
            "Rua dos Bobos, 0",
            "123456789",
            "natael@gmail.com",
            "08:00 - 18:00"
        );
        Estacionamento estacionamento2 = new Estacionamento(
            null, 
            "Estacionamento do João", 
            "123456789",
            "Rua dos Bobos, 1",
            "123456789",
            "joao@gmail.com",
            "08:00 - 18:00"
        );
        Estacionamento estacionamento3 = new Estacionamento(
            null, 
            "Estacionamento do Maria", 
            "123456789",
            "Rua dos Bobos, 2",
            "123456789",
            "maria@gmail.com",
            "05:00 - 18:00");

        // Adicionando os estacionamentos
        sistema.adicionarEstacionamento(estacionamento);
        sistema.adicionarEstacionamento(estacionamento2);
        sistema.adicionarEstacionamento(estacionamento3);

        Admin admin = new Admin("Natael", "123456789", estacionamento);
        Admin admin2 = new Admin("João", "123456789", estacionamento2);
        Admin admin3 = new Admin("Maria ", "123456789", estacionamento3);

        estacionamento.setResponsavel(admin);
        estacionamento2.setResponsavel(admin2);
        estacionamento3.setResponsavel(admin3);


        // switch case para acoes que muma pessoa pode fazer
        // 1 - Reservar vaga
        // 2 - Cancelar reserva
        // 3 - MInhas  reservas (historico)
        // 4 - Ver estacionamentos

        int op = 0;
        Scanner scanner = new Scanner(System.in);

        while (op != 9) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Reservar vaga");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Minhas reservas");
            System.out.println("4 - Meus veículos");
            System.out.println("5 - Ver estacionamentos");
            System.out.println("9 - Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    // reserva de vagas
                    sistema.listarEstacionamentos();
                    System.out.println("Escolha um estacionamento: ");
                    int idEstacionamento = scanner.nextInt();
                    Estacionamento estacionamentoEscolhido = sistema.buscarEstacionamento(idEstacionamento);
                    estacionamento.exibirVagasDisponiveis();
                    System.out.println("Escolha a vaga desejada: ");
                    int idVaga = scanner.nextInt();

                    break;
                // case 2:
                //     admin.cancelarReserva();
                //     break;
                // case 3:
                //     admin.minhasReservas();
                //     break;
                case 5:
                    sistema.listarEstacionamentos();
                    System.out.println("Digite o id do estacionamento que deseja ver os detalhes: ");
                    int id = scanner.nextInt();
                    sistema.listarDetalhesEstacionamento(id);
                    continue;
                case 9:
                    System.out.println("Saindoooo o.0 '-' xD -.- '_' ...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }
        }
    }
}

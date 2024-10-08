import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Natael", "123456789", "123456");
        System.out.println("Bem-vindo ao estacionamento do Natael");
        System.out.println("Faça login para continuar");
        System.out.println("Digite a senha do usuário: ");

        String login = scanner.nextLine();
        while (!login.equals(cliente.getSenha())) {
            System.out.println("Digite a senha do usuário: ");
            login = scanner.nextLine();
            cliente.login(login);
        }

        Sistema sistema = new Sistema();

        // map de reserva
        Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();
        
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

        int op = 0;

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
                    System.out.println("Seus veiculos: ");
                    if (cliente.veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado");
                        continue;
                    }
                    cliente.exibirVeiculos();
                    System.out.println("Escolha um veículo: ");
                    int idVeiculo = scanner.nextInt();

                    Veiculo veiculo = cliente.veiculos.get(idVeiculo);
                    String tipoVeiculo = veiculo.getTipoVeiculo();

                    estacionamento.exibirVagasDisponiveis(tipoVeiculo);
                    System.out.println("Escolha a vaga desejada: ");

                    int idVaga = scanner.nextInt();
                    Reserva reserva = new Reserva(idVaga, tipoVeiculo, estacionamento.getNome());
                    sistema.adicionarReserva(reserva);
                    System.out.println("Reserva realizada com sucesso!\n");

                    break;
                case 2:
                    sistema.listarReservas();
                    reservas = sistema.getReservas();
                    if (reservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada");
                        System.out.println();
                        continue;
                    }
                    System.out.println("Digite o id da reserva que deseja cancelar: ");
                    int idReserva = scanner.nextInt();
                    sistema.removerReserva(idReserva);
                    System.out.println("Reserva cancelada com sucesso!\n");
                    System.out.println();
                    break;
                case 3:
                    sistema.listarReservas();
                    reservas = sistema.getReservas();
                    if (reservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada");
                        System.out.println();
                    }
                    break;
                case 4:
                    cliente.exibirVeiculos();
                    break;
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

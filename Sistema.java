import java.util.HashMap;
import java.util.Map;


public class Sistema {
    private static Map<Integer, Estacionamento> estacionamentos = new HashMap<Integer, Estacionamento>();
    //map de reservas
    // private static Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();

    // //adiciona uma reserva
    // public static void adicionarReserva(Reserva reserva)
    // {
    //     reservas.put(reserva.getReservaId(), reserva);
    // }

    // //listar todas as reservas
    // public static void listarReservas()
    // {
    //     if (reservas.isEmpty()) {
    //         System.out.println("Nenhuma reserva cadastrada");
    //         return;
    //     }
    //     for (Map.Entry<Integer, Reserva> entry : reservas.entrySet()) {
    //         Reserva reserva = entry.getValue();
    //         System.out.println("ID: " + reserva.getReservaId());
    //         System.out.println("Data: " + reserva.getData());
    //         System.out.println("Hora: " + reserva.getHora());
    //         System.out.println("Vaga: " + reserva.getVaga().getVagaId());
    //         System.out.println("Veiculo: " + reserva.getVeiculo().getMarca());
    //         System.out.println("Estacionamento: " + reserva.getEstacionamento().getNome());
    //         System.out.println();
    //     }
    // }
    
    //adiciona um estacionamento
    public static void adicionarEstacionamento(Estacionamento estacionamento)
    {
        estacionamentos.put(estacionamento.getEstacionamentoId(), estacionamento);
    }

    //função para retornar um estacionamento pelo id
    public static Estacionamento buscarEstacionamento(int id)
    {
        return estacionamentos.get(id);
    }

    //listar todos os estacionamentos
    public static void listarEstacionamentos()
    {
        if (estacionamentos.isEmpty()) {
            System.out.println("Nenhum estacionamento cadastrado");
            return;
        }
        for (Map.Entry<Integer, Estacionamento> entry : estacionamentos.entrySet()) {
            Estacionamento estacionamento = entry.getValue();
            System.out.println("ID: " + estacionamento.getEstacionamentoId());
            System.out.println("Nome: " + estacionamento.getNome());
            System.out.println();
        }
    }

    public static void listarDetalhesEstacionamento(int id) 
    {
        Estacionamento estacionamento = buscarEstacionamento(id);
        estacionamento.detalhesEstacionamento();
    }

    //exibir detalhes do estacionamento
    public static void abrirDetalhesEstacionamento(int id)
    {
        Estacionamento estacionamento = buscarEstacionamento(id);
        estacionamento.detalhesEstacionamento();
    }

}
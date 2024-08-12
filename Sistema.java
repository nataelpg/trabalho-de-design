import java.util.HashMap;
import java.util.Map;


public class Sistema {
    private static Map<Integer, Estacionamento> estacionamentos = new HashMap<Integer, Estacionamento>();
    //map de reservas
    private static Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();

    //adiciona uma reserva
    public static void adicionarReserva(Reserva reserva)
    {
        reservas.put(reserva.getReservaId(), reserva);
    }

    //função para remover uma reserva
    public static void removerReserva(int id)
    {
        reservas.remove(id);
    }

    //get lista de reservas
    public static Map<Integer, Reserva> getReservas()
    {
        return reservas;
    }

    //listar todas as reservas
    public static void listarReservas()
    {
        for (Map.Entry<Integer, Reserva> entry : reservas.entrySet()) {
            Reserva reserva = entry.getValue();
            System.out.println("____________________________________________________");
            System.out.println("ID da Reserva: " + reserva.getReservaId());
            System.out.println("Nome do Estacionamento: " + reserva.getNomeEstacionamento());
            System.out.println("Numero da Vaga: " + reserva.getNumeroVaga());
            System.out.println("Data: " + reserva.getData());
            System.out.println("Hora: " + reserva.getHora());
            System.out.println("Tipo de Veículo: " + reserva.getTipoVeiculo());
            System.out.println();
        }
    }
    
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
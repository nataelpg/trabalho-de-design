import java.util.HashMap;
import java.util.Map;


public class Sistema {
    private static Map<Integer, Estacionamento> estacionamentos = new HashMap<Integer, Estacionamento>();
    
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
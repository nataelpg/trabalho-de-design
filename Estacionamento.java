import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
    private static int proxId = 0;

    private int estacionamentoId;
    private Admin responsavel;
    private String nome;
    private String cnpj;
    private Map<Integer, Vaga> vagas;  // Mudei para Map

    public Estacionamento(Admin responsavel, String nome, String cnpj) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.cnpj = cnpj;
        this.estacionamentoId = proxId++;
        this.vagas = new HashMap<>();  // Inicialize o Map
        criarVagas(20);  // Crie 10 vagas ao criar o estacionamento
    }

    public void setResponsavel(Admin responsavel) {
        this.responsavel = responsavel;
    }

    public Admin getResponsavel() {
        return responsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getEstacionamentoId() {
        return estacionamentoId;
    }

        public void criarVagas(int n) {
        for (int i = 0; i < n; i++) {
            // Supondo que Vaga tem um construtor que aceita um ID e um status
            Vaga novaVaga = new Vaga(true);  // Cria vaga com status 'true' (disponível)
            adicionarVaga(novaVaga);
        }
    }

    public void detalhesEstacionamento() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        // Adicione a lógica para exibir o endereço se disponível
        System.out.println("Responsável: " + responsavel.getNome());
        System.out.println("ID: " + estacionamentoId);
    }

    public void exibirVagasDisponiveis() {
    //exibe 5 vagas por linha 
        int i = 0;
        for (Map.Entry<Integer, Vaga> entry : vagas.entrySet()) {
            Vaga vaga = entry.getValue();
            // imprime os detalhes da vaga com vaga.id e vaga.status não use detalhesVaga
            System.out.println("ID da Vaga: " + vaga.getId() + "Status: " + (vaga.getStatus() ? "Disponível" : "Ocupada"));
            i++;
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public void adicionarVaga(Vaga vaga) {
        vagas.put(vaga.getId(), vaga);
    }

    public void removerVaga(int id) {
        vagas.remove(id);
    }

    public Vaga buscarVaga(int id) {
        return vagas.get(id);
    }
}

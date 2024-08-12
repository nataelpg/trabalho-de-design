import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Estacionamento {
    private static int proxId = 0;

    private int estacionamentoId;
    private Admin responsavel;
    private String nome;
    private String cnpj;
    private String endereco;  // Adicione o endereço do estacionamento
    private String telefone;  // Adicione o telefone do estacionamento
    private String email;  // Adicione o email do estacionamento
    private String horarioFuncionamento;  // Adicione o horário de funcionamento do estacionamento
    private Map<Integer, Vaga> vagas;  // Mudei para Map

    public Estacionamento(Admin responsavel, String nome, String cnpj, String endereco, String telefone, String email, String horarioFuncionamento) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.horarioFuncionamento = horarioFuncionamento;
        this.estacionamentoId = proxId++;
        this.vagas = new HashMap<>();  // Inicialize o Map
        criarVagas();  // Crie 10 vagas ao criar o estacionamento
    }

    public void setEndereco(String endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço não pode ser nulo");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email não pode ser nulo");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setResponsavel(Admin responsavel) {
        if (responsavel == null) {
            throw new IllegalArgumentException("Responsável não pode ser nulo");
        }
        this.responsavel = responsavel;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        if (horarioFuncionamento == null) {
            throw new IllegalArgumentException("Horário de funcionamento não pode ser nulo");
        }
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
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

    public void criarVagas() {
        Random rand = new Random();
        
        int quantidadeVagas = rand.nextInt(21) + 10; // Randomize de 10 até 30
        for (int j = 0; j < quantidadeVagas; j++) {
            TipoVeiculo tipoVeiculo = TipoVeiculo.values()[rand.nextInt(TipoVeiculo.values().length)]; // Random do TipoVeiculo
            TipoVaga tipoVaga = null; // Initialize tipoVaga with null
            if (tipoVeiculo == tipoVeiculo.MOTO) {
                tipoVaga = tipoVaga.SIMPLES;
            } else {
                tipoVaga = TipoVaga.values()[rand.nextInt(TipoVaga.values().length)];
            }
            boolean status = rand.nextBoolean(); // Random do status

            Vaga vaga = new Vaga(status, tipoVaga.toString(), tipoVeiculo.toString());
            vagas.put(vaga.getId(), vaga);
        }
    }

    public void detalhesEstacionamento() {
        System.out.println("ID: " + estacionamentoId);
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Responsável: " + responsavel.getNome());
        System.out.println("Endereço: " + endereco);
        var telefone = this.telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Horário de Funcionamento: " + horarioFuncionamento);
    }

    public void exibirVagasDisponiveis(String tipoVeiculo) {
    //exibe 5 vagas por linha 

        int i = 0;
        System.out.println(" ");
        System.out.println("VAGAS DISPONIVEIS TIPO " + tipoVeiculo);
        System.out.println("____________________________________________________");
        for (Map.Entry<Integer, Vaga> entry : vagas.entrySet()) {
            Vaga vaga = entry.getValue();
            // imprime os detalhes da vaga com vaga.id e vaga.status não use detalhesVaga
            if (vaga.getStatus() && vaga.getTipoVeiculo().equals(tipoVeiculo)) {
                System.out.println("ID da Vaga: " + vaga.getId() + " ");
                System.out.println("Tipo da Vaga: " + vaga.getTipoVaga() + " ");
                System.out.println("Tipo de Veículo: " + vaga.getTipoVeiculo() + " ");
                System.out.println("Status: " + (vaga.getStatus() ? "Disponível" : "Ocupada") + " ");
                System.out.println("____________________________________________________");

                i++;
                if (i % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    //reservar vaga
    public void reservarVaga(int idVaga, String tipoVeiculo) {
        Vaga vaga = vagas.get(idVaga);
        if (vaga == null) {
            System.out.println("Vaga não encontrada");
            return;
        }

        if (vaga.getStatus()) {
            if (vaga.getTipoVeiculo().equals(tipoVeiculo)) {
                vaga.setStatus(false);
                System.out.println("Vaga reservada com sucesso");
            } else {
                System.out.println("Tipo de veículo não permitido");
            }
        } else {
            System.out.println("Vaga ocupada");
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

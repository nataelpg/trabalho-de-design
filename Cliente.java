import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cliente extends Pessoa {
    public String nome;
    public String cpf;
    //lista de veiculos
    public Map<Integer, Veiculo> veiculos;  // Changed to Map<String, Veiculo>

    // Constructor
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.veiculos = new HashMap<>();
        criarVeiculos();
    }

    // Definindo o método setNome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Definindo o método getNome
    public String getNome() {
        return nome;
    }

    // Definindo o método setCpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Definindo o método getCpf
    public String getCpf() {
        return cpf;
    }

    // Definindo o método criarVeiculos
    public void criarVeiculos() {
        // cria de 1 ate 3 veiculos
        int numVeiculos = (int) (Math.random() * 3) + 1; // Generate a random number between 1 and 3
        for (int i = 1; i <= numVeiculos; i++) {
            // cria um veiculo com placa aleatoria
            String placa = "";
            for (int j = 0; j < 7; j++) {
            placa += (char) ((int) (Math.random() * 26) + 65);
            }
            // cria um veiculo com tipoVeiculo aleatorio
            String tipoVeiculo = TipoVeiculo.values()[(int) (Math.random() * 3)].toString();
            // cria um veiculo com ano aleatorio
            int ano = (int) (Math.random() * 20) + 2000;
            Veiculo veiculo = new Veiculo(placa, tipoVeiculo, ano);
            veiculos.put(veiculo.getId(), veiculo);
        }
    }

    public void exibirVeiculos() {
        System.out.println("Veiculos de " + this.nome);
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado");
            return;
        }
        for (Map.Entry<Integer, Veiculo> entry : veiculos.entrySet()) {
            Veiculo veiculo = entry.getValue();
            System.out.println(veiculo);
        }
    }
}



public class Pessoa {
    private String nome;
    private String cpf;

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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
}

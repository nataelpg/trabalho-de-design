
public class Admin extends Pessoa {
    private Estacionamento estacionamento;
    
    public Admin(String nome, String cpf, Estacionamento estacionamento) {
        super(nome, cpf);
        this.estacionamento = estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }
}

enum TipoVeiculo {
    CARRO,
    MOTO,
    CAMIONETE
}

enum TipoVaga {
    SIMPLES,
    ESPECIAL
}

public class Vaga {
    private int id;
    private boolean status;  // true se disponível, false se ocupada
    private String tipoVaga;
    private String tipoVeiculo;
    private static int proxId = 0;

    public Vaga(boolean status, String tipoVaga, String tipoVeiculo) {
        this.id = proxId++;
        this.status = status;
        this.tipoVaga = tipoVaga;
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipoVaga() {
        return tipoVaga;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void detalhesVaga() {
        System.out.print("ID da Vaga: " + id + " ");
        System.out.print("Tipo da Vaga: " + tipoVaga + " ");
        System.out.print("Tipo de Veículo: " + tipoVeiculo + " ");
        System.out.print("Status: " + (status ? "Disponível" : "Ocupada") + " ");
    }
}

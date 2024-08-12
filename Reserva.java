import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private static int proxId = 0;

    private int reservaId;
    private LocalDate data;
    private LocalTime hora;
    private int numeroVaga;
    private String tipoVeiculo;
    private String nomeEstacionamento;
    
    public Reserva(int numeroVaga, String tipoVeiculo, String nomeEstacionamento) {
        this.reservaId = proxId++;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.numeroVaga = numeroVaga;
        this.tipoVeiculo = tipoVeiculo;
        this.nomeEstacionamento = nomeEstacionamento;
    }
    
    public int getReservaId() {
        return reservaId;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public LocalTime getHora() {
        return hora;
    }
    
    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getNomeEstacionamento() {
        return nomeEstacionamento;
    }
    
    public void detalhesReserva() {
        System.out.print("ID da Reserva: " + reservaId + " ");
        System.out.print("Data: " + data + " ");
        System.out.print("Hora: " + hora + " ");
        System.out.print("Número da Vaga: " + numeroVaga + " ");
        System.out.print("Tipo de Veículo: " + tipoVeiculo + " ");
        System.out.print("Nome do Estacionamento: " + nomeEstacionamento + " ");
        System.out.println();
    }
}
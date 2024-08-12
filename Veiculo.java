
public class Veiculo {
    private String placa;
    private String tipoVeiculo;
    private int ano;
    private static int proxId = 0;
    private int id = proxId++;

    public Veiculo(String placa, String tipoVeiculo, int ano) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.ano = ano;
        this.id = proxId++;
    }

    public int getId() {
        return id;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", placa=" + placa + ", tipoVeiculo=" + tipoVeiculo + ", ano=" + ano + "]";
    }
}
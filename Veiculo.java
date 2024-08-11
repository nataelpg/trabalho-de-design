enum TipoVeiculo {
    CARRO, MOTO, CAMINHAO
}

public class Veiculo {
    private String marca;
    private String tipoVeiculo;
    private int ano;
    
    public Veiculo(String marca, String tipoVeiculo, int ano) {
        this.marca = marca;
        this.tipoVeiculo = tipoVeiculo;
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
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
        return "Veiculo [marca=" + marca + ", tipoVeiculo=" + tipoVeiculo + ", ano=" + ano + "]";
    }
}
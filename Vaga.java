public class Vaga {
    private int id;
    private boolean status;  // true se disponível, false se ocupada
    private static int proxId = 0;

    public Vaga(boolean status) {
        this.id = proxId++;
        this.status = status;
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

    public void detalhesVaga() {
        System.out.print("ID da Vaga: " + id + " ");
        System.out.print("Status: " + (status ? "Disponível" : "Ocupada") + " ");
    }
}

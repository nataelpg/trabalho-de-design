
public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        // Criação dos objetos
        Estacionamento estacionamento = new Estacionamento(null, "Estacionamento do Natael", "123456789");
        Estacionamento estacionamento2 = new Estacionamento(null, "Estacionamento do João", "123456789");
        Estacionamento estacionamento3 = new Estacionamento(null, "Estacionamento do Maria", "123456789");

        Admin admin = new Admin("Natael", "123456789", estacionamento);
        Admin admin2 = new Admin("João", "123456789", estacionamento2);
        Admin admin3 = new Admin("Maria ", "123456789", estacionamento3);

        // Adicionando os admins ao estacionamento
        estacionamento.setResponsavel(admin);
        estacionamento2.setResponsavel(admin2);
        estacionamento3.setResponsavel(admin3);
        
        // Adicionando os estacionamentos ao sistema
        sistema.adicionarEstacionamento(estacionamento);
        sistema.adicionarEstacionamento(estacionamento2);
        sistema.adicionarEstacionamento(estacionamento3);

        // Exibindo detalhes do estacionamento
        sistema.abrirDetalhesEstacionamento(0);
        sistema.abrirDetalhesEstacionamento(1);
        sistema.abrirDetalhesEstacionamento(2);

        sistema.listarEstacionamentos();

        //exibir detalhes das vagas
        estacionamento.exibirVagasDisponiveis();
    }
}

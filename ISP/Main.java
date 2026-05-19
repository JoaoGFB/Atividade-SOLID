package ISP;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        atendente.gerenciarPedidos();
        atendente.gerarRelatorios();

        SistemaNotificacao notificacao = new SistemaNotificacao();
        notificacao.enviarNotificacoes();

        Entregador entregador = new Entregador();
        entregador.gerenciarEntregas();
    }
}

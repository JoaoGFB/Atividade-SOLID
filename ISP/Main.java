package ISP;

public class Main {
    public static void main(String[] args) {
        Responsabilidades usuario = new Responsabilidades();
        usuario.gerenciamentoPedidos();
        usuario.enviarNotificacoes();
        usuario.gerenciamentoEntregas();
        usuario.gerarRelatorios();
    }
}

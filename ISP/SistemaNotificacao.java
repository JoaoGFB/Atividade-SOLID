package ISP;

public class SistemaNotificacao implements IntNotificacao{
    @Override
    public void enviarNotificacoes() {
        System.out.println("As notificações com detalhes dos pedidos foram enviadas!");
    }
}

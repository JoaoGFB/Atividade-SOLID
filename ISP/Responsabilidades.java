package ISP;

public class Responsabilidades implements IntNotificacao, IntGerenciamento, IntRelatorio{
    public void enviarNotificacoes() {
        System.out.println("Notificações enviadas!");
    }
    public void gerenciamentoPedidos() {
        System.out.println("Os pedidos foram recebidos e em breve serão preparados!");
    }
    public void gerenciamentoEntregas() {
        System.out.println("As entregas foram enviadas e chegarão em breve!");
    }
    public void gerarRelatorios() {
        System.out.println("O relatório das atividades recentes foi gerado!");
    }
}

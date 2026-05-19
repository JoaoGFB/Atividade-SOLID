package ISP;

public class Atendente implements IntGerenciamentoPedidos, IntRelatorio{
    @Override
    public void gerenciarPedidos() {
        System.out.println("Os pedidos foram recebidos e serão preparados em breve!");
    }
    @Override
    public void gerarRelatorios() {
        System.out.println("Os relatórios das atividades recentes foram gerados!");
    }
}

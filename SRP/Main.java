package SRP;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoJoao = new Pedido("João Gabriel", "Rua Bélgica");
        SalvarPedido salvar = new SalvarPedido();
        InfoPedido info = new InfoPedido();
        salvar.receberPedido(pedidoJoao);
        info.exibirInformacoes(pedidoJoao);
    }
}

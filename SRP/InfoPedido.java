package SRP;
public class InfoPedido {
    public void exibirInformacoes(Pedido pedido) {
        System.out.println("O pedido do cliente "+pedido.getCliente()+
        " será entregue em até "+pedido.getTempo()+" minutos"+
        " para o endereço "+pedido.getEndereco());
        System.out.println("O valor do pedido ficou em R$"+pedido.getPreco());
    }
}

package SRP;
import java.util.Random;
public class SalvarPedido {
    public void receberPedido(Pedido pedido) {
        System.out.println("O pedido do cliente "+pedido.getCliente()+" foi recebido!");
        pedido.setPreco(calcularPreco());
        pedido.setTempo(estimarTempo());
    }
    private int estimarTempo() {
        Random gerador = new Random();
        return gerador.nextInt((90-15)+1)+15;
    }
    private float calcularPreco() {
        Random gerador = new Random();
        return Math.round(3.0f + (gerador.nextFloat() * (150.0f - 3.0f)));
    }
}

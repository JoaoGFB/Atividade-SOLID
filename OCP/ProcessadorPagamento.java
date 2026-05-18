package OCP;

public class ProcessadorPagamento {
    public void processarPagamento(Pagamento formaPagamento, double valor) {
        formaPagamento.pagar(valor);
    }
}

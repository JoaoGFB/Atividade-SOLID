package OCP;

public class PagamentoCartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("O valor "+valor+" foi pago com cartão!");
    }
}

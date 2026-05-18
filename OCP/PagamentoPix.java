package OCP;

public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("O valor de "+valor+" foi pago com Pix!");
    }
}

package OCP;
public class PagamentoDinheiro implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("O valor "+valor+" foi pago em espécie!");
    }
}
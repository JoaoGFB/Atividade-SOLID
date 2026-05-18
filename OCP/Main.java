package OCP;

public class Main {
    public static void main(String[] args) {
        Pagamento pgC = new PagamentoCartao();
        pgC.pagar(350);

        Pagamento pgP = new PagamentoPix();
        pgP.pagar(115.50);

        Pagamento pgD = new PagamentoDinheiro();
        pgD.pagar(77.80);
    }
}

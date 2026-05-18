package OCP;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento procPagamento = new ProcessadorPagamento();
        Pagamento pgC = new PagamentoCartao();
        procPagamento.processarPagamento(pgC, 350);

        Pagamento pgP = new PagamentoPix();
        procPagamento.processarPagamento(pgP, 115.50);

        Pagamento pgD = new PagamentoDinheiro();
        procPagamento.processarPagamento(pgD, 77.80);
    }
}

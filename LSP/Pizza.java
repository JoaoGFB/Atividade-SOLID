package LSP;

public class Pizza extends Produto{
    private int fatias;
    public Pizza(String nome, double valor, int qtd, int fatias) {
        super(nome, valor, qtd);
        this.fatias = fatias;
    }
    public void infoProduto() {
        super.infoProduto();
        System.out.println("Fatias: "+this.fatias);
    }
    public int getFatias() {
        return this.fatias;
    }
}

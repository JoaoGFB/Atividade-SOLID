package LSP;

public class Bebida extends Produto{
    private int ml;
    public Bebida(String nome, double preco, int qtd, int ml) {
        super(nome, preco, qtd);
        this.ml = ml;
    }
    public void infoProduto() {
        super.infoProduto();
        System.out.println("Mililitros: "+this.getMl());
    }
    public int getMl() {
        return this.ml;
    }
}

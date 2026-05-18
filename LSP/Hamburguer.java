package LSP;

public class Hamburguer extends Produto{
    private boolean carneDupla;
    public Hamburguer(String nome, double preco, int quantidade, boolean carneDupla) {
        super(nome, preco, quantidade);
        this.carneDupla = carneDupla;
    }
    public void infoProduto() {
        super.infoProduto();
        System.out.println("Carne dupla: "+this.getCarneDupla());
    }
    public boolean getCarneDupla() {
        return this.carneDupla;
    }
}

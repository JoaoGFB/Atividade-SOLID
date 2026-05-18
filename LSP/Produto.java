package LSP;

public abstract class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = qtd;
    }
    public void infoProduto() {
        System.out.println("Produto: "+this.getNome()+
        "\nValor: "+this.getValor()+
        "\nQuantidade: "+this.getQuantidade());
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }
}
 
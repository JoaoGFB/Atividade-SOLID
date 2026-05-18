package SRP;
public class Pedido {
    private String cliente;
    private String endereco;
    private float preco;
    private int tempo;

    public Pedido ( 
        String cliente, 
        String endereco) {
            this.cliente = cliente;
            this.endereco = endereco;
    }

    public String getCliente() {
        return cliente;
    }
    public String getEndereco() {
        return endereco;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
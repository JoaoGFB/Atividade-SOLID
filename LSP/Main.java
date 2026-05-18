package LSP;

public class Main {
    public static void main(String[] args) {
        Produto pizzaBrocolis = new Pizza("Brócolis", 35, 1, 8);
        pizzaBrocolis.infoProduto();

        Produto hamburguerDuplo = new Hamburguer("Rodeio Duplo", 20, 2, true);
        hamburguerDuplo.infoProduto();

        Produto drPeppers = new Bebida("Dr. Peppers zero", 8.25, 2, 400);
        drPeppers.infoProduto();
    }
}

package q06;

public class Produto extends Item implements Totalizavel{
    private double taxa;

    public Produto(String id, String descricao, double valor, double taxa) {
        super(id, descricao, valor);
        this.taxa = taxa;
    }

    public double calcularTotal() {
        return this.valor * (1 + this.taxa);
    }

    //métodos de leitura...
    public double getTaxa() {
        return taxa;
    }
}

package q01;
public class Pedido {
    private double valorTotal;
    private Cliente cliente;

    public Pedido(double valorTotal, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularDesconto() {
        return valorTotal * 0.1;
    }
}

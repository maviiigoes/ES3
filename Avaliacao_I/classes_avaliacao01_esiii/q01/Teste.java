package q01;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");

        Pedido pedido = new Pedido(100.0, cliente);

        cliente.adicionarPedido(pedido);

        double desconto = pedido.calcularDesconto();

        System.out.println("Valor do pedido: " + pedido.getValorTotal());
        System.out.println("Desconto: " + desconto);
    }
}


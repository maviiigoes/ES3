package q01;
import java.util.List;
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
    }

//    public void processarPedido(Pedido pedido) {
//        pedidos.add(pedido);
//    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
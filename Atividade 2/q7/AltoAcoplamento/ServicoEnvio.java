 package q7.AltoAcoplamento;

 
 public class ServicoEnvio {
    public void enviar(Pedido pedido) {
        System.out.println("Enviando pedido " + pedido.getNumeroPedido() + " para o endereço: " + pedido.getEndereco());
    }
}   
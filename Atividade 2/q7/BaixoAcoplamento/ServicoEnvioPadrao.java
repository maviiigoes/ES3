package q7.BaixoAcoplamento;


public class ServicoEnvioPadrao implements ServicoEnvio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando pedido " + pedido.getNumeroPedido() + " para o endereço: " + pedido.getEndereco());
    }
}
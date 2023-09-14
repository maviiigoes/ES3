package q7.BaixoAcoplamento;


public class Pedido {
    private String numeroPedido;
    private String endereco;
    private ServicoEnvio servicoEnvio; 

    public Pedido(String numeroPedido, String endereco, ServicoEnvio servicoEnvio) {
        this.numeroPedido = numeroPedido;
        this.endereco = endereco;
        this.servicoEnvio = servicoEnvio; 
    }

    public void enviarPedido() {
        servicoEnvio.enviar(this);
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getEndereco() {
        return endereco;
    }
}


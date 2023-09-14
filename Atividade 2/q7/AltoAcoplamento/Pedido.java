package q7.AltoAcoplamento;


public class Pedido {
    private String numeroPedido;
    private String endereco;

    public String getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Pedido(String numeroPedido, String endereco) {
        this.numeroPedido = numeroPedido;
        this.endereco = endereco;
    }
    
    public void enviarPedido() {
        ServicoEnvio servicoEnvio = new ServicoEnvio();
        servicoEnvio.enviar(this);
    }
}


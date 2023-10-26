package q05;

import java.time.LocalDateTime;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Transacao deposito = new Transacao(200, new Date(), "DEPOSITO");
        Transacao retirada = new Transacao(200, new Date(), "RETIRADA");
        Transacao transferencia = new Transacao(200, new Date(), "TRANSFERENCIA");

        ProcessarTransacao processarTransacao = new ProcessarTransacao();

        processarTransacao.salvar(deposito);
        processarTransacao.salvar(retirada);
        processarTransacao.salvar(transferencia);
    }
}

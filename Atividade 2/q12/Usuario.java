package q12;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Relacionamento> relacionamentos;

    public Usuario() {
        relacionamentos = new ArrayList<>();
    }

    public void adicionarRelacionamento(Usuario outroUsuario, TipoRelacionamento tipo) {
        Relacionamento novoRelacionamento = new Relacionamento(this, outroUsuario, tipo);
        relacionamentos.add(novoRelacionamento);
    }

}
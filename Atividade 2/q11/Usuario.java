package q11;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private List<Conteudo> conteudos;

    public Usuario() {
        conteudos = new ArrayList<>();
    }

    public void criarConteudo(String conteudo) {
        Conteudo novoConteudo = new Post(conteudo); // ou Comentario, dependendo do tipo
        conteudos.add(novoConteudo);
    } 
    
}

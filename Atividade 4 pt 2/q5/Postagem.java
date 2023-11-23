package q5;

import java.util.ArrayList;
import java.util.List;

public class Postagem implements Publicavel {
    private String id;
    private Perfil autor;
    private String conteudo;
    private List<Reacao> reacoes;
    private List<Comentario> comentarios;

    public Postagem(String id, Perfil autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.reacoes = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public void adicionarReacao(Reacao reacao) {
        reacoes.add(reacao);
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    @Override
    public void exibir() {
        System.out.println("Postagem [" + id + "] de " + autor.getNomeUsuario() + ": " + conteudo);

        // Exibir reações
        for (Reacao reacao : reacoes) {
            reacao.exibir();
        }

        // Exibir comentários
        for (Comentario comentario : comentarios) {
            comentario.exibir();
        }
    }

    @Override
    public Perfil getAutor() {
        return autor;
    }

    public String getId() {
        return null;
    }

    // Outros métodos
}
 

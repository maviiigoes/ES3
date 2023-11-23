package q5;

public class Comentario implements Publicavel {
    private Postagem postagemOriginal;
    private Perfil autor;
    private String conteudo;

    public Comentario(Perfil autor, String conteudo, Postagem postagemOriginal) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.postagemOriginal = postagemOriginal;
    }

    @Override
    public void exibir() {
        System.out.println("Comentário de " + autor.getNomeUsuario() + " em resposta à postagem [" +
                postagemOriginal.getId() + "]: " + conteudo);
    }

    @Override
    public Perfil getAutor() {
        return autor;
    }

    // Outros métodos
}

package q5;

public class Reacao implements Publicavel {
    private String tipoReacao;
    private Postagem postagem;
    private Perfil autor;

    public Reacao(String tipoReacao, Perfil autor, Postagem postagem) {
        this.tipoReacao = tipoReacao;
        this.autor = autor;
        this.postagem = postagem;
    }

    @Override
    public void exibir() {
        System.out.println("Reação [" + tipoReacao + "] de " + autor.getNomeUsuario() +
                " na postagem " + postagem.getId());
    }

    @Override
    public Perfil getAutor() {
        return autor;
    }

    // Outros métodos
}
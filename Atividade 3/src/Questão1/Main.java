package Questão1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "AutorTeste", "autor@teste.com");
        String filePath = "./Teste.txt";

        Post post = new Post(1, "Texto do post de teste", autor, new Date(), filePath);
       Post post1 = new Post(2, "Texto do post de teste2", autor, new Date(), filePath);



        RepositorioDePosts repositorio = new RepositorioDePosts(filePath);

        repositorio.salvarPost(post);
        repositorio.salvarPost(post1);


        System.out.println("Posts no arquivo:");
        repositorio.lerPostsDoArquivo();
    }
}

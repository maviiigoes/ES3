package Questão1;

import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RepositorioDePosts {
    private String filePath;

    public RepositorioDePosts(String filePath) {
        this.filePath = filePath;
    }

    public void salvarPost(Post post) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lerPostsDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

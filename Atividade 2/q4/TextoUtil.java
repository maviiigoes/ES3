package q4;

public class TextoUtil {
    public String removerEspacos(String texto) {
        return texto.replaceAll("\\s+", "");
    }

    public String[] quebrarEmPalavras(String texto) {
        return texto.split("\\s+");
    }
} 
    


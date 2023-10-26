package q02;

public class RedeSocial {
    public void postarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().equals("")) {
          System.out.println("A mensagem não pode ser vazia...");
          return;
        }
            System.out.println("Mensagem postada: " + mensagem);
    }
}


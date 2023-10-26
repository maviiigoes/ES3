package q05;

import java.io.FileWriter;
import java.io.IOException;

public class ProcessarTransacao {
  public void salvar(Transacao transacao){
      try(FileWriter writer= new FileWriter("log_transacoes.txt", true )){
          writer.write("Data: "+ transacao.getData() +",Valor:"+ transacao.getValor() + ", Tipo: " + transacao.getTipo() + "\n");
      } catch (IOException e) {
          System.out.println("Erro ao salvar" + e.getMessage());
      }
  }
}

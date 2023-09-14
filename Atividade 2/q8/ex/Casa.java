package q8.ex;

//Ex sem ”Tell, don’t ask” 


  public class Casa {
    private boolean aquecedorLigado;
    
    public void ligarAquecedor() {
        aquecedorLigado = true;
    }
    
    public void desligarAquecedor() {
        aquecedorLigado = false;
    }
    
    public void controlarTermostato(Termostato termostato) {
        if (aquecedorLigado) {
            if (termostato.getTemperatura() < 22) {
                termostato.aumentarTemperatura();
            }
        } else {
            if (termostato.getTemperatura() > 18) {
                termostato.diminuirTemperatura();
            }
        }
    }
}




// Ex com tell don't ask
package q8.ex2;

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
            termostato.aquecer();
        } else {
            termostato.resfriar();
        }
    }
}



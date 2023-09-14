package q8.ex2;

public class Termostato {
    private int temperatura;

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public void aquecer() {
        temperatura++;
    }
    
    public void resfriar() {
        temperatura--;
    }
}
 
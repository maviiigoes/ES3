package q0304;

import javax.sound.midi.Soundbank;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; // em litros

    public double getQuantidadeCombustivel() {

        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {

        return capacidadeMaxima;
    }
    public Carro(double quantidadeCombustivel, double capacidadeMaxima) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public  void reabastecerSeNecessario( int quantidade) {
        if (this.getQuantidadeCombustivel() < this.getCapacidadeMaxima()) {
            if ((this.getQuantidadeCombustivel() + quantidade) >= this.capacidadeMaxima) {
                System.out.println("Capacidade máxima do tanque ultrapassada.");
                return;
            }
            this.quantidadeCombustivel += quantidade;
            System.out.println(quantidadeCombustivel);
        }
    }
}


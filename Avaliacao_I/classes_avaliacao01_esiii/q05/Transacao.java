package q05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
public class Transacao {
    private double valor;
    private Date data;
    private String tipo; // Tipos: DEPOSITO, RETIRADA, TRANSFERENCIA...
    public Transacao(double valor, Date data, String tipo) {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double calcularTaxas() {
        switch (tipo.toUpperCase()) {
            case "DEPOSITO":
                return valor * 0.01;
            case "RETIRADA":
                return valor * 0.02;
            case "TRANSFERENCIA":
                return valor * 0.015;
            default:
                return 0;
        }
    }



}
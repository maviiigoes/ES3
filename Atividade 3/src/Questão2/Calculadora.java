package Questão2;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Refatore o método calcular
    public List<Double> calcular(List<Operacao> operacoes) {
        List<Double> resultados = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            double resultado = operacao.executar(this.a, this.b);
            resultados.add(resultado);
        }
        return resultados;
    }

    public static void main(String[] args) {
        double num1 = 111.0;
        double num2 = 55.0;

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());

        Calculadora calculadora = new Calculadora(num1, num2);
        List<Double> resultados = calculadora.calcular(operacoes);

        System.out.println("Resultados:");
        for (Double resultado : resultados) {
            System.out.println(resultado);
        }
    }
}

package q4;

public class EstatisticaUtil {
    public double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    public double calcularDesvioPadrao(double[] numeros) {
        double media = calcularMedia(numeros);
        double somaDosQuadrados = 0;
        for (double numero : numeros) {
            somaDosQuadrados += Math.pow(numero - media, 2);
        }
        double variancia = somaDosQuadrados / numeros.length;
        return Math.sqrt(variancia);
    }
}
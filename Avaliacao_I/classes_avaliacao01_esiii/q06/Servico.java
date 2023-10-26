package q06;

public class Servico extends Item implements Totalizavel{
    private int horas;

    public Servico(String id, String descricao, double valor, int horas) {
        super(id, descricao, valor);
        this.horas = horas;
    }

    public double cacularTotal() {
        return this.valor * this.horas;
    }
    public int getHoras() {
        return horas;
    }
}

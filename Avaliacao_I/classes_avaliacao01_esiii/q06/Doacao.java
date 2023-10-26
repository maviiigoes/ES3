package q06;

public class Doacao extends Item implements Totalizavel{
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        super(id, descricao, valor);
        this.bonus = bonus;
    }

    public double cacularTotal() {
        return this.valor * this.bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
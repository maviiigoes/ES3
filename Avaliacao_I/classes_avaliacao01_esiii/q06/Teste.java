package q06;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto("1", "Celular", 2000, 0.5);
        Servico servico = new Servico("2", "Concerto", 200, 5);
        Doacao doacao = new Doacao("3", "Doacao", 50, 0.1);

        Totalizacao totalizacao = new Totalizacao();
        totalizacao.totalizar((Totalizavel[]) new Item[]{produto, servico, doacao});

        System.out.println(totalizacao);
    }
}

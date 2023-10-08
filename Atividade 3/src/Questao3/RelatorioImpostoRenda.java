package Questao3;

class RelatorioImpostoRenda {
    public void gerarRelatorio(ImpostoDeRenda ir, double impostoDevido) {
        System.out.println("CPF: " + ir.getCpfContribuinte());
        System.out.println("Rendimentos: " + ir.getRendimentos());
        System.out.println("Despesas: " + ir.getDespesas());
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}
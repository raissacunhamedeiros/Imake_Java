package service;

public class ServiceVenda {

    // Cálculo de impostos e taxas
    public double calcularImposto(double valorTotal, double taxaImposto) {
        return valorTotal * (taxaImposto / 100.0);
    }

    public double calcularTaxas(double valorTotal, double taxaPercentual) {
        return valorTotal * (taxaPercentual / 100.0);
    }

    public double calcularJuros(double valorTotal, double jurosPercentual) {
        return valorTotal * (jurosPercentual / 100.0);
    }

    public double calcularDesconto(double valorTotal, double descontoPercentual) {
        return valorTotal * (descontoPercentual / 100.0);
    }

    // Geração de nota fiscal simplificada
    public void gerarNotaFiscal(String cliente, String loja, double valorTotal, double taxas, double juros, double desconto) {
        System.out.println("===== NOTA FISCAL =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Loja: " + loja);
        System.out.println("-----------------------");
        System.out.printf("Subtotal: R$ %.2f%n", valorTotal);
        System.out.printf("Taxas: R$ %.2f%n", taxas);
        System.out.printf("Juros: R$ %.2f%n", juros);
        System.out.printf("Descontos: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", valorTotal + taxas + juros - desconto);
        System.out.println("=======================");
    }

}
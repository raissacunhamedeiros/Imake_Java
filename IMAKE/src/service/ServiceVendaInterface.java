package service;

public interface ServiceVendaInterface {

    // Cálculo de impostos e taxas
    double calcularImposto(double valorTotal, double taxaImposto);

    double calcularTaxas(double valorTotal, double taxaPercentual);

    double calcularJuros(double valorTotal, double jurosPercentual);

    double calcularDesconto(double valorTotal, double descontoPercentual);

    // Geração de nota fiscal simplificada
    void gerarNotaFiscal(String cliente, String loja, double valorTotal, double taxas, double juros, double desconto);
}

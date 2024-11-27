package model;
import service.*;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Pessoa pessoa;
    private Loja loja;
    private Carrinho carrinho;
    private List<ServiceCarrinho.ItemCarrinho> produtosVendidos;
    private double valorTotal, juros, imposto, taxas;
    private String FormaPagamento;

    //Construtores:

    public Venda(Pessoa pessoa, Loja loja, Carrinho carrinho) {
        this.pessoa = pessoa;
        this.loja = loja;
        this.carrinho = carrinho;
        this.produtosVendidos = new ArrayList<>();
        this.valorTotal = 0.0;
        this.juros = 0.0;
        this.imposto = 0.0;
        this.taxas = 0.0;
    }

    public Venda(){

    }

    //Get e set:
    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ServiceCarrinho.ItemCarrinho> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<ServiceCarrinho.ItemCarrinho> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getTaxas() {
        return taxas;
    }

    public void setTaxas(double taxas) {
        this.taxas = taxas;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        FormaPagamento = formaPagamento;
    }

    //Metodos de venda:
    public boolean comprarProdutos() {
        if (carrinho.getItens().isEmpty()) {
            System.out.println("O carrinho está vazio. Adicione produtos antes de finalizar a compra.");
            return false;
        }

        System.out.println("Iniciando compra...");
        System.out.println("Cliente: " + pessoa.getNome());
        System.out.println("Loja: " + loja.getNome());

        for (ServiceCarrinho.ItemCarrinho item : carrinho.getItens()) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();

            Produto produtoLoja = loja.buscarProdutoPorNome(produto.getNome());
            if (produtoLoja == null || produtoLoja.getEstoque() < quantidade) {
                System.out.println("Produto " + produto.getNome() + " não disponível ou estoque insuficiente.");
                continue;
            }

            produtoLoja.setEstoque(produtoLoja.getEstoque() - quantidade);
            produtosVendidos.add(item);
            valorTotal += produto.getPreco() * quantidade;

            System.out.println("Produto: " + produto.getNome() + " | Quantidade: " + quantidade +
                    " | Preço: R$ " + produto.getPreco() + " -> Adicionado ao pedido.");
        }

        if (produtosVendidos.isEmpty()) {
            System.out.println("Nenhum produto pôde ser comprado. Verifique o carrinho e tente novamente.");
            return false;
        }

        System.out.println("Valor total da compra: R$ " + valorTotal);
        carrinho.limparCarrinho(); // Limpar o carrinho após a compra
        return true;
    }

    private void aplicarTaxas() {
        double totalComTaxas = valorTotal + juros + imposto + taxas;
        System.out.println("Juros: R$ " + juros);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Taxas adicionais: R$ " + taxas);
        System.out.println("Valor final com taxas: R$ " + totalComTaxas);
    }


    public void formaPagamento() {
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Pix");
        System.out.println("3. Boleto Bancário");
        System.out.println("4. Dinheiro");


        int opcao = 2;
        switch (opcao) {
            case 1 -> setFormaPagamento("Cartão de Crédito");
            case 2 -> setFormaPagamento("Pix");
            case 3 -> setFormaPagamento("Boleto Bancário");
            case 4 -> setFormaPagamento("Dinheiro");
            default -> System.out.println("Opção inválida. Escolha novamente.");
        }
        System.out.println("Forma de pagamento escolhida: " + opcao);
    }

}

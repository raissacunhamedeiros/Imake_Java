package service;
import model.Produto;
import model.Carrinho;

import java.util.ArrayList;

public class ServiceCarrinho {
    //lista de todos os carrinhos existentes
    private final ArrayList<Carrinho> carrinhos = new ArrayList<>();

    //encapsulamento
    public class ItemCarrinho{
        private Produto produto;
        private int quantidade;

        public ItemCarrinho(Produto produto, int quantidade){
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

    //Criar carrinho
    public void adicionarCarrinho(Carrinho carrinho){
        carrinhos.add(carrinho);
    }

    //mexer num carrinho criado
    public void adicionarProduto(Carrinho carrinho, Produto produto, int quantidade){
        carrinho.adicionarProduto(produto, quantidade); //colocar essa funcao na classe Carrinho
    }

    public void removerProduto(Carrinho carrinho, Produto produto){
        carrinho.removerProduto(produto); //criar esse método em Carrinho
    }

    public double calcularTotal(Carrinho carrinho) {
        double total = 0.0;
        for (ItemCarrinho item : carrinho.getItens()){ //terminar em Carrinho
            total += item.getProduto().getPreco() * item.getQuantidade();
        } return total;
    }

    public void exibirCarrinhos(){
        for (int i = 0; i < carrinhos.size(); i++){
            System.out.println("Carrinho (" + i + "): ");
            carrinhos.get(i).exibirCarrinho(); //terminar em Carrinho
        }
    }
}

/*
a Classe Carrinho chama o ServiceCarrinho para adc/remover produtos
O carrinho é att dinamicamente
apos finalizar, os dados do carrinho sao enviados para a venda
 */

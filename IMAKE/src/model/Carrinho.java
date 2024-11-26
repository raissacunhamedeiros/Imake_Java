package model;
import service.ServiceCarrinho;
import model.Produto;
import java.util.ArrayList;

public class Carrinho {
    private final ServiceCarrinho serviceCarrinho;
    //array com os itens de cada carrinho
    private final ArrayList<ServiceCarrinho.ItemCarrinho> itens = new ArrayList<>();

    public Carrinho(ServiceCarrinho serviceCarrinho) {
        this.serviceCarrinho = serviceCarrinho;
    }

    //métodos
    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(serviceCarrinho.new ItemCarrinho(produto, quantidade));
    }

    public void removerProduto(Produto produto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().equals(produto)) {
                itens.remove(i);
                return; //sai assim que exclue o produto
            }
        }
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho:");
        for (ServiceCarrinho.ItemCarrinho item : itens) {
            System.out.println("->" + item.getProduto().getNome() + " | Preço: R$ " +
                    item.getProduto().getPreco() + " | Quantidade: " + item.getQuantidade());
        }
    }
    // este metodo é para mostrar o carrinho pra o cliente

    //este é para enviar as info do carrinho, gerando um array com os produtos
    //p/ ser usado no restante dos codifos
    public ArrayList<ServiceCarrinho.ItemCarrinho> getItens() {
        return itens;
    }
}

/*
a Classe Carrinho chama o ServiceCarrinho para adc/remover produtos
O carrinho é att dinamicamente
apos finalizar, os dados do carrinho sao enviados para a venda
 */


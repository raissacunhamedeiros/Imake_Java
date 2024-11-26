import model.Loja;
import model.Produto;
import service.ServiceProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String resp;

    }
}
//public class Main {
//    public static void main(String[] args) {
//        // Cria a loja
//        Loja loja = new Loja("Loja do João");
//
//        // Cria o ProdutoService
//        ProdutoService produtoService = new ProdutoService();
//
//        // Inicializa o LojaService com o ProdutoService
//        LojaService lojaService = new LojaService(loja, produtoService);
//
//        // Cadastra produtos na loja
//        lojaService.cadastrarProduto("Notebook", 2500.00);
//        lojaService.cadastrarProduto("Celular", 1200.00);
//
//        // Lista produtos da loja
//        lojaService.listarProdutos();
//
//        // Aplica desconto em um produto
//        lojaService.aplicarDescontoEmProduto("Notebook", 10);
//
//        // Lista produtos novamente para verificar o desconto
//        lojaService.listarProdutos();
//    }
//}
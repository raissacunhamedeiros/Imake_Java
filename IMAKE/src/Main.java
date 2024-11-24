import model.Produto;
import service.ServiceProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produtoTeste= new Produto();
        Scanner scanner = new Scanner(System.in);
        ServiceProduto SP = new ServiceProduto();

        System.out.println("Digite o nome do produto: ");
        produtoTeste.setNome(scanner.nextLine());
        System.out.println("Digite o estoque do produto: ");
        produtoTeste.setEstoque(scanner.nextInt());
        System.out.println("digite o ID do produto: ");
        produtoTeste.setIDProduto(scanner.nextLine());
        System.out.println("Digite o preço do produto: R$ ");
        produtoTeste.setPreco(scanner.nextFloat());

        SP.cadastrarProduto(produtoTeste);
        System.out.println(SP.listar());

    }
}
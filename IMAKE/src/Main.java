import model.Produto;
import service.ServiceProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceProduto SP = new ServiceProduto();
        String resp;

        do {
            Produto produtoTeste= new Produto(); //Precisa ser instanciado dentro do Do while para não sobrescrever o primeiro produto cadastrado
            System.out.println("Digite o nome do produto: ");
            produtoTeste.setNome(scanner.next());
            System.out.println("Digite o estoque do produto: ");
            produtoTeste.setEstoque(scanner.nextInt());
            System.out.println("Digite o ID do produto: ");
            produtoTeste.setIDProduto(scanner.next());
            System.out.println("Digite o valor do produto: R$ ");
            produtoTeste.setPreco(scanner.nextFloat());

            SP.cadastrarProduto(produtoTeste);
            System.out.println(SP.listar());

            System.out.println("Você gostaria de cadastrar outro produto? [S/N]");
            resp= scanner.next();
        } while(resp.equalsIgnoreCase("S"));
    }
}
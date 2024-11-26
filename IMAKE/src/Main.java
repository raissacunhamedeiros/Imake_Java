import model.Loja;
import model.Produto;
import service.Fake_DB;
import service.ServiceProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fake_DB data = new Fake_DB();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String resp;
        int id_loja = 1;

        while (true) {
            System.out.println("Digite 'C' para criar uma conta e 'L' para se logar em uma ja existente!: ");
            if (sc.next().equals("C")) {
                System.out.println("Deseja criar uma conta estabelecimento?: [S / N]");
                if (sc.next().equals("S")) {
                    Loja loja1 = new Loja();
                    loja1.setID(id_loja);
                    id_loja += 1;
                    System.out.println("Digite o nome: ");
                    loja1.setNome(sc.next());
                    System.out.println("Digite o email: ");
                    loja1.setEmail(sc.next());
                    System.out.println("Digite o CNPJ: ");
                    loja1.setCNPJ(sc.next());
                    System.out.println("Digite o seu telefone: ");
                    loja1.setTelefone(sc.next());
                    System.out.println("Digite o seu endereço: ");
                    loja1.setEndereco(sc.next());
                    System.out.println("Digite a sua senhha: ");
                    loja1.setSenha(sc.next());
                    System.out.println("Conta criada com sucesso!");
                    data.setLojas_disponiveis(loja1);
                }
            } else {
                System.out.println("aq");
            }

            System.out.println("Digite o ID da loja!: ");
            int id = sc.nextInt();
            Loja loja_recebida = data.buscarPorId(id);
            System.out.println(loja_recebida.getNome());


            // main raíssa:

            Loja loja1 = new Loja(1, "123456789", "Loja A", "(11) 1111-1111", "loja1@email.com", "Rua A, 123", "senha123");
            Loja loja2 = new Loja(2, "987654321", "Loja B", "(22) 2222-2222", "loja2@email.com", "Rua B, 456", "senha456");

            data.setLojas_disponiveis(loja1);
            data.setLojas_disponiveis(loja2);

            ServiceProduto serviceProduto = new ServiceProduto();

            serviceProduto.cadastrarProduto(data, 1);
            System.out.println("Produtos cadastrados na " + loja1.getNome() + ":");
            for (Produto produto : loja1.getEstoque()) {
                System.out.println(produto);
            }
        }
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
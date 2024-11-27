import model.Loja;
import model.Produto;
import service.ServiceProduto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolherLoja;

        // Main Raíssa (não mexer, obg <3):
        Loja loja1 = new Loja(01,"001.002.003/0001-04","DivasMake","83996206872","loja01@email.com","rua desespero, n82","senha123");
        Loja loja2 = new Loja(02,"001.002.003/0001-05","MakeDelas","83996206870","loja02@email.com","rua da amargura, n85","senha124");


        Produto p1 = new Produto("batom vermelho", 26, 25.65, "001");
        Produto p2 = new Produto("Perfume - 1milion", 5, 980.00, "002");
        Produto p3 = new Produto("pó- bege claro", 25, 29.90, "003");
        Produto p4 = new Produto("pó- bege medio", 25, 29.90, "004");
        Produto p5 = new Produto("pó- morena", 25, 29.90, "005");
        Produto p6 = new Produto("base- bege claro", 25, 49.90, "006");
        Produto p7 = new Produto("base- bege médio", 25, 49.90, "007");
        Produto p8 = new Produto("base- morena", 25, 49.90, "008");
        Produto p9 = new Produto("batom nude", 26, 25.65, "009");
        Produto p10 = new Produto("batom rosa", 26, 25.65, "010");

        ServiceProduto sp1=new ServiceProduto(loja1);
        ServiceProduto sp2=new ServiceProduto(loja2);

        sp1.cadastrarProduto(p5);
        sp2.cadastrarProduto(p2);
        sp1.cadastrarProduto(p10);
        sp2.cadastrarProduto(p7);

        System.out.println("--------------------------------------------");

        sp1.listarProdutos();
        sp2.listarProdutos();

        System.out.println("--------------------------------------------");

        // Escolher a loja para atualizar produto/deletar:
        System.out.println("Escolha a loja para atualizar o produto:");
        System.out.println("1. " + loja1.getNome());
        System.out.println("2. " + loja2.getNome());
        int opcaoLoja = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        ServiceProduto spEscolhido = null;

        switch (opcaoLoja) {
            case 1:
                spEscolhido = sp1;
                break;
            case 2:
                spEscolhido = sp2;
                break;
            default:
                System.out.println("Opção inválida. Escolhendo a primeira loja por padrão.");
                spEscolhido = sp1;
                break;
        }

        // Solicitar nome do produto e novo nome
        System.out.println("Deseja alterar o nome de algum produto? (Digite o nome do produto)");
        String nome = sc.nextLine();
        System.out.println("Digite o novo nome: ");
        String novoNome = sc.nextLine();

        spEscolhido.atualizarProduto(nome, novoNome);

        System.out.println("--------------------------------------------");

        // Excluir produto (opcional)
        System.out.println("Qual produto deseja excluir do estoque?");
        String nomeDeletar = sc.nextLine();
        spEscolhido.removerProduto(nomeDeletar);
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



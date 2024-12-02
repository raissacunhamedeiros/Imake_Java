import model.*;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceCliente servicecliente = new ServiceCliente();
        ServiceLoja serviceLoja = new ServiceLoja();
        ServiceCarrinho serviceCarrinho = new ServiceCarrinho();
        ServiceEntregador serviceEntregador = new ServiceEntregador();
        Entregador entregador = new Entregador("João", "01012345699", "83998920047", "joao@email.com", "r. dos milagres - n45", "2587");
        Venda venda1 = new Venda();
        ServiceVenda serviceVenda= new ServiceVenda();

        Loja loja1 = new Loja(01, "001.002.003/0001-04", "DivasMake", "83996206872", "loja01@email.com", "rua desespero, n82", "senha123");

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


        ServiceProduto sp1 = new ServiceProduto(loja1);


        sp1.cadastrarProduto(p5);
        sp1.cadastrarProduto(p10);


        serviceLoja.cadastrarLoja(loja1);


        int opCliente;
        int opEntregador;
        int opLoja;
        int clienteCarrinho;
        int oppag;


        System.out.println("=======================================");
        System.out.println("                 Imake                 ");
        System.out.println("=======================================");
        System.out.println("----------   Bem vindo(a)!   ----------");
        System.out.println("=======================================");
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│               LOGIN                 │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│                                     │");

        //pode ser adicionado um while aq para repeticao
        System.out.println("│ Digite qual o seu tipo de Usuário:  │");
        System.out.println("│ [1] - Cliente                       │");
        System.out.println("│ [2] - Loja                          │");
        System.out.println("│ [3] - Entregador                    │");
        System.out.println("=======================================");
        int tipoUsuario = sc.nextInt();

        if (tipoUsuario == 1) {
            do {
                System.out.println("=======================================");
                System.out.println("                 Imake                 ");
                System.out.println("          Bem vindo Cliente!           ");
                System.out.println("=======================================");
                System.out.println("[1]- Ver lojas ");
                System.out.println("[2]- Carrinho ");
                System.out.println("[3]- Realizar Compra");
                System.out.println("[4]-Sair");
                System.out.println("Escolha uma opção:  ");
                opCliente = sc.nextInt();

                switch (opCliente) {
                    case 1:
                        System.out.println("=======================================");
                        System.out.println("             Lojas Imake:              ");
                        System.out.println("=======================================");
                        System.out.println("Bem vindo a Divas makes!");
                        serviceLoja.exibirProdutos();
                        break;


                    case 2:
                        Cliente cliente = new Cliente("Helena", "12345678900", "83911112222", "helena1@gmail.com", "Rua presidente, 10, jardins", "senha9898");
                        Carrinho carrinho = cliente.getCarrinho();
                        int opCarrinho;
                        do {
                            System.out.println("=======================================");
                            System.out.println("         Bem vindo ao carrinho         ");
                            System.out.println("=======================================");
                            System.out.println("[1] - Ver carrinho ");
                            System.out.println("[2] - Add produto ao carrinho");
                            System.out.println("[3] - Remover produto");
                            System.out.println("[4] - Limpar carrinho");
                            System.out.println("[5] - Voltar para o menu");
                            System.out.println("Escolha uma opção: ");
                            opCarrinho = sc.nextInt();

                            switch (opCarrinho) {
                                case 1:
                                    System.out.println("=======================================");
                                    System.out.println("           Itens no carrinho           ");
                                    System.out.println("=======================================");
                                    carrinho.exibirCarrinho();
                                    break;

                                case 2:
                                    System.out.println("=======================================");
                                    System.out.println("      Adicionar produto ao carrinho    ");
                                    System.out.println("=======================================");
                                    System.out.print("Digite o nome do produto: ");
                                    sc.nextLine();
                                    String nomeProduto = sc.nextLine();
                                    System.out.print("Digite a quantidade: ");
                                    int quantidadeProduto = sc.nextInt();

                                    Produto produtoParaAdicionar = loja1.buscarProdutoPorNome(nomeProduto);
                                    if (produtoParaAdicionar != null) {
                                        carrinho.adicionarProduto(produtoParaAdicionar, quantidadeProduto);
                                        System.out.println("Produto adicionado ao carrinho com sucesso!");
                                    } else {
                                        System.out.println("Produto não encontrado na loja.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("=======================================");
                                    System.out.println("      Remover produto do carrinho      ");
                                    System.out.println("=======================================");
                                    System.out.print("Digite o nome do produto a ser removido: ");
                                    sc.nextLine();
                                    String nomeProdutoRemover = sc.nextLine();

                                    Produto produtoParaRemover = loja1.buscarProdutoPorNome(nomeProdutoRemover);
                                    if (produtoParaRemover != null) {
                                        carrinho.removerProduto(produtoParaRemover);
                                        System.out.println("Produto removido do carrinho com sucesso!");
                                    } else {
                                        System.out.println("Produto não encontrado no carrinho.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("=======================================");
                                    System.out.println("           Limpar o carrinho           ");
                                    System.out.println("=======================================");
                                    carrinho.limparCarrinho();
                                    System.out.println("Carrinho limpo com sucesso!");
                                    break;
                                case 5:
                                    System.out.println("Voltando ao menu principal");
                                    break;
                                default:
                                    System.out.println("Opção inválida! Tente novamente.");

                            }
                            while (opCarrinho != 5) ;
                            break;
                        }
                    case 3:
                        System.out.println("=======================================");
                        System.out.println("            Realizar venda             ");
                        System.out.println("=======================================");
                        venda1.comprarProdutos();
                        serviceVenda.calcularTaxas();
                        serviceVenda.calcularImposto();
                        serviceVenda.calcularJuros();
                        serviceVenda.calcularDesconto();
                        venda1.formaPagamento();
                        serviceVenda.gerarNotaFiscal();
                        break;

                    case 4:
                        break;






                } while (opCliente != 4) ;
            }
        }


            if (tipoUsuario == 2) {
                do {
                    System.out.println("=======================================");
                    System.out.println("                 Imake                 ");
                    System.out.println("   Seja Bem vindo a sua loja virtual!  ");
                    System.out.println("=======================================");
                    System.out.println("[1]- Adicionar Produto ");
                    System.out.println("[2]- Listar produtos ");
                    System.out.println("[3]- Remover Produtos");
                    System.out.println("[4]- Atualizar Produtos");
                    System.out.println("[5]- Sair");

                    System.out.println("Escolha uma opção:  ");
                    opLoja = sc.nextInt();

                    switch (opLoja) {
                        case 1:
                            System.out.println("=======================================");
                            System.out.println("         Adicionar Produtos            ");
                            System.out.println("=======================================");
                            sp1.cadastrarProduto(p1);
                            sp1.cadastrarProduto(p8);
                            sp1.cadastrarProduto(p6);
                            break;
                        case 2:
                            System.out.println("=======================================");
                            System.out.println("            Produtos da Loja           ");
                            System.out.println("=======================================");
                            sp1.listarProdutos();
                            break;
                        case 3:
                            System.out.println("=======================================");
                            System.out.println("         Remover Produtos              ");
                            System.out.println("=======================================");
                            sp1.removerProduto("batom rosa");
                            break;
                        case 4:
                            System.out.println("=======================================");
                            System.out.println("        Atualizar Produtos             ");
                            System.out.println("=======================================");
                            sp1.atualizarProduto("batom vermelho", "batom vinho");


                        case 5:
                            System.out.println("========================================");
                            System.out.println("Obrigada pela preferência, até a próxima");
                            System.out.println("              Equipe Imake              ");
                            System.out.println("========================================");
                            break;
                    }
                } while (opLoja != 5);
            }

            if (tipoUsuario == 3) {
                do {
                    System.out.println("=======================================");
                    System.out.println("                 Imake                 ");
                    System.out.println("     Seja Bem vindo a suas entregas    ");
                    System.out.println("=======================================");
                    System.out.println("[1]- Entrega finalizada");
                    System.out.println("[2]- Exibir entregas ");
                    System.out.println("[3]- Exibir comissões");
                    System.out.println("[4]- Alterar dados cadastrais");
                    System.out.println("[5]- Sair");

                    System.out.println("Escolha uma opção:  ");
                    opEntregador = sc.nextInt();

                    switch (opEntregador) {
                        case 1:
                            System.out.println("=======================================");
                            System.out.println("          Finalizar Entrega            ");
                            System.out.println("=======================================");
                            entregador.concluirEntrega(115.25);
                            break;
                        case 2:
                            System.out.println("=======================================");
                            System.out.println("           Suas Entregas               ");
                            System.out.println("=======================================");
                            entregador.exibirEntregas();
                            break;
                        case 3:
                            System.out.println("=======================================");
                            System.out.println("           Suas comissões              ");
                            System.out.println("=======================================");
                            entregador.exibirComissoes();
                            break;
                        case 4:
                            System.out.println("=======================================");
                            System.out.println("      Alterar dados Cadastrais         ");
                            System.out.println("=======================================");
                            serviceEntregador.atualizarEntregador("João", "01234567890", "83987585856", "joao@email.com", "r. Esperança, n89", "moto");
                            break;

                        case 5:
                            System.out.println("========================================");
                            System.out.println("Obrigada pela preferência, até a próxima");
                            System.out.println("              Equipe Imake              ");
                            System.out.println("========================================");
                            break;
                    }
                } while (opEntregador != 5);
            }
    }

}



              /*  loja1.adicionarProduto(p1);
                loja1.adicionarProduto(p2);
                loja1.adicionarProduto(p3);
                loja1.adicionarProduto(p4);
                loja1.adicionarProduto(p5);
                loja1.adicionarProduto(p6);
                loja1.adicionarProduto(p7);
                loja1.adicionarProduto(p8);
                loja1.adicionarProduto(p9);
                loja1.adicionarProduto(p10);

                System.out.println("login deu certo!");
                System.out.println("Lista de produtos na loja: ");
                service.exibirProdutos();*/





        /* Main Raíssa (não mexer, obg <3):
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
    */




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

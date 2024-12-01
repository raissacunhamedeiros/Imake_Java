import model.Cliente;
import model.Loja;
import model.Produto;
import service.ServiceCliente;
import service.ServiceEntregador;
import service.ServiceLoja;
import service.ServiceProduto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opCliente;
        int clienteCarrinho;
        String escolherLoja;

        ServiceCliente serviceClienteTeste = new ServiceCliente();

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
        /*int tipo_usuario = sc.nextInt();*/
        int tipoUsuario = sc.nextInt();

        if (tipoUsuario == 1) {
            fluxoCliente(sc, serviceClienteTeste);
        } else if (tipoUsuario == 2) {
            fluxoLoja(sc, new ServiceLoja());
            System.out.println("Fluxo de loja em construção...");
        } else if (tipoUsuario == 3) {
            System.out.println("Fluxo de entregador em construção...");
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void fluxoCliente(Scanner sc, ServiceCliente serviceCliente) {
        System.out.println("Se desejar realizar o login digite (L), se desejar se cadastrar digite (C)");
        String login_cadastro = sc.next();

        if (login_cadastro.equalsIgnoreCase("l")) {
            // Login do cliente
            System.out.println("Digite o seu email: ");
            String email = sc.next();
            System.out.println("Digite a sua senha: ");
            String senha = sc.next();

            if (serviceCliente.verificarInfos(email, senha)) {
                System.out.println("Login realizado com sucesso!");
                menuCliente(sc, serviceCliente);
            } else {
                System.out.println("Email ou senha inválidos.");
            }

        } else if (login_cadastro.equalsIgnoreCase("c")) {
            // Cadastro do cliente
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            System.out.println("Digite seu email: ");
            String email = sc.next();
            System.out.println("Digite uma senha: ");
            String senha = sc.next();

            //Cliente novoCliente = new Cliente(nome, email, senha);
            //serviceCliente.cadastrarCliente(novoCliente);

            //System.out.println("Cadastro realizado com sucesso!");
            //menuCliente(sc, serviceCliente);
        } else {
            System.out.println("Opção inválida! Retornando ao menu inicial.");
        }
    }

    public static void fluxoLoja(Scanner sc, ServiceLoja serviceLoja) {
        ServiceLoja service = new ServiceLoja();

        Loja loja1 = new Loja(1, "001.002.003/0001-04", "MakeDelas", "23123", "a", "algum lugar", "123");

        service.cadastrarLoja(loja1);

        System.out.println("Se desejar realizar o login digite (L), se desejar se cadastrar digite (C)");
        String escolhaLoja = sc.next();

        if (escolhaLoja.equalsIgnoreCase("l")) {
            System.out.println("Digite o seu email!: ");
            String email = sc.next();
            System.out.println("Digite a sua senha!: ");
            String senha = sc.next();

            //validacao não funcional

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

                loja1.adicionarProduto(p1);
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
                service.exibirProdutos();
        } else {
            System.out.println("Cadastro de lojas não implementado!");
        }
    }

        /*if (tipo_usuario == 1) {
            System.out.println("Se desejar realizar o login digite (L), se desejar se cadastrar digite (C)");
            String escolhaUsuario = sc.next();
            if (escolhaUsuario.equalsIgnoreCase("l")) {
                System.out.println("Digite o seu email!: ");
                String email = sc.next();
                System.out.println("Digite a sua senha!: ");
                String senha = sc.next();

                boolean resultado = serviceClienteTeste.verificarInfos(email, senha);
                if (resultado == true) {
                    System.out.println("login deu certo!");
                    //menuCliente()
                } else {
                    System.out.println("login deu errado!");
                }
            } else if (escolhaUsuario.equalsIgnoreCase("c")) {
                //cadastro do usuario
                System.out.println("Digite seu nome!: ");
        }else if (tipo_usuario == 2) {

            } System.out.println("Se desejar realizar o login digite (L), se desejar se cadastrar digite (C)");

            //lojas


        } else if (tipo_usuario == 3) {
            System.out.println("Se desejar realizar o login digite (L), se desejar se cadastrar digite (C)");
            //entregadores
        }*/

    //Fluxo cliente:
    // tela Cliente:
    public static void menuCliente(Scanner sc, ServiceCliente serviceCliente) {
        int opCliente;
        do {
            System.out.println("=======================================");
            System.out.println("                 Imake                 ");
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
                    //Selecionar a loja
                    //listar lojas: listarLojas();
                    break;
                //Método para chamar as lojas (listar.loja?)
                case 2:
                    menuCarrinho(sc);
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.println("          Realizar compra              ");
                    System.out.println("=======================================");
                    realizarCompra();
                    break;

                // Metodo de vendas
                case 4:
                    System.out.println("========================================");
                    System.out.println("Obrigada pela preferência, até a próxima");
                    System.out.println("              Equipe Imake              ");
                    System.out.println("========================================");
                    break;
            }
        } while (opCliente != 4);
    }

    //Menu carrinho
    public static void menuCarrinho(Scanner sc) {
        System.out.println("=======================================");
        System.out.println("         Bem vindo ao carrinho         ");
        System.out.println("=======================================");
        System.out.println("[1] - Ver carrinho ");
        System.out.println("[2] - Remover produto");
        System.out.println("[3] - Limpar carrinho");
        System.out.println("[4] - Voltar para o menu");
        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                // Exibir carrinho
                break;

            case 2:
                // Remover produto
                break;

            case 3:
                // Limpar carrinho
                break;

            case 4:
                // Voltar
                break;

            default:
                System.out.println("Opção inválida! Retornando ao menu.");
        }
    }

    // Metodo para compra

    public static void realizarCompra() {
        System.out.println("=======================================");
        System.out.println("          Realizar compra              ");
        System.out.println("=======================================");
        // Implementar lógica de compra
    }
    public static void menuLoja(Scanner sc, ServiceLoja serviceLoja) {
        int opLoja;
        do {
            System.out.println("=======================================");
            System.out.println("                 Imake                 ");
            System.out.println("   Seja Bem vindo a sua loja virtual!  ");
            System.out.println("=======================================");
            System.out.println("[1]- Adicionar Produto ");
            System.out.println("[2]- Listar produtos ");
            System.out.println("[3]- Remover Produtos");
            System.out.println("[4]-Buscar Produtos por nome");
            System.out.println("[5]-Entrega");
            System.out.println("[6]-Sair");

            System.out.println("Escolha uma opção:  ");
            opLoja = sc.nextInt();

            switch (opLoja) {
                case 1:
                    System.out.println("=======================================");
                    System.out.println("         Adicionar Produtos            ");
                    System.out.println("=======================================");

                    //addproduto();
                    break;
                case 2:
                    System.out.println("=======================================");
                    System.out.println("           Seus Produtos               ");
                    System.out.println("=======================================");
                    //listarprodutos();
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.println("         Remover Produtos              ");
                    System.out.println("=======================================");
                    //removerProdutos
                    break;

                // buscarprod por nome
                case 4:
                    System.out.println("=======================================");
                    System.out.println("        Pesquisar Produtos             ");
                    System.out.println("=======================================");
                    //pesquisarprodutos();

                case 5:
                    //submenu buscar entregador / exibir entregador, remover entregador

                case 6:
                    System.out.println("========================================");
                    System.out.println("Obrigada pela preferência, até a próxima");
                    System.out.println("              Equipe Imake              ");
                    System.out.println("========================================");
                    break;
            }
        } while (opLoja != 6);
    }
    public static void menuEntregador(Scanner sc, ServiceEntregador serviceEntregador) {
        int opEntregador;
        do {
            System.out.println("=======================================");
            System.out.println("                 Imake                 ");
            System.out.println("     Seja Bem vindo a suas entregas    ");
            System.out.println("=======================================");
            System.out.println("[1]- Entrega");
            System.out.println("[2]- Exibir entregas ");
            System.out.println("[3]- Exibir comissões");
            System.out.println("[4]- Alterar dados cadastrais");
            System.out.println("[5]- Sair");

            System.out.println("Escolha uma opção:  ");
            opEntregador = sc.nextInt();

            switch (opEntregador) {
                case 1:
                    System.out.println("=======================================");
                    System.out.println("      Entrega/ concluir entrega        ");
                    System.out.println("=======================================");

                    //addproduto();
                    break;
                case 2:
                    System.out.println("=======================================");
                    System.out.println("           Suas Entregas               ");
                    System.out.println("=======================================");
                    //listarprodutos();
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.println("           Suas comissões              ");
                    System.out.println("=======================================");
                    //chamar funç
                    break;

                // buscarprod por nome
                case 4:
                    System.out.println("=======================================");
                    System.out.println("      Alterar dados Cadastrais         ");
                    System.out.println("=======================================");
                    //chamar func();

                case 5:
                    System.out.println("========================================");
                    System.out.println("Obrigada pela preferência, até a próxima");
                    System.out.println("              Equipe Imake              ");
                    System.out.println("========================================");
                    break;
            }
        } while (opEntregador != 5);
    }

    //tela loja
}





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

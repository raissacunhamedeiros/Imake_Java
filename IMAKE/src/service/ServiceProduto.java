package service;
import model.Produto;
import model.Loja;
import java.util.Scanner;



public class ServiceProduto {

    //Cadastrando o produto:
    public void cadastrarProduto(Fake_DB data, int idLoja) {
        // Busca a loja específica pelo ID
        Loja lojaAtual = data.buscarPorId(idLoja);
        if (lojaAtual == null) {
            System.out.println("Loja com ID " + idLoja + " não encontrada!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            // Criação do produto com entrada de dados
            Produto produto = new Produto();

            System.out.println("Digite o nome do produto: ");
            produto.setNome(sc.next());

            System.out.println("Digite o IDProduto: ");
            produto.setIDProduto(sc.next());

            System.out.println("Digite a quantidade de entrada no estoque: ");
            produto.setEstoque(sc.nextInt());

            System.out.println("Digite o valor do produto: R$ ");
            produto.setPreco(sc.nextDouble());

            lojaAtual.adicionarProduto(produto);
            System.out.println("Produto cadastrado com sucesso na loja " + lojaAtual.getNome() + "!");

            // Pergunta se deseja cadastrar outro produto
            System.out.println("Você gostaria de cadastrar outro produto para a mesma loja? [S/N]");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("S"));
    }
}


    //public ArrayList<Produto>listar(){
        //return ;

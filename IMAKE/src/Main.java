import model.Loja;
import model.Produto;
import service.ServiceProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ServiceProduto SP = new ServiceProduto();
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
                }
            } else {
                System.out.println("aq");
            }
        }

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
package service;
import model.Produto;
import model.Loja;

public class ServiceProduto {
    private Loja loja;

    //Construtor para garantir que esteja em uma loja por vez;
    public ServiceProduto(Loja loja){
        this.loja= loja;
    }

    public void cadastrarProduto(Produto produto) {
        loja.adicionarProduto(produto);
        System.out.println("Cadastro efetuado com sucesso");
    }

    //Listar

    public void listarProdutos() {
        if (loja.getProdutos().isEmpty()) {
            System.out.println("A loja " + loja.getNome() + " não possui produtos cadastrados.");
            return;
        }
        System.out.println("Produtos da loja " + loja.getNome() + ":");
        for (Produto produto : loja.getProdutos()) {
            System.out.println(produto); // Usa o toString da classe Produto
        }
    }

    //Atualizar
    public void atualizarProduto(String nomeProduto, String novoNome) {
        Produto produto = loja.buscarProdutoPorNome(nomeProduto);
        if (produto != null) {
            produto.setNome(novoNome);
            System.out.println("Produto " + nomeProduto + " atualizado para " + novoNome + " na loja " + loja.getNome());
        } else {
            System.out.println("Produto " + nomeProduto + " não encontrado na loja " + loja.getNome());
        }
    }

    // Remover um produto pelo nome
    public void removerProduto(String nomeProduto) {
        Produto produto = loja.buscarProdutoPorNome(nomeProduto);
        if (produto != null) {
            loja.removerProduto(produto);
            System.out.println("Produto " + nomeProduto + " removido da loja " + loja.getNome());
        } else {
            System.out.println("Produto " + nomeProduto + " não encontrado na loja " + loja.getNome());
        }
    }
}


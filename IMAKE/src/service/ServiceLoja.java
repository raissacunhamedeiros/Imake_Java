package service;
import model.Loja;
import java.util.ArrayList;

public class ServiceLoja {
    private Loja loja;

    // Construtor
    public ServiceLoja(Loja loja) {
        this.loja = loja;
    }

    // Cadastrar uma loja
    public void cadastrarLoja(Loja novaLoja) {
        this.loja = novaLoja;
        System.out.println("Loja " + loja.getNome() + " cadastrada com sucesso!");
    }

    // Atualizar informações da loja
    public void atualizarLoja(String novoNome, String novoEndereco, String novoTelefone, String novoEmail) {
        loja.setNome(novoNome);
        loja.setEndereco(novoEndereco);
        loja.setTelefone(novoTelefone);
        loja.setEmail(novoEmail);
        System.out.println("Loja " + loja.getNome() + " atualizada com sucesso!");
    }

        // Buscar loja pelo nome
    public Loja buscarLojaPorNome(String nome) {
        if (loja.getNome().equalsIgnoreCase(nome)) {
            return loja;
        }
        System.out.println("Loja com nome " + nome + " não encontrada.");
        return null;
    }

}

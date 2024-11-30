package service;
import com.sun.source.tree.BreakTree;
import model.Entregador;
import model.Loja;
import model.Produto;

import java.util.ArrayList;

public class ServiceLoja {
    private Loja loja;
    private final ArrayList<Loja> lojas = new ArrayList<>();

    // Construtor
    public ServiceLoja(Loja loja) {
        this.loja = loja;
    }

    public ServiceLoja() { }

    // Cadastrar uma loja
    public void cadastrarLoja(Loja novaLoja) {
        this.loja = novaLoja;
        System.out.println("Loja " + loja.getNome() + " cadastrada com sucesso!");
    }

    //exibir
    public void exibirProdutos() {
        System.out.println("algo");
        for (Produto produto : loja.getEstoque()) {
            System.out.println(produto);
        }
    }

    //verificar infos
    public boolean verifcarInfo(String email, String senha) {
        for (Loja loja : lojas) {
            if (loja.getEmail().equals(email) && loja.getSenha().equals(senha)) {
                return true;
            }
        } return false;
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
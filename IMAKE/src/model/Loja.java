package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    //variaveis
    private String CNPJ, nome, telefone, email, endereco, senha;
    private int ID;
    private List<Produto> estoque;

    //contrutor
    public Loja(int ID, String CNPJ, String nome, String telefone, String email, String endereco, String senha) {
        this.ID = ID;
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.estoque = new ArrayList<>();
    }

    public Loja() {

    }

    ;

    //get e set

    public List<Produto> getEstoque() {
        return estoque;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getID() {
        return ID;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    // Métodos para manipular os produtos
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null; // Retorna null se não encontrar
    }

}



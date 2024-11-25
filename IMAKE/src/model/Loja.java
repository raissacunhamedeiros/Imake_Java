package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    //variaveis
    private String ID, CNPJ, nome, telefone, email, endereco, senha;
    private List<Produto> estoque;

    //contrutor
    public Loja(String ID, String CNPJ, String nome, String telefone, String email, String endereco, String senha) {
        this.ID = ID;
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.estoque = new ArrayList<>();
    }

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

    public String getID() {
        return ID;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void adicionarProduto(Produto produto) {
        this.estoque.add(produto);
    }
}

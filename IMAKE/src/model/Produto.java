package model;

public class Produto {
    private String IDProduto, nome;
    private int estoque;
    private double preco;

    //Construtor

    public Produto(String nome, int estoque, double preco, String IDProduto) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.IDProduto = IDProduto;
    }

    public Produto(){

    }

    //Get e set

    public String getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(String IDProduto) {
        this.IDProduto = IDProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //To string

    @Override
    public String toString() {
        return "Produto{" +
                "IDProduto='" + IDProduto + '\'' +
                ", nome='" + nome + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                '}';
    }
}

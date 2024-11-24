package model;

public class Produto {
    private String IDProduto, nome;
    private int estoque;
    private float preco;

    //Construtor
    public Produto(String IDProduto, String nome, int estoque, float preco) {
        this.IDProduto = IDProduto;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    //Get e set

    public String getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(String IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
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

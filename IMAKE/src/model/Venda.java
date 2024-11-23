package model;

public class Venda {
    private Pessoa pessoa;
    private Loja loja;

    public Venda(Pessoa pessoa, Loja loja) {
        this.pessoa = pessoa;
        this.loja = loja;
    }

    public Loja getLoja() {
        return loja;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}

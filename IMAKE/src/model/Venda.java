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


/*
Classe Venda:
atributos: produtos vendidos / valor total / juros/imposto/taxas/etc
/forma de pagamento / loja responsavel

na ServiceVenda:
metodos para gerenciar a venda:
calcular jutos/taxas/lucros/etc
gerar nota fiscal simplificada
 */
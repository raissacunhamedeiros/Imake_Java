package service;

import model.Loja;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Fake_DB {
    private List<Loja> lojas_disponiveis = new ArrayList<>();
    private List<Produto> estoque;

    public List<Loja> getLojas_disponiveis() {
        return lojas_disponiveis;
    }

    public void setLojas_disponiveis(Loja loja) {
        lojas_disponiveis.add(loja);
    }

    public Loja buscarPorId(int id) {
        for (Loja loja : lojas_disponiveis) {
            if (loja.getID() == id) {
                return loja;
            }
        }
        return null;
    }
}

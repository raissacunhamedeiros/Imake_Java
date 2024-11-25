package service;
import model.Produto;
import service.Fake_DB;

import java.util.ArrayList;

public class ServiceProduto {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produtoTeste){
        estoque.add(produtoTeste);
        System.out.println("cadastro realizado com sucesso!");
    }

    public ArrayList<Produto>listar(){
        return produtos;
    }
}

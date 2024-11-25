package service;
import model.Produto;

import java.util.ArrayList;

public class ServiceProduto {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produtoTeste){
        produtos.add(produtoTeste);
        System.out.println("cadastro realizado com sucesso!");
    }

    public ArrayList<Produto>listar(){
        return produtos;
    }
}

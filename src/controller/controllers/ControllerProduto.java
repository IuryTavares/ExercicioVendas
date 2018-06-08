package controller.controllers;

import model.beans.Produto;

import java.lang.reflect.Array;
import java.util.*;

public class ControllerProduto implements java.io.Serializable{
    private ArrayList<Produto> produtos;

    public ControllerProduto() {
        this.produtos = new ArrayList<Produto>();
    }

    public boolean produtoExist(String codigo) {
        for (Produto produto : produtos) {
            if (codigo.equals(produto.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    public void produtoAddNew() {
        Produto p = new Produto();
        if (produtoExist(p.getCodigo())) {
            System.out.println("Produto já existe.");
            return;
        }
        produtos.add(p);
        System.out.println("Produto cadastrado.");
        return;
    }
    public Produto produtoFind(String codigo){
        for(Produto produto : produtos){
            if(codigo.equals(produto.getCodigo())){
                return produto;
            }
        }
        System.out.println("Produto não existe.");
        return null;
    }
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

}




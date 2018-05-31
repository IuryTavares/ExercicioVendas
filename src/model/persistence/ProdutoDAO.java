package model.persistence;

import model.beans.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private List<Produto> repositorio;
    private static ProdutoDAO instance = new ProdutoDAO();

    private ProdutoDAO() {
        this.repositorio = new ArrayList<Produto>();
    }

    public static ProdutoDAO getInstance() {
        return instance;
    }

    public void salvar(Produto produto) {
        // adicionar o produto
        this.repositorio.add(produto);
    }
    public List listarTodos() {
        return this.repositorio;
    }
}

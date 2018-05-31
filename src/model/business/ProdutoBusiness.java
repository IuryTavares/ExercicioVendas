package model.business;

import model.beans.Produto;
import model.persistence.ProdutoDAO;

import java.util.List;

public class ProdutoBusiness {
        private static ProdutoBusiness instance = new ProdutoBusiness();

        public static ProdutoBusiness getInstance(){
            return instance;
        }
        public void salvar(Produto produto){
            ProdutoDAO.getInstance().salvar(produto);
        }
        public List listarTodos(){
            return ProdutoDAO.getInstance().listarTodos();
        }
}

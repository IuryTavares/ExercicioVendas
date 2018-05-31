package model.business;

import model.beans.Vendedor;
import model.persistence.VendedorDAO;

import java.util.List;

public class VendedorBusiness {
    private static VendedorBusiness instance = new VendedorBusiness();

    public static VendedorBusiness getInstance(){
        return instance;
    }
    public void salvar(Vendedor vendedor){
        VendedorDAO.getInstance().salvar(vendedor);
    }
    public List listarTodos(){
        return VendedorDAO.getInstance().listarTodos();
    }
}

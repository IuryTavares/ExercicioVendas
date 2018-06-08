package controller.controllers;

import model.beans.Vendedor;

import java.util.ArrayList;

public class ControllerVendedor implements java.io.Serializable {
    private ArrayList<Vendedor> vendedores;

    public ControllerVendedor(){
        this.vendedores = new ArrayList<Vendedor>();
    }

    public boolean vendedorExist(String matricula){
        for(Vendedor vendedor : vendedores){
            if(matricula.equals(vendedor.getMatricula())) {
                return true;
            }
        }
        return false;
    }
    public Vendedor vendedorFind(String matricula){
        for(Vendedor vendedor : vendedores){
            if(matricula.equals(vendedor.getMatricula())){
                return vendedor;
            }
        }
        System.out.println("Vendedor não existe.");
        return null;
    }
    public void vendedorAddNew(){
        Vendedor vendedor = new Vendedor();
        if (vendedorExist(vendedor.getCpf())){
            System.out.println("Vendedor já existe.");
        }
        vendedores.add(vendedor);
        System.out.println("vendedor cadastrado.");
    }
    public ArrayList<Vendedor> getVendedores(){
        return vendedores;
    }
}

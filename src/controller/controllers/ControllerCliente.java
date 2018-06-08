package controller.controllers;

import model.beans.Cliente;

import java.util.ArrayList;

public class ControllerCliente implements java.io.Serializable {
    private ArrayList<Cliente> clientes;

    public ControllerCliente(){
        this.clientes = new ArrayList<Cliente>();
    }
    public boolean clienteExist(String cpf){
        for(Cliente cliente: clientes){
            if(cpf.equals(cliente.getCpf()))
                return true;
        }
        return false;
    }
    public Cliente clienteFind(String cpf){
        for(Cliente cliente : clientes){
            if(cpf.equals(cliente.getCpf()))
                return cliente;
        }
        return null;
    }
    public void clienteAddNew(){
        Cliente cliente = new Cliente();
        if(clienteExist(cliente.getCpf())){
            System.out.println("Cliente já existe");
            return;
        }
        clientes.add(cliente);
        System.out.println("Cliente cadastrado.");
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
}

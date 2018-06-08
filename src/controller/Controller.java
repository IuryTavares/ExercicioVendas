package controller;


import controller.controllers.ControllerCliente;
import controller.controllers.ControllerProduto;
import controller.controllers.ControllerVendedor;
import model.beans.Venda;
import model.persistence.SalvarController;
import view.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements java.io.Serializable{
    private ViewGUI view;
    private ControllerCliente clientes;
    private ControllerProduto produtos;
    private ControllerVendedor vendedores;
    private ArrayList<Venda> vendas;

    public Controller(){
        this.view = new ViewGUI();
        this.clientes = new ControllerCliente();
        this.produtos = new ControllerProduto();
        this.vendedores = new ControllerVendedor();
        this.vendas = new ArrayList<>();

    }

    public void run(){
        int opcao = 0;
        while(opcao != 9){
            this.view.exibirMenu();
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();

        switch(opcao){
            case 1: {
                this.clientes.clienteAddNew();
                break;
            }
            case 2: {
                this.view.listarClientes(clientes.getClientes());
                break;
            }
            case 3: {
                this.vendedores.vendedorAddNew();
                break;
            }
            case 4:{
                this.view.listarVendedores(vendedores.getVendedores());
                break;
            }
            case 5:{
                this.produtos.produtoAddNew();
                break;
            }
            case 6:{
                this.view.listarProdutos(produtos.getProdutos());
                break;
            }
            case 7: {
                Venda venda = new Venda(produtos,clientes,vendedores);
                if (!(venda.getVendedor().equals(null) && venda.getCliente().equals(null) && venda.getProduto().equals(null))) {
                    this.vendas.add(venda);
                    break;
                }
                System.out.println("A venda não pode ser realizada.");
                break;
            }
            case 8: {
                this.view.relatorioVendas(vendas);
                break;
            }
            case 9:{
                SalvarController out = new SalvarController();
                out.salvarController(this);
                break;
            }
        }}
    }
}

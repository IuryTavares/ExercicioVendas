package view;

import model.beans.Cliente;
import model.beans.Produto;
import model.beans.Venda;
import model.beans.Vendedor;


import java.util.*;

public class ViewGUI implements java.io.Serializable {

    public static void exibirMenu(){
        System.out.println("" +
                "    ----------------------------\n" +
                "    ----- SISTEMA DE VENDAS ----\n" +
                "    ----------------------------\n" +
                "    (1) Cadastrar Cliente\n" +
                "    (2) Listar Clientes\n" +
                "    (3) Cadastrar Vendedor\n" +
                "    (4) Listar Vendedores\n" +
                "    (5) Cadastrar Produto\n" +
                "    (6) Listar Produtos\n" +
                "    (7) Registrar Venda\n" +
                "    (8) Relatório de Vendas\n" +
                "    (9) Sair\n" +
                "    ----------------------------");
    }
    public void listarClientes(ArrayList<Cliente> clientes) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Clientes  ----");
        System.out.println("----------------------------");

        for (Cliente cliente : clientes) {
            System.out.println("Nome: \t" + cliente.getNome());
            System.out.println("Email: \t" + cliente.getEmail());
            System.out.println("Telefone: \t" + cliente.getTelefone());
            System.out.println("Endereço: \t" + cliente.getEndereco());
            System.out.println("CPF: \t" + cliente.getCpf());
            System.out.println("Data de Aniversario: \t" + cliente.getDataAniversario());
            System.out.println("Limite de Credito: \t" + cliente.getLimiteCredito());
        }

    }
    public void listarVendedores(ArrayList<Vendedor> vendedores){
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar Vendedores ----");
        System.out.println("----------------------------");

        for (Vendedor vendedor : vendedores) {
            System.out.println("Nome: \t" + vendedor.getNome());
            System.out.println("Email: \t" + vendedor.getEmail());
            System.out.println("Telefone: \t" + vendedor.getTelefone());
            System.out.println("Endereço: \t" + vendedor.getEndereco());
            System.out.println("CPF: \t" + vendedor.getCpf());
            System.out.println("Data de Aniversario: \t" + vendedor.getDataAniversario());
            System.out.println("Matricula:\t" + vendedor.getMatricula());

        }
    }
    public void listarProdutos(ArrayList<Produto> produtos){
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar Produtos ----");
        System.out.println("----------------------------");

        for (Produto produto : produtos) {
            System.out.println("Nome: \t" + produto.getNome());
            System.out.println("Preço: \t" + produto.getPreco());
            System.out.println("Peso: \t" + produto.getPeso());
            System.out.println("Estoque Minimo: \t" + produto.getEstoqueMinimo());
        }
    }
    public void relatorioVendas(ArrayList<Venda> vendas){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("---- Relatório de Vendas ----");
        System.out.println("-----------------------------");
        for(Venda venda: vendas){
            System.out.println("Cliente: \t" +venda.getCliente().getNome());
            System.out.println("Produto: \t" + venda.getProduto().getNome() + "\tQuantidade: \t" + venda.getQuantidade());
            System.out.println("Data: \t" + venda.getDataVenda());
            System.out.println("-----------------------------");
        }
}}

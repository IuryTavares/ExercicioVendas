package model.beans;

import controller.controllers.ControllerCliente;
import controller.controllers.ControllerProduto;
import controller.controllers.ControllerVendedor;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Venda implements java.io.Serializable{
    private Date dataVenda;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda(ControllerProduto produtos, ControllerCliente clientes, ControllerVendedor vendedores){
        Scanner in = new Scanner(System.in);
        dataVenda = new Date();
        System.out.println("Digite o codigo do produto:");
        this.produto = produtos.produtoFind(in.nextLine());
        if(produto.equals(null)){
            return;
        }
        System.out.println("Digite o seu cpf:");
        this.cliente = clientes.clienteFind(in.nextLine());
        if(cliente.equals(null)){
            return;
        }
        System.out.println("Matricula do vendedor:");
        this.vendedor = vendedores.vendedorFind(in.nextLine());
        if(vendedor.equals(null)){
            return;
        }
        System.out.println("Quantidade:\tEstoque Atual:\t"+this.produto.getEstoqueAtual());
        this.quantidade = in.nextInt();
        while (this.quantidade > produto.getEstoqueAtual()){
            System.out.println("tente novamente.");
            this.quantidade = in.nextInt();
        }

    }

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return quantidade == venda.quantidade &&
                Objects.equals(dataVenda, venda.dataVenda) &&
                Objects.equals(produto, venda.produto) &&
                Objects.equals(cliente, venda.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataVenda, produto, quantidade, cliente);
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() { return vendedor; }

    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor;  }
}

package model.beans;

import java.util.Date;
import java.util.Objects;

public class Venda {
    private Date dataVenda;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Vendedor vendedor;

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

package model.beans;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Produto implements java.io.Serializable{
    private String nome;
    private String codigo;
    private double preco;
    private double peso;
    private int estoqueMinimo;
    private int estoqueAtual;

    public Produto(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nome do produto:");
        this.setNome(in.nextLine());
        System.out.println("Código:");
        this.setCodigo(in.nextLine());
        System.out.println("Preço:");
        this.setPreco(in.nextDouble());
        System.out.println("Peso");
        this.setPeso(in.nextDouble());
        System.out.println("Estoque mínimo:");
        this.setEstoqueMinimo(in.nextInt());
        System.out.println("Estoque Atual:");
        this.setEstoqueAtual(in.nextInt());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoqueMinimo() {  return estoqueMinimo;  }

    public void setEstoqueMinimo(int estoqueMinimo) {    this.estoqueMinimo = estoqueMinimo;   }

    public int getEstoqueAtual() {     return estoqueAtual;   }

    public void setEstoqueAtual(int estoqueAtual) {     this.estoqueAtual = estoqueAtual;   }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", estoqueMinimo=" + estoqueMinimo +
                ", estoqueAtual=" + estoqueAtual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
                Double.compare(produto.peso, peso) == 0 &&
                estoqueMinimo == produto.estoqueMinimo &&
                estoqueAtual == produto.estoqueAtual &&
                Objects.equals(nome, produto.nome) &&
                Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, codigo, preco, peso, estoqueMinimo, estoqueAtual);
    }
}

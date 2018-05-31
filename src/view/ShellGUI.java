package view;

import model.beans.Cliente;
import model.beans.Produto;
import model.beans.Vendedor;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShellGUI {
    Scanner in;

    public ShellGUI(){
        this.in = new Scanner(System.in);
    }
    public void exibirMenu(){
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
    public String lerComando(String prompt){
        System.out.println(prompt);
        return in.nextLine();
    }
    public Map<String, String> cadastrarCliente(){
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Cliente ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Email: ");
        dados.put("email", this.in.nextLine());

        System.out.println("Telefone: ");
        dados.put("telefone", this.in.nextLine());

        System.out.println("Endereço: ");
        dados.put("endereco", this.in.nextLine());

        System.out.println("CPF: ");
        dados.put("cpf", this.in.nextLine());

        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
        dados.put("dataAniversario", this.in.nextLine());

        System.out.println("Limite de crédito: ");
        dados.put("limiteCredito", this.in.nextLine());

        return dados;
    }
    public Map<String, String> cadastrarVendedor(){
        Map<String, String> dados1 = new HashMap<String, String>();
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- CADASTRAR VENDEDOR ---");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados1.put("nome", this.in.nextLine());

        System.out.println("Matricula: ");
        dados1.put("matricula", this.in.nextLine());

        System.out.println("Email: ");
        dados1.put("email", this.in.nextLine());

        System.out.println("Telefone: ");
        dados1.put("telefone", this.in.nextLine());

        System.out.println("Endereço: ");
        dados1.put("endereco", this.in.nextLine());

        System.out.println("CPF: ");
        dados1.put("cpf", this.in.nextLine());

        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
        dados1.put("dataAniversario", this.in.nextLine());

        System.out.println("Data de contratação: ");
        dados1.put("dataContratacao", this.in.nextLine());

        return dados1;

    }
    public Map<String, String> cadastrarProduto(){
        Map<String, String> dados2 = new HashMap<String, String>();
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- CADASTRAR PRODUTO ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados2.put("nome", this.in.nextLine());

        System.out.println("Preço: ");
        dados2.put("preco", this.in.nextLine());

        System.out.println("Peso: ");
        dados2.put("peso", this.in.nextLine());

        System.out.println("Estoque minimo: ");
        dados2.put("estoqueminimo", this.in.nextLine());

        return dados2;
    }

    public void listarClientes(List<Cliente> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Clientes  ----");
        System.out.println("----------------------------");

        for (Cliente c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereço: \t" + c.getEndereco());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Limite de Credito: \t" + c.getLimiteCredito());
        }

    }
    public void listarVendedores(List<Vendedor> list){
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar Vendedores ----");
        System.out.println("----------------------------");

        for (Vendedor c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereço: \t" + c.getEndereco());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Matricula:\t" + c.getMatricula());
            System.out.println("Data de Contratação:\t" + c.getDataContratacao());
        }
    }
    public void listarProdutos(List<Produto> list){
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar Produtos ----");
        System.out.println("----------------------------");

        for (Produto c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Preço: \t" + c.getPreco());
            System.out.println("Peso: \t" + c.getPeso());
            System.out.println("Estoque Minimo: \t" + c.getEstoqueMinimo());
        }
    }
}

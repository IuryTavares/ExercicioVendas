package controller;

import model.beans.Cliente;
import model.beans.Produto;
import model.beans.Vendedor;
import model.business.ClienteBusiness;
import model.business.ProdutoBusiness;
import model.business.VendedorBusiness;
import view.ShellGUI;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FrontController {
    private final ShellGUI view;

    public FrontController(ShellGUI view) {
        this.view = view;
    }

    public void run() throws IOException {
        String cmd;
        this.view.exibirMenu();

        while ((cmd = view.lerComando("DIGITE UMA OPÇÃO > ")) != null) {

            if ("1".equals(cmd)) {
                // cadastrar cliente
                Map<String, String> dados = this.view.cadastrarCliente();

                Cliente cliente = new Cliente();
                cliente.setNome(dados.get("nome"));
                cliente.setEmail(dados.get("email"));
                cliente.setTelefone(dados.get("telefone"));
                cliente.setEndereco(dados.get("endereco"));
                cliente.setCpf(dados.get("cpf"));
                cliente.setDataAniversario(dados.get("dataAniversario"));
                cliente.setLimiteCredito(Double.parseDouble(dados.get("limiteCredito")));
                ClienteBusiness.getInstance().salvar(cliente);

            } else if ("2".equals(cmd)) {

                // listar clientes
                this.view.listarClientes(ClienteBusiness.getInstance().listarTodos());

            } else if ("3".equals(cmd)){
                // cadastrar vendedor
                Map<String, String> dados1 = this.view.cadastrarVendedor();

                Vendedor vendedor = new Vendedor();
                vendedor.setNome(dados1.get("nome"));
                vendedor.setMatricula(dados1.get("matricula"));
                vendedor.setEmail(dados1.get("email"));
                vendedor.setTelefone(dados1.get("telefone"));
                vendedor.setEndereco(dados1.get("endereço"));
                vendedor.setCpf(dados1.get("cpf"));
                vendedor.setDataAniversario(dados1.get("dataAniversario"));
                vendedor.setDataContratacao(dados1.get("dataContratacao"));
                VendedorBusiness.getInstance().salvar(vendedor);


            }else if ("4".equals(cmd)){
                //listar vendedores
                this.view.listarVendedores(VendedorBusiness.getInstance().listarTodos());
            }else if ("5".equals(cmd)){
               Map<String,String> dados2 = this.view.cadastrarProduto();

                Produto produto = new Produto();
                produto.setNome(dados2.get("nome"));
                produto.setPreco(Double.parseDouble(dados2.get("preco")));
                produto.setPeso(Double.parseDouble(dados2.get("Peso")));
                produto.setEstoqueMinimo(Integer.parseInt(dados2.get("estoqueminimo")));
                ProdutoBusiness.getInstance().salvar(produto);

            }else if("6".equals(cmd)){
                this.view.listarProdutos(ProdutoBusiness.getInstance().listarTodos());
            }
            else if ("x".equals(cmd)) {

                System.exit(0);

                cmd = null;


            }

            this.view.exibirMenu();

        }

    }

}

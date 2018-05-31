package model.persistence;

import model.beans.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> repositorio;
    private static ClienteDAO instance = new ClienteDAO();

    private ClienteDAO() {
        this.repositorio = new ArrayList<Cliente>();
    }

    public static ClienteDAO getInstance() {
        return instance;
    }

    public void salvar(Cliente cliente) throws IOException {
        // adicionar o cliente
        FileWriter arq = new FileWriter("cliente.txt");
        PrintWriter gravararq = new PrintWriter(arq);



        this.repositorio.add(cliente);

        gravararq.print(repositorio);
        arq.close();
    }
    public List listarTodos() {
        return this.repositorio;
    }


}

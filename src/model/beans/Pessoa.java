package model.beans;

import java.util.Date;
import java.util.Objects;


public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String dataAniversario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario){
        this.dataAniversario = dataAniversario;
    }

  //  public void setDataAniversario(String dataAniversario) {
   //     this.dataAniversario = Util.parseDate(dataAniversario);
   // }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataAniversario=" + dataAniversario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(email, pessoa.email) &&
                Objects.equals(telefone, pessoa.telefone) &&
                Objects.equals(endereco, pessoa.endereco) &&
                Objects.equals(dataAniversario, pessoa.dataAniversario);
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getTelefone().hashCode();
        result = 31 * result + getEndereco().hashCode();
        result = 31 * result + getDataAniversario().hashCode();
        return result;
    }
}

package model.beans;

import java.util.Objects;
import java.util.Scanner;

public class PessoaFisica extends Pessoa implements java.io.Serializable{
    private String cpf;

    public PessoaFisica(){
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Cpf:");
        this.setCpf(in.nextLine());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        int result = 31 * getCpf().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PessoaFisica{\n\t" +
                super.toString() + ", \n" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}

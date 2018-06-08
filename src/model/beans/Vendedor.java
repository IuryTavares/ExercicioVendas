package model.beans;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends PessoaFisica implements java.io.Serializable{
    private String matricula;

    public Vendedor(){
        super();
        this.setMatricula(getCpf());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(matricula, vendedor.matricula);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}


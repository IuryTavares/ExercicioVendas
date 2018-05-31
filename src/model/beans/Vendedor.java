package model.beans;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends PessoaFisica{
    private String matricula;
    private String dataContratacao;

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



   // public void setDataContratacao(String dataContratacao) {
   //     this.dataContratacao = Util.parseDate(dataContratacao);
   // }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + ", " +
                "matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(matricula, vendedor.matricula) &&
                Objects.equals(dataContratacao, vendedor.dataContratacao);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMatricula().hashCode();
        result = 31 * result + getDataContratacao().hashCode();
        return result;
    }
}

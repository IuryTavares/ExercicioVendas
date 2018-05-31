package model.beans;

public class Cliente extends PessoaFisica {
    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Cliente{\n\t" +
                "SUPER=" + super.toString() + ", \n\t" +
                "limiteCredito=" + limiteCredito +
                '}';
    }
}

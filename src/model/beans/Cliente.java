package model.beans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends PessoaFisica implements java.io.Serializable{
    private double limiteCredito;

    public Cliente(){
        super();

        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Limite de crédito:");
            this.setLimiteCredito(in.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("Digite novamente, valor inválido\nLimite de crédito:");
            this.setLimiteCredito(in.nextDouble());
        }
    }

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

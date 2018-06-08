import controller.Controller;
import model.persistence.SalvarController;




public class Main implements java.io.Serializable {
    public static void main(String[] args)  {
       SalvarController in = new SalvarController();
        Controller principal = null;
        if(in.lerController().equals(null)){
            principal = new Controller();
        }
        else{
            principal = in.lerController();
        }

        principal.run();
    }
}

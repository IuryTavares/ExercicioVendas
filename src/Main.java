import controller.FrontController;
import model.beans.Cliente;
import view.ShellGUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        ShellGUI frontEnd = new ShellGUI();
        FrontController frontController = new FrontController(frontEnd);

        frontController.run();
    }
}

package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int teste = 1;
        ThreadLoop tl = new ThreadLoop();
        
        while (teste != 0) {
            teste = JOptionPane.showConfirmDialog(null, "Deseja parar o loop?");
        }
        tl.setTeste(false);

    }
}
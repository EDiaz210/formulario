import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();
        JFrame frame = new JFrame();
        frame.setSize(350,300);
        frame.setContentPane(new Formulario(principal).menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
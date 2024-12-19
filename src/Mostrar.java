import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrar {
    public JLabel mostrarClientes;
    private JButton mostrarButton;
    private JButton volverButton;

    public Mostrar() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame) SwingUtilities.getWindowAncestor(volverButton)).dispose();
                JFrame frame = new JFrame();
                frame.setSize(350,300);
                frame.setContentPane(new Formulario().menu);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

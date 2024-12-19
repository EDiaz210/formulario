import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agregar {
    public JTextField textField1;
    public JTextField textField2;
    private JButton agregarButton;
    public JPanel agregarClientes;
    private JButton volverButton;
    String[] nombre = new String[3];
    int[] cedula = new int[3];


    public Agregar() {
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
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }

        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agregar {
    public JTextField NOMBRE;
    public JTextField CEDULA;
    private JButton agregarButton;
    public JPanel agregarClientes;
    private JButton volverButton;
    private JLabel resultado;



    public Agregar(Principal principal) {
        System.out.println("Mostrar - Instancia de Principal: " + principal);
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame) SwingUtilities.getWindowAncestor(volverButton)).dispose();
                JFrame frame = new JFrame();
                frame.setSize(350,300);
                frame.setContentPane(new Formulario(principal).menu);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    principal.agregarClientes(Integer.parseInt(CEDULA.getText()), NOMBRE.getText());
                    resultado.setText("Usuario agregado exitosamente");
                } catch (NumberFormatException e1) {
                    resultado.setText("El numero de cedula no es valido");
                }
            }
        });
    }

}

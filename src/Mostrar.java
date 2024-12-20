import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrar {
    private JButton mostrarButton;
    private JButton volverButton;
    public JPanel mostrar;
    private JLabel nombre;


    public Mostrar(Principal principal) {
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

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = principal.mostrarClientes();
                if (datos.isEmpty()) {
                    nombre.setText("No hay clientes registrados.");
                } else {
                    nombre.setText("<html>" + datos.replace("\n", "<br>") + "</html>");
                }
            }
        });
    }
}
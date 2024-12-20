import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    private JButton mostrarButton;
    private JButton agregarClientesButton;
    private JButton salirButton;
    public JPanel menu;
    private Principal principal;

    public Formulario(Principal principal) {
        this.principal = principal;

        System.out.println("Formulario - Instancia de Principal: " + principal);

        agregarClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setSize(350,300);
                frame.setContentPane(new Agregar(principal).agregarClientes);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(salirButton)).dispose();


            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setSize(350,300);
                frame.setContentPane(new Mostrar(principal).mostrar);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(salirButton)).dispose();

            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(salirButton).dispose();

            }
        });
    }
}

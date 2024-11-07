package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaBoxLayout extends JFrame {
    public VentanaBoxLayout() {
        setTitle("Ejemplo de BoxLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel y establecer BoxLayout en dirección vertical (Y_AXIS)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Añadir botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));

        add(panel);
    }

    public static void main(String[] args) {
        VentanaBoxLayout ventana = new VentanaBoxLayout();
        ventana.setVisible(true);
    }
}

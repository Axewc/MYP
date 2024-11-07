package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaFlowLayout extends JFrame {
    public VentanaFlowLayout() {
        setTitle("Ejemplo de FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece FlowLayout como layout del panel
        setLayout(new FlowLayout());

        // Añadir botones al panel
        add(new JButton("Botón 1"));
        add(new JButton("Botón 2"));
        add(new JButton("Botón 3"));
        add(new JButton("Botón 4"));
        add(new JButton("Botón 5"));
    }

    public static void main(String[] args) {
        VentanaFlowLayout ventana = new VentanaFlowLayout();
        ventana.setVisible(true);
    }
}

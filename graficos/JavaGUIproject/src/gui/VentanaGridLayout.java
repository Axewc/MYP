package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaGridLayout extends JFrame {
    public VentanaGridLayout() {
        setTitle("Ejemplo de GridLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece GridLayout con 3 filas y 2 columnas
        setLayout(new GridLayout(3, 2));

        // Añadir botones a la cuadrícula
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
    }

    public static void main(String[] args) {
        VentanaGridLayout ventana = new VentanaGridLayout();
        ventana.setVisible(true);
    }
}

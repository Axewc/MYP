package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaLayoutsAnidados extends JFrame {
    public VentanaLayoutsAnidados() {
        setTitle("Ejemplo de Layouts Anidados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece BorderLayout en el marco principal
        setLayout(new BorderLayout());

        // Panel superior con FlowLayout
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Panel Superior"));
        add(panelSuperior, BorderLayout.NORTH);

        // Panel central con GridLayout
        JPanel panelCentral = new JPanel(new GridLayout(2, 2));
        panelCentral.add(new JButton("1"));
        panelCentral.add(new JButton("2"));
        panelCentral.add(new JButton("3"));
        panelCentral.add(new JButton("4"));
        add(panelCentral, BorderLayout.CENTER);

        // Panel inferior con FlowLayout
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Aceptar"));
        panelInferior.add(new JButton("Cancelar"));
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        VentanaLayoutsAnidados ventana = new VentanaLayoutsAnidados();
        ventana.setVisible(true);
    }
}

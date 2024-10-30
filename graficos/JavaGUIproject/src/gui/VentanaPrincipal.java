// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Ventana Principal con JPanel");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para agregar componentes
        JPanel panel = new JPanel(); // Panel por defecto usa FlowLayout

        // Crear componentes
        JLabel etiqueta = new JLabel("Bienvenido a la GUI con JPanel");
        JButton boton = new JButton("Haz clic aquí");

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        add(panel); // Se agrega el panel al centro de la ventana
    }
}

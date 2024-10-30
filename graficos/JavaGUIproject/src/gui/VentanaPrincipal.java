// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración básica de la ventana
        setTitle("Ventana Principal");
        setSize(400, 300); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termina el programa al cerrar la ventana

        // Crear un panel y agregar componentes
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("¡Bienvenido a la GUI en Java!");
        JButton boton = new JButton("Haz clic aquí");

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        add(panel);
    }
}

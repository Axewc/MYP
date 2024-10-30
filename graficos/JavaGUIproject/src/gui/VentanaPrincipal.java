// src/gui/VentanaPrincipal.java
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración de la ventana principal
        setTitle("Interacción de Componentes");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar el panel y su diseño
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Coloca los componentes en línea

        // Crear componentes
        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        JTextField campoTexto = new JTextField(15); // Campo de texto de 15 columnas
        JButton boton = new JButton("Mostrar nombre");
        JLabel resultado = new JLabel(""); // Etiqueta vacía para mostrar el resultado

        // Agregar componentes al panel
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        panel.add(resultado);

        // Agregar funcionalidad al botón
        boton.addActionListener(e -> {
            String nombre = campoTexto.getText();
            resultado.setText("Nombre ingresado: " + nombre);
        });

        // Agregar el panel a la ventana
        add(panel);
    }
}

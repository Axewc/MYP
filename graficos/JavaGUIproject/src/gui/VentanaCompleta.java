
package gui;

import javax.swing.*;
import java.awt.event.*;

public class VentanaCompleta extends JFrame {
    public VentanaCompleta() {
        setTitle("Ventana Completa con Listeners");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Interacciones:");
        JTextField campoTexto = new JTextField(10);
        JButton boton = new JButton("Clic");

        // Agregar ActionListener al botón
        boton.addActionListener(e -> etiqueta.setText("Botón presionado"));

        // Agregar MouseListener al campo de texto
        campoTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Campo de texto clicado");
            }
        });

        // Agregar KeyListener al campo de texto
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                etiqueta.setText("Tecla tipeada: " + e.getKeyChar());
            }
        });

        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        add(panel);
    }

    public static void main(String[] args) {
        VentanaCompleta ventana = new VentanaCompleta();
        ventana.setVisible(true);
    }
}

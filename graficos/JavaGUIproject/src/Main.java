
// src/Main.java
import javax.swing.SwingUtilities;
import gui.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        // Ejecuta la GUI en el hilo de eventos para evitar problemas de concurrencia
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}

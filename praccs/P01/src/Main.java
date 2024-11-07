import java.util.Random;

/**
 * Clase principal que simula un combate entre personajes de un videojuego.
 */
public class Main {
    public static void main(String[] args) {
        SimulacionCombate simulacion = new SimulacionCombate();
        Random rand = new Random();
        int escenario = rand.nextInt(3) + 1; // Genera un número entre 1 y 3

        Combate combate = simulacion.crearCombate(escenario);
        EspectadorConcreto espectador = new EspectadorConcreto("Espectador1", "MeganMan"); // o cualquier personaje
                                                                                           // según tu preferencia
        combate.agregarEspectador(espectador);

        combate.iniciarCombate();

        // Guardar la bitácora del espectador
        espectador.guardarBitacora();
    }
}

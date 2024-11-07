import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que representa a un espectador de un combate entre personajes de un videojuego.
 * @param id Identificador del espectador.
 * @param personajeApoyado Personaje al que apoya el espectador.
 * @param bitacora Bitácora del espectador.
 */
public class EspectadorConcreto implements Espectador {
    private String id;
    private String personajeApoyado;
    private StringBuilder bitacora;

    /**
     * Constructor de la clase EspectadorConcreto.
     * @param id Identificador del espectador.
     * @param personajeApoyado Personaje al que apoya el espectador.
     */
    public EspectadorConcreto(String id, String personajeApoyado) {
        this.id = id;
        this.personajeApoyado = personajeApoyado;
        this.bitacora = new StringBuilder();
    }

    /**
     * Actualiza la bitácora del espectador con un evento.
     */
    @Override
    public void actualizar(String evento) {
        bitacora.append(evento).append("\n");
    }

    /**
     * Guarda la bitácora del espectador en un archivo de texto.
     */
    public void guardarBitacora() {
        try (FileWriter writer = new FileWriter(id + "_bitacora.txt")) {
            writer.write(bitacora.toString());
            System.out.println("Bitácora guardada en " + id + "_bitacora.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar la bitácora: " + e.getMessage());
        }
    }
}

/**
 * Clase que representa a Cutman, un personaje del juego.
 */
public class Cutman extends Personaje {
    /**
     * Crea un nuevo personaje Cutman.
     */
    public Cutman() {
        super("Cutman", 50, null, null); // No necesita estrategias
        agregarHabilidad(new AtaqueCortante()); // Cutman tiene una habilidad específica
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Cutman no absorbe poderes, esta función puede estar vacía
    }
}

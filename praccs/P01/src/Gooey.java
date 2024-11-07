/**
 * Clase que representa al personaje Gooey.
 */
public class Gooey extends Personaje {
    /**
     * Crea un nuevo Gooey.
     */
    public Gooey() {
        super("Gooey", 70, null, null); // Gooey no tiene poderes
        agregarHabilidad(new AtaquePegajoso());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Gooey no absorbe poderes
    }
}
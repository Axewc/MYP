/**
 * Clase que representa al personaje Metaknight.
 */
public class Metaknight extends Personaje {
    /**
     * Crea un nuevo Metaknight.
     */
    public Metaknight() {
        super("Metaknight", 70, null, null); // Metaknight no tiene poderes
        agregarHabilidad(new AtaqueEspada());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Metaknight no absorbe poderes
    }
}

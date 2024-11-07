/**
 * Clase que representa al personaje Garchomp.
 */
public class Garchomp extends Personaje {
    /**
     * Crea un nuevo Garchomp.
     */
    public Garchomp() {
        super("Garchomp", 60, null, null); // Garchomp no tiene poderes
        agregarHabilidad(new AtaqueTierra());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Garchomp no absorbe poderes
    }
}
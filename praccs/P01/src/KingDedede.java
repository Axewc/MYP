/**
 * Clase que representa al personaje King Dedede.
 */
public class KingDedede extends Personaje {
    /**
     * Crea un nuevo King Dedede.
     */
    public KingDedede() {
        super("King Dedede", 70, null, null); // King Dedede no tiene poderes
        agregarHabilidad(new AtaqueMartillo());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // King Dedede no absorbe poderes
    }
}

/**
 * Clase que representa al personaje Bombman, que es un personaje que tiene la habilidad de
 */
public class Bombman extends Personaje {
    /**
     * Crea un nuevo personaje Bombman.
     */
    public Bombman() {
        super("Bombman", 50,null,null);
        agregarHabilidad(new AtaqueExplosivo());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Bombman no absorbe poderes, esta función puede estar vacía o personalizada si
        // necesario
    }
}

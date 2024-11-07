/**
 * Clase que representa al personaje Hydreigon.
 */
public class Hydreigon extends Personaje {
    /**
     * Crea un nuevo Hydreigon.
     */
    public Hydreigon() {
        super("Hydreigon", 60, null, null); // Hydreigon no tiene poderes
        agregarHabilidad(new AtaqueOscuro());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Hydreigon no absorbe poderes
    }
}
/**
 * Clase que representa al personaje Elecman, que es un personaje con habilidades específicas.
 */
public class Elecman extends Personaje {
    public Elecman() {
        super("Elecman", 50, null, null); // No necesita estrategias básicas de ataque y defensa
        agregarHabilidad(new AtaqueElectrico()); // Elecman tiene una habilidad específica
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Elecman no absorbe poderes, esta función puede estar vacía
    }
}

/**
 * Rayquaza es un personaje que no tiene poderes, pero tiene la habilidad de atacar con viento.
 */
public class Rayquaza extends Personaje {
    /**
     * Crea un nuevo personaje Rayquaza.
     */
    public Rayquaza() {
        super("Rayquaza", 60, null, null); // Rayquaza no tiene poderes
        agregarHabilidad(new AtaqueViento());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        // Rayquaza no absorbe poderes
    }
}
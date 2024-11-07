/**
 * Clase que representa a MeganMan, un personaje del juego.
 */
public class MeganMan extends Personaje {
    public MeganMan() {
        super("MeganMan", 100, new AtaqueFuego(), new DefensaEscudo());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        if (personaje instanceof Elecman) {
            agregarHabilidad(new AtaqueElectrico());
        } else if (personaje instanceof Bombman) {
            agregarHabilidad(new AtaqueExplosivo());
        } else if (personaje instanceof Cutman) {
            agregarHabilidad(new AtaqueCortante());
        }
    }
}

/**
 * Clase que representa al personaje Korby.
 */
public class Korby extends Personaje {
    /**
     * Constructor de la clase Korby.
     */
    public Korby() {
        super("Korby", 100, new AtaqueFuego(), new DefensaEscudo());
    }

    /**
     * Absorbe el poder de un personaje.
     * @param personaje Personaje del cual se absorberá el poder.
     */
    @Override
    public void absorberPoder(Personaje personaje) {
        if (personaje instanceof Metaknight) {
            agregarHabilidad(new AtaqueEspada());
        } else if (personaje instanceof KingDedede) {
            agregarHabilidad(new AtaqueMartillo());
        } else if (personaje instanceof Gooey) {
            agregarHabilidad(new AtaquePegajoso());
        }
    }
}

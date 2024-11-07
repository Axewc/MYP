import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase que representa un combate entre dos personajes.
 * @param personaje1 Personaje 1.
 * @param personaje2 Personaje 2.
 * @param espectadores Lista de espectadores del combate.
 * @param simulacionCombate Simulación del combate.
 * @param habilidadesAbsorbidas Habilidades absorbidas por el personaje.
 */
public class Combate {
    private Personaje personaje1;
    private Personaje personaje2;
    private List<Espectador> espectadores;
    private SimulacionCombate simulacionCombate;
    private Set<String> habilidadesAbsorbidas; // Mantiene un registro de las habilidades absorbidas

    /**
     * Constructor de la clase Combate.
     * @param personaje1 Personaje 1.
     * @param personaje2 Personaje 2.
     */
    public Combate(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.espectadores = new ArrayList<>();
        this.simulacionCombate = new SimulacionCombate();
        this.habilidadesAbsorbidas = new HashSet<>();
    }

    /**
     * Agrega un espectador al combate.
     * @param espectador Espectador a agregar.
     */
    public void agregarEspectador(Espectador espectador) {
        espectadores.add(espectador);
    }

    /**
     * Notifica a los espectadores un evento.
     * @param evento Evento a notificar.
     */
    public void notificarEspectadores(String evento) {
        for (Espectador espectador : espectadores) {
            espectador.actualizar(evento);
        }
    }

    /**
     * Inicia el combate entre los dos personajes.
     */
    public void iniciarCombate() {
        while (personaje1.getPuntosDeVida() > 0 && personaje2.getPuntosDeVida() > 0) {
            manejarTurno(personaje1, personaje2);
            if (personaje2.getPuntosDeVida() <= 0) {
                notificarEspectadores(personaje1.getNombre() + " ha ganado el combate.");
                break;
            }

            manejarTurno(personaje2, personaje1);
            if (personaje1.getPuntosDeVida() <= 0) {
                notificarEspectadores(personaje2.getNombre() + " ha ganado el combate.");
                break;
            }
        }

        String ganador = personaje1.getPuntosDeVida() > 0 ? personaje1.getNombre() : personaje2.getNombre();
        notificarEspectadores("El combate ha terminado. El ganador es " + ganador);
    }

    /**
     * Maneja el turno de un personaje.
     * @param atacante Personaje atacante.
     * @param defensor Personaje defensor.
     */
    private void manejarTurno(Personaje atacante, Personaje defensor) {
        if (simulacionCombate.simularAparicion(atacante)) {
            Personaje enemigo = simulacionCombate.obtenerEnemigo(atacante);
            Habilidad nuevaHabilidad = enemigo.getHabilidades().get(0);

            if (!habilidadesAbsorbidas.contains(nuevaHabilidad.getNombre())) {
                notificarEspectadores("Aparece " + enemigo.getNombre() + ". Habilidad: " + nuevaHabilidad.getNombre());
                atacante.absorberPoder(enemigo);
                habilidadesAbsorbidas.add(nuevaHabilidad.getNombre());
                notificarEspectadores(atacante.getNombre() + " absorbe a " + enemigo.getNombre() + ". Habilidades de "
                        + atacante.getNombre() + ": " + atacante.getListaHabilidades());
            }
        }

        atacante.atacar(defensor);
        notificarEspectadores(atacante.getNombre() + " ataca a " + defensor.getNombre() + ". Puntos de vida restantes: "
                + defensor.getPuntosDeVida());
    }

    /**
     * Obtiene la lista de espectadores del combate.
     * @return Lista de espectadores del combate.
     */
    public List<Espectador> getEspectadores() {
        return espectadores;
    }
}

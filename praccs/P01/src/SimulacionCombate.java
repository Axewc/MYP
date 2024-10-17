import java.util.Random;

/**
 * Clase que simula un combate entre personajes de un videojuego.
 * @param rand Generador de números aleatorios.
 */
public class SimulacionCombate {

    private Random rand = new Random();

    /**
     * Crea un combate entre dos personajes.
     * @param escenario Escenario del combate.
     * @return Combate creado.
     */
    public Combate crearCombate(int escenario) {
        MeganMan meganMan = new MeganMan();
        Dittuu dittuu = new Dittuu();
        Korby korby = new Korby();

        switch (escenario) {
            case 1:
                return new Combate(meganMan, dittuu);
            case 2:
                return new Combate(meganMan, korby);
            case 3:
                return new Combate(dittuu, korby);
            default:
                throw new IllegalArgumentException("Escenario no válido");
        }
    }

    /**
     * Simula la aparición de un nuevo enemigo.
     * @param personaje Personaje que simula la aparición del enemigo.
     * @return true si aparece un nuevo enemigo, false en caso contrario.
     */
    public boolean simularAparicion(Personaje personaje) {
        // 50% de probabilidad de que aparezca un nuevo enemigo
        return rand.nextInt(100) < 50;
    }

    /**
     * Obtiene un enemigo aleatorio para un personaje.
     * @param personaje Personaje que obtendrá un enemigo.
     * @return Enemigo aleatorio.
     */
    public Personaje obtenerEnemigo(Personaje personaje) {
        if (personaje instanceof MeganMan) {
            return rand.nextBoolean() ? new Elecman() : new Bombman();
        } else if (personaje instanceof Dittuu) {
            return rand.nextBoolean() ? new Rayquaza() : new Garchomp();
        } else if (personaje instanceof Korby) {
            return rand.nextBoolean() ? new Metaknight() : new KingDedede();
        }
        return null;
    }
}

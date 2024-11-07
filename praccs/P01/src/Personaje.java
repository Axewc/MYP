import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa a un personaje en un videojuego.
 * @param nombre Nombre del personaje.
 * @param puntosDeVida Puntos de vida del personaje.
 * @param habilidades Lista de habilidades del personaje.
 * @param estrategiaAtaque Estrategia de ataque del personaje.
 * @param estrategiaDefensa Estrategia de defensa del personaje.
 */
public abstract class Personaje {
    private String nombre;
    private int puntosDeVida;
    private List<Habilidad> habilidades;
    private EstrategiaAtaque estrategiaAtaque;
    private EstrategiaDefensa estrategiaDefensa;

    /**
     * Constructor de la clase Personaje.
     * @param nombre Nombre del personaje.
     * @param puntosDeVida Puntos de vida del personaje.
     * @param estrategiaAtaque Estrategia de ataque del personaje.
     */
    public Personaje(String nombre, int puntosDeVida, EstrategiaAtaque estrategiaAtaque,
            EstrategiaDefensa estrategiaDefensa) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.habilidades = new ArrayList<>();
        this.estrategiaAtaque = estrategiaAtaque;
        this.estrategiaDefensa = estrategiaDefensa;
    }

    /**
     * Agrega una habilidad al personaje.
     * @param habilidad
     */
    public void agregarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    /**
     * Ataca a un enemigo.
     * @param enemigo Enemigo a atacar.
     */
    public void atacar(Personaje enemigo) {
        if (!habilidades.isEmpty()) {
            Habilidad habilidad = habilidades.get(0); // Usar la primera habilidad disponible
            habilidad.ejecutar(enemigo);
            System.out.println(getNombre() + " usa " + habilidad.getNombre() + " con potencia "
                    + habilidad.getPotencia() + ". Puntos de vida restantes: " + enemigo.getPuntosDeVida());
        } else if (estrategiaAtaque != null) {
            estrategiaAtaque.atacar(this, enemigo);
        }
    }

    /**
     * Defiende al personaje.
     * @param puntos Puntos de daño a defender.
     */
    public void defender(int puntos) {
        if (estrategiaDefensa != null) {
            puntos = estrategiaDefensa.defender(puntos);
        }
        puntosDeVida -= puntos;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    /**
     * Obtiene los puntos de vida del personaje.
     * @return Puntos de vida del personaje.
     */
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    /**
     * Obtiene el nombre del personaje.
     * @return Nombre del personaje.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de habilidades del personaje.
     * @return Lista de habilidades del personaje.
     */
    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    /**
     * Obtiene la estrategia de ataque del personaje.
     * @return Estrategia de ataque del personaje.
     */
    public String getListaHabilidades() {
        List<String> nombresHabilidades = new ArrayList<>();
        for (Habilidad habilidad : habilidades) {
            nombresHabilidades.add(habilidad.getNombre());
        }
        return nombresHabilidades.toString();
    }

    /**
     * Obtiene la estrategia de ataque del personaje.
     * @return Estrategia de ataque del personaje.
     */
    public abstract void absorberPoder(Personaje personaje);
}

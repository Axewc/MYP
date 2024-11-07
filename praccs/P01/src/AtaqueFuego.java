/**
 * Clase que implementa la interfaz EstrategiaAtaque para realizar un ataque de fuego.
 */
public class AtaqueFuego implements EstrategiaAtaque {
    private final int potencia = 20;

    /**
     * Realiza un ataque de fuego a un personaje.
     * @param atacante Personaje que realiza el ataque.
     * @param objetivo Personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje atacante, Personaje objetivo) {
        objetivo.defender(potencia);
        System.out.println(atacante.getNombre() + " usa Ataque de Fuego con potencia " + potencia
                + ". Puntos de vida restantes: " + objetivo.getPuntosDeVida());
    }
}

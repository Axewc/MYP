/**
 * Clase que implementa la interfaz EstrategiaAtaque para realizar un ataque de hielo.
 */
public class AtaqueHielo implements EstrategiaAtaque {
    private final int potencia = 15;

    /**
     * Realiza un ataque de hielo a un personaje.
     * @param atacante Personaje que realiza el ataque.
     * @param objetivo Personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje atacante, Personaje objetivo) {
        objetivo.defender(potencia);
        System.out.println(atacante.getNombre() + " usa Ataque de Hielo con potencia " + potencia
                + ". Puntos de vida restantes: " + objetivo.getPuntosDeVida());
    }
}

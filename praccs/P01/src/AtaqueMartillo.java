/**
 * Clase que implementa la interfaz Habilidad, representa la habilidad de ataque de martillo
 */
public class AtaqueMartillo implements Habilidad {
    private final int potencia = 17;

    /**
     * Realiza un ataque de martillo a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(17);
        System.out.println("Ataque de martillo causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque de Martillo";
    }

    /**
     * Obtiene la potencia del ataque.
     * @return Potencia del ataque.
     */
    @Override
    public int getPotencia() {
        return potencia;
    }
}

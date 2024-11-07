/**
 * Clase que implementa la interfaz Habilidad, la cual define el comportamiento de un ataque de espada.
 */
public class AtaqueEspada implements Habilidad {
    private final int potencia = 12;

    /**
     * Realiza un ataque de espada a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(12);
        System.out.println("Ataque de espada causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque de Espada";
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

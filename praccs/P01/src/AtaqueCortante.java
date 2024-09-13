/**
 * Clase que implementa la interfaz Habilidad, representa la habilidad de ataque cortante.
 */
public class AtaqueCortante implements Habilidad {
    private final int potencia = 10;

    /**
     * Realiza un ataque cortante a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(10);
        System.out.println("Ataque cortante causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque Cortante";
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

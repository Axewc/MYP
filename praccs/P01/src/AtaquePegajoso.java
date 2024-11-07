/**
 * Clase que implementa la interfaz Habilidad, representa una habilidad de ataque pegajoso
 */
public class AtaquePegajoso implements Habilidad {
    private final int potencia = 10;

    /**
     * Realiza un ataque pegajoso a un personaje.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(10);
        System.out.println("Ataque pegajoso causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque Pegajoso";
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

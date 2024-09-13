/**
 * Clase que implementa la interfaz Habilidad, representa la habilidad de ataque oscuro
 */
public class AtaqueOscuro implements Habilidad {
    private final int potencia = 20;

    /**
     * Realiza un ataque oscuro a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(20);
        System.out.println("Ataque oscuro causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque Oscuro";
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

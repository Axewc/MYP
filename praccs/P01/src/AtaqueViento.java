/**
 * Clase que implementa la interfaz Habilidad para definir el ataque de viento
 */
public class AtaqueViento implements Habilidad {
    private final int potencia = 18;

    /**
     * Realiza un ataque de viento a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(18);
        System.out.println("Ataque de viento causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque de Viento";
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

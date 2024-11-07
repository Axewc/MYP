/**
 * Clase que implementa la interfaz Habilidad para definir el ataque eléctrico.
 */
public class AtaqueElectrico implements Habilidad {
    private final int potencia = 15;

    /**
     * Realiza un ataque eléctrico a un personaje.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(potencia);
        System.out.println("Ataque eléctrico causa " + potencia + "< de daño a " + enemigo.getNombre());
    }

    /**
     * Obtiene el nombre del ataque.
     * @return Nombre del ataque.
     */
    @Override
    public String getNombre() {
        return "Ataque Eléctrico";
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

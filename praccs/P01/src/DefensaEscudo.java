

/**
 * Clase que implementa la estrategia de defensa con escudo
 * que reduce el daño a la mitad.
 */
public class DefensaEscudo implements EstrategiaDefensa {
    /**
     * Reduce el daño a la mitad.
     * @param puntos Puntos de daño a defender.
     * @return Puntos de daño reducidos.
     */
    @Override
    public int defender(int puntos) {
        int reduccion = puntos / 2; // Reduce el daño a la mitad
        System.out.println("Defensa con Escudo, reduce el daño a " + reduccion);
        return reduccion;
    }
}

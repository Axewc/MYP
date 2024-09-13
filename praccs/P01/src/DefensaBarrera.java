/**
 * Clase que implementa la interfaz EstrategiaDefensa, la cual define el método
 * defender, que será implementado por las clases que representen las distintas
 * estrategias de defensa.
 */
public class DefensaBarrera implements EstrategiaDefensa {
    /**
     * Reduce el daño a un tercio.
     * @param puntos Puntos de daño a defender.
     * @return Puntos de daño reducidos.
     */
    @Override
    public int defender(int puntos) {
        int reduccion = puntos / 3; // Reduce el daño a un tercio
        System.out.println("Defensa con Barrera, reduce el daño a " + reduccion);
        return reduccion;
    }
}

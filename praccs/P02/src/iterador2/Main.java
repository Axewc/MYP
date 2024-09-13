
// clase principal 

public class Main {
    public static void main(String[] args) {
        RoboClean simulador = new RoboClean();

        // Iteramos habitaciones
        simulador.iterarHabitaciones();

        // Iteramos accesorios
        simulador.iterarAccesorios();
    }

}
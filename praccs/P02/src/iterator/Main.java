package iterator;

public class Main {
    public static void main(String[] args) {
        RoboCleanIterado roboClean = new RoboCleanIterado();

        // Iterador para las habitaciones
        Iterador iterHabitaciones = roboClean.crearIteradorHabitaciones();
        System.out.println("Habitaciones disponibles:");
        while (iterHabitaciones.hasNext()) {
            String habitacion = (String) iterHabitaciones.next();
            System.out.println(habitacion);
        }

        // Iterador para los accesorios
        Iterador iterAccesorios = roboClean.crearIteradorAccesorios();
        System.out.println("Accesorios disponibles:");
        while (iterAccesorios.hasNext()) {
            String accesorio = (String) iterAccesorios.next();
            System.out.println(accesorio);
        }
    }
}

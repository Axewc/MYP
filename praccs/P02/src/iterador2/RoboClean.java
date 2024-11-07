import java.util.*;

import iterator.Iterador;

public class RoboClean {
    
    // Diccionario para las habitaciones
    private Map<String, String> habitaciones = new HashMap<>();
    
    // Lista para los accesorios
    private List<String> accesorios = new ArrayList<>();
    

    /**
     * Constructor de la clase RoboClean.
     */
    public RoboClean() {
        // Inicializamos las habitaciones con sus características
        habitaciones.put("Sala de estar", "Madera y Alfombra");
        habitaciones.put("Cocina", "Baldosas");
        habitaciones.put("Habitación principal", "Alfombra y Ventanas");
        
        // Inicializamos la lista de accesorios
        accesorios.add("Cepillos giratorios");
        accesorios.add("Filtro HEPA");
        accesorios.add("Sensores de obstáculos avanzados");
    }

    /**
     * Itera sobre las habitaciones y muestra la superficie de cada una.
     */
    public void iterarHabitaciones() {
        Iterador<String> iteradorHabitaciones = habitaciones.keySet().iterator();

        System.out.println("Habitaciones disponibles:");
        while (iteradorHabitaciones.hasNext()) {
            String habitacion = iteradorHabitaciones.next();
            System.out.println(habitacion + " - Superficie: " + habitaciones.get(habitacion));
        }
    }

    /**
     * Itera sobre los accesorios y los muestra.
    */
    public void iterarAccesorios() {
        Iterador<String> iteradorAccesorios = accesorios.iterator();

        System.out.println("Accesorios disponibles:");
        while (iteradorAccesorios.hasNext()) {
            String accesorio = iteradorAccesorios.next();
            System.out.println(accesorio);
        }
    }

}

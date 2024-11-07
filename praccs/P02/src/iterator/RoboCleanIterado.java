package iterator;

import java.util.*;

import java.util.*;

public class RoboCleanIterado {
    private Map<String, String> habitaciones = new HashMap<>();
    private List<String> accesorios = new ArrayList<>();

    public RoboCleanIterado() {
        habitaciones.put("Sala de estar", "Madera y Alfombra");
        habitaciones.put("Cocina", "Baldosas");
        habitaciones.put("Habitación principal", "Alfombra y Ventanas");

        accesorios.add("Cepillos giratorios");
        accesorios.add("Filtro HEPA");
        accesorios.add("Sensores de obstáculos avanzados");
    }

    public Iterador crearIteradorHabitaciones() {
        return new IteradorHabitaciones(habitaciones);
    }

    public Iterador crearIteradorAccesorios() {
        return new IteradorAccesorios(accesorios);
    }
}

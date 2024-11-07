package iterator;

import java.util.*;

public class IteradorHabitaciones implements Iterador {
    private List<String> llaves;
    private int posicion = 0;

    public IteradorHabitaciones(Map<String, String> habitaciones) {
        this.llaves = new ArrayList<>(habitaciones.keySet());
    }

    @Override
    public boolean hasNext() {
        return posicion < llaves.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return llaves.get(posicion++);
        }
        return null;
    }
}

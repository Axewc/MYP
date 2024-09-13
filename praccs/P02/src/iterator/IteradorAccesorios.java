package iterator;

import java.util.*;

public class IteradorAccesorios implements Iterador {
    private List<String> accesorios;
    private int posicion = 0;

    public IteradorAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public boolean hasNext() {
        return posicion < accesorios.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return accesorios.get(posicion++);
        }
        return null;
    }
}

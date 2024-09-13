package core;

import iterator.Iterador;
import iterator.IteradorHabitaciones;
import iterator.IteradorAccesorios;
import state.Estado;
import state.EstadoEnEspera;
import state.EstadoEnLimpieza;
import state.EstadoRecargando;
import decorator.RoboCleanComponent;
import java.util.*;

public class RoboClean implements RoboCleanComponent{
    private Map<String, String> habitaciones = new HashMap<>();
    private List<String> accesorios = new ArrayList<>();

    // Estados del robot
    private Estado estadoEnEspera;
    private Estado estadoEnLimpieza;
    private Estado estadoRecargando;
    private Estado estadoActual;

    public RoboClean() {
        // Inicializamos habitaciones y accesorios
        habitaciones.put("Sala de estar", "Madera y Alfombra");
        habitaciones.put("Cocina", "Baldosas");
        habitaciones.put("Habitación principal", "Alfombra y Ventanas");

        accesorios.add("Cepillos giratorios");
        accesorios.add("Filtro HEPA");
        accesorios.add("Sensores de obstáculos avanzados");

        // Inicialización de los estados del robot
        estadoEnEspera = new EstadoEnEspera(this);
        estadoEnLimpieza = new EstadoEnLimpieza(this);
        estadoRecargando = new EstadoRecargando(this);
        estadoActual = estadoEnEspera; // El robot empieza en estado de espera
    }

    // Métodos para iterar sobre las habitaciones y accesorios (patrón Iterator)
    public Iterador crearIteradorHabitaciones() {
        return new IteradorHabitaciones(habitaciones);
    }

    public Iterador crearIteradorAccesorios() {
        return new IteradorAccesorios(accesorios);
    }

    // Métodos del patrón State
    public void setEstado(Estado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public Estado getEstadoEnEspera() {
        return estadoEnEspera;
    }

    public Estado getEstadoEnLimpieza() {
        return estadoEnLimpieza;
    }

    public Estado getEstadoRecargando() {
        return estadoRecargando;
    }

    // Métodos que delegan el comportamiento según el estado actual
    public void iniciarLimpieza() {
        estadoActual.iniciarLimpieza();
    }

    public void detenerLimpieza() {
        estadoActual.detenerLimpieza();
    }

    public void recargarBateria() {
        estadoActual.recargarBateria();
    }

    @Override
    public void limpiar() {
        System.out.println("El RoboClean está limpiando.");
    }
}

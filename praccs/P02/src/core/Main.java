package core;

import iterator.Iterador;
import decorator.*;

public class Main {
    public static void main(String[] args) {
        RoboClean roboClean = new RoboClean();

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

        // Probar el patrón State
        System.out.println("\nSimulación del estado del robot:");
        roboClean.iniciarLimpieza(); // Cambiará al estado de limpieza
        roboClean.recargarBateria(); // No debería recargar mientras limpia
        roboClean.detenerLimpieza(); // Cambia al estado de espera
        roboClean.recargarBateria(); // Ahora puede recargar

        CepillosGiratoriosDecorator cepillosGiratoriosDecorator = new CepillosGiratoriosDecorator(roboClean);
        FiltroHEPADecorator filtroHEPADecorator = new FiltroHEPADecorator(cepillosGiratoriosDecorator);
        SensoresObstaculosDecorator sensoresObstaculosDecorator = new SensoresObstaculosDecorator(filtroHEPADecorator);
        sensoresObstaculosDecorator.limpiar();
        
    
    }
}

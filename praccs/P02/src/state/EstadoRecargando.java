package state;

import core.RoboClean;

public class EstadoRecargando implements Estado {
    private RoboClean robot;

    public EstadoRecargando(RoboClean robot) {
        this.robot = robot;
    }

    @Override
    public void iniciarLimpieza() {
        System.out.println("El robot no puede limpiar mientras se está recargando.");
    }

    @Override
    public void detenerLimpieza() {
        System.out.println("El robot no está en limpieza.");
    }

    @Override
    public void recargarBateria() {
        System.out.println("El robot ya está recargando...");
        robot.setEstado(robot.getEstadoEnEspera()); // Después de recargar, vuelve al estado de espera
    }
}

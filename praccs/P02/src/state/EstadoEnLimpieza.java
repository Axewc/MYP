package state;

import core.RoboClean;

public class EstadoEnLimpieza implements Estado {
    private RoboClean robot;

    public EstadoEnLimpieza(RoboClean robot) {
        this.robot = robot;
    }

    @Override
    public void iniciarLimpieza() {
        System.out.println("El robot ya está en limpieza.");
    }

    @Override
    public void detenerLimpieza() {
        System.out.println("Deteniendo limpieza...");
        robot.setEstado(robot.getEstadoEnEspera()); // Cambiar al estado de espera
    }

    @Override
    public void recargarBateria() {
        System.out.println("El robot no puede recargar mientras está limpiando.");
    }
}

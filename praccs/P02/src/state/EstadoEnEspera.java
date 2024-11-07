package state;


import core.RoboClean;

public class EstadoEnEspera implements Estado {
    private RoboClean robot;

    public EstadoEnEspera(RoboClean robot) {
        this.robot = robot;
    }

    @Override
    public void iniciarLimpieza() {
        System.out.println("Iniciando limpieza...");
        robot.setEstado(robot.getEstadoEnLimpieza()); // Cambiar al estado de limpieza
    }

    @Override
    public void detenerLimpieza() {
        System.out.println("El robot no está en limpieza.");
    }

    @Override
    public void recargarBateria() {
        System.out.println("El robot ya está cargado.");
    }
}

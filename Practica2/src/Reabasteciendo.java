public class Reabasteciendo implements EstadoRobot{

    Robot robot;

    public Reabasteciendo(Robot nuevoRobot){
	robot = nuevoRobot;
    }

    public void suspender(){
	System.out.println("El robot no se puede suspender mientras se reabastece.");
    }
    
    public void activar(){
	System.out.println("El robot ya esta activo y reabasteciendose.");
    }
    
    public void caminar(){
	System.out.println("El robot ahora está caminando.");
	robot.asignarEstadoRobot(robot.getEstadoCaminando());
    }
    
    public void reabastecer(){
	System.out.println("El robot ya se está reabasteciendo.");
    }
    
    public void trabajar(){
	System.out.println("El robot no puede trabajar mientras se reabastece.");
    }
}

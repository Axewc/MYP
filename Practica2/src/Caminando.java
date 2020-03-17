public class Caminando implements EstadoRobot{

    Robot robot;

    public Caminando(Robot nuevoRobot){
	robot = nuevoRobot;
    }
    
    public void suspender(){
	System.out.println("El robot se esta suspendiendo.");
	robot.asignarEstadoRobot(robot.getEstadoSuspendido());
    }
    
    public void activar(){
	System.out.println("El robot ya está activo.");
    }
    
    public void caminar(){
	System.out.println("El robot ya se encuentra caminando.");
    }
    
    public void reabastecer(){
	System.out.println("El robot pasa a reabastecerse");
	robot.asignarEstadoRobot(robot.getEstadoReabasteciendo());
    }
    
    public void trabajar(){
	System.out.println("El robot va a trabajar.");
	robot.asignarEstadoRobot(robot.getEstadoTrabajando());
    }
    
}

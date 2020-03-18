/**
 * Clase que representa cuando el robot está suspendido,
 * en esta, el robot no puede hacer nada mas que activarse.
 */
public class Suspendido implements EstadoRobot{

    //robot auxiliar para cambiar de estados.
    Robot robot;

    //Constructor para que el robot cambie apropiadamente de estados.
    public Suspendido(Robot nuevoRobot){
	robot = nuevoRobot;
    }

    public void suspender(){
	System.out.println("El robot ya está suspendido.");
    }

    public void activar(){
	System.out.println("El robot se ha activado.");
	robot.asignarEstadoRobot(robot.getEstadoRecibiendoOrden());
    }

    public void caminar(){
	System.out.println("El robot no puede caminar estando suspendido.");
    }

    public void reabastecer(){
	System.out.println("El robot está suspendido, no se puede reabastecer");
    }

    public void trabajar(){
	System.out.println("El robot suspendido no puede trabajar.");
    }
}

/**
 * Clase que representa cuando el robot camina;
 * en esta clase el robot puede pasar a los estados
 * suspendido, reabasteciendo o trabajando.
 */
public class Caminando implements EstadoRobot{

    //Robot auxiliar para cambiar de estados
    Robot robot;

    //constructor para que el robot cambie adecuadamente de estados
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
  robot.setYaReabasteci(true);
    }

    public void trabajar(){
      if(!robot.getYaReabastecí()) {
        System.out.println("El robot no puede ir a trabajar.");
      } else {
	       System.out.println("El robot va a trabajar.");
	       robot.asignarEstadoRobot(robot.getEstadoTrabajando());
        }
    }

}

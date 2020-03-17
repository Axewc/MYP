public class RecibiendoOrden implements EstadoRobot{

    Robot robot;

    public RecibiendoOrden(Robot nuevoRobot){
	robot = nuevoRobot;
    }

    public void suspender(){
	System.out.println("El robot no se puede suspender mientras recibe una orden.");
    }
    
    public void activar(){
	System.out.println("El robot ya está activo y esperandoo una orden.");
    }
    
    public void caminar(){
	System.out.println("El robot ahora está caminando.");
	robot.asignarEstadoRobot(robot.getEstadoCaminando());
    }
    
    public void reabastecer(){
	System.out.println("El robot no puede reabastecer mientras recibe una orden.");
    }
    
    public void trabajar(){
	System.out.println("El robot no puede trabajar mientras recibe una orden.");
    }
}

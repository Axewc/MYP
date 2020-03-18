import java.util.Scanner;
public class Operador{

    static Scanner sc = new Scanner(System.in);
    static Robot robot = new Robot();

    public static void main(String[] args){

	System.out.println("Bienvenid@ a la construcción de casas Mi Hogarcito.");
	System.out.println("El robot que te ayudará a construir tu casa se encuentra suspendido, por favor indícale que hacer.");
	System.out.println("Utiliza la siguiente en número que desees de la siguiente lista de comandos para interactuar con el robot.");
	System.out.println("1.Suspender n/ 2.Activar n/ 3.Caminar n/ 4.Reabastecer n/5.Trabajar n/6.Salir del programa");

	try{
	    int instruccion = -1;
	    
	    while(instruccion != 6){
		System.out.println("Por favor ahora introduce que quieres que haga el robot:");
		instruccion = sc.nextInt();	    
		switch(instruccion){
		case 1:
		    robot.suspender();
		    break;
		case 2:
		    robot.activar();
		    break;
		case 3:
		    robot.caminar();
		    break;
		case 4:
		    robot.reabastecer();
		    break;
		case 5:
		    robot.trabajar();
		    break;
		case 6:
		    System.out.println("Saliendo del programa.");
		default:
		    System.out.println("Por favor ingresa una opción válida.");
		    break;
		}
	    }
	    
	}catch (Exception ex){
	    System.out.println("Problemas con la entrada estandar");
	}
    }	
}

import java.util.Scanner;

public class Operador{
    /*Scanner que usará para decirle al robot que debe hacer.*/
    static Scanner sc = new Scanner(System.in);
    /*Objeto robot, que alternará estadp según lo rquiera.*/
    static Robot robot = new Robot();

    /**
    * Bucle que seguirá hasta que el usuario explicítamente lo decida,
    * El robot siempre está disponible. 
    */
    public static void main(String[] args){
      imprimeMenu();
	     try{
	        int instruccion = -1;
	         while(instruccion != 6) {
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

	     } catch (Exception ex){
	        System.out.println("Problemas con la entrada estandar\n");
	     }
    }
    /**
    * Menú para las transiciones entre estados del robot.
    */
    public static void imprimeMenu() {
      System.out.println("Bienvenid@ a la construcción de casas Mi Hogarcito.");
      System.out.println("El robot que te ayudará a construir tu casa se encuentra suspendido, por favor indícale que hacer.");
      System.out.println("Utiliza la siguiente en número que desees de la siguiente lista de comandos para interactuar con el robot.");
      System.out.println("1 - Suspender");
      System.out.println("2 - Activar");
      System.out.println("3 - Caminar");
      System.out.println("4 - Reabastecer");
      System.out.println("5 - Trabajar");
      System.out.println("6 - Salir");

    }
}

import java.util.Scanner;

/**
* Extiende ProcesoConstruccion para poder hacer uso de sus funcionalidades
* es decir, el orden o receta que se usará para trabajar(construir) un hogarcito.
* implementa EstadoRobot para hacer una correcta transicion entre estados.
* El robot solo puede cambiar de estado a Caminando.
*/
public class Trabajando extends ProcesoConstruccion implements EstadoRobot {

  /*Robot auxiliar para cambiar de estado.*/
  Robot robot;

  /**Cosntructor para que el robot cambie de estado apropiadamente.*/
  public Trabajando(Robot nuevoRobot) {
    this.robot = nuevoRobot;
  }

  public void suspender() {
    System.out.println("El robot no se puede suspender si está trabajando.\n");
  }

  public void activar() {
    System.out.println("El robot no se puede activar si está trabajando.\n");
  }

  public void caminar() {
    System.out.println("El robot dejó de trabajar, ahora está caminando.\n");
    robot.asignarEstadoRobot(robot.getEstadoCaminando());
  }

  public void reabastecer() {
    System.out.println("El robot no puede reabastecerse si está trabajando.\n");
  }

  /**
  * Éste método llevara toda la instrucción de como se va a trabajar (construir)
  * un hogarcito.
  */
  public void trabajar() {
    System.out.println("El robot ya está trabajando.\n");
    //Proceso de Construcción.
    construccion();
    robot.setYaReabasteci(false);
  }

  /**
  * Métodos abstractos que se deben implemnetar
  * para poder extender ProcesoConstruccion.
  */
  @Override int construccionEsqueleto() {
    System.out.println("");
    return 0;
  }

  @Override int aislamientoDeLaCasa() {
    System.out.println("");
    return 0;
  }
}

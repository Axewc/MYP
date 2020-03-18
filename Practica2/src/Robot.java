
/*
* Clase que va a implemnetar todas las funcionalidades según el estado del
* Robot
*/
public class Robot {

  /*Varibles que determinan los estados del Robot*/
  EstadoRobot suspendido;
  EstadoRobot recibiendoOrden;
  EstadoRobot caminando;
  EstadoRobot reabasteciendo;
  EstadoRobot trabajando;
  EstadoRobot estadoActual;
  /*Variable paraasegurar que el robot ya reabastecio antes de comenzar a trabajar.*/
  boolean yaReabastecí;

  /**
  * Constructor que inicializa los estados, y el estado actual.
  */
  public Robot() {
    /*Instancia el estado Suspendido y sus métodos*/
    this.suspendido = new Suspendido(this);
    /*Instancia el estado RecibiendoOrden y sus métodos*/
    this.recibiendoOrden = new RecibiendoOrden(this);
    /*Instancia el estado Caminando y sus métodos*/
    this.caminando = new Caminando(this);
    /*Instancia el estado Reabasteciendo y sus métodos*/
    this.reabasteciendo = new Reabasteciendo(this);
    /*Instancia el estado Trabajando y sus métodos*/
    this.trabajando = new Trabajando(this);
    /*El robot debe estar suspendido por default*/
    this.estadoActual = suspendido;
    /*En principio el robot no tiene materiales.*/
    this.yaReabastecí = false;
  }

  /**
  * Método que determina si el robot ya se ha reabastecido.
  * @param yaReabastecí false si no reabastecio, de lo contrario true.
  */
  public void setYaReabasteci(boolean yaReabastecí) {
    this.yaReabastecí = yaReabastecí;
  }
  /**
  * Método que nos dice si el robot ya ha reabastecido.
  * @return false si no reabastecio, de lo contrario true.
  */
  public boolean getYaReabastecí() {
    return this.yaReabastecí;
  }

  /**
  * Método general para actualizar el estado del Robot.
  */
  public void asignarEstadoRobot(EstadoRobot nuevoEstado) {
    this.estadoActual = nuevoEstado;
  }

  /**
  * Método que utiliza la transición suspender en el estado actual.
  *
  */
  public void suspender() {
    this.estadoActual.suspender();
  }
  /**
  * Método que utiliza la transición activar en el estado actual.
  *
  */
  public void activar() {
    this.estadoActual.activar();
  }
  /**
  * Método que utiliza la transición caminar en el estado actual.
  *
  */
  public void caminar() {
    this.estadoActual.caminar();
  }
  /**
  * Método que utiliza la transición reabastecer en el estado actual.
  *
  */
  public void reabastecer() {
    this.estadoActual.reabastecer();
  }
  /**
  * Método que utiliza la transición trabajar en el estado actual.
  *
  */
  public void trabajar() {
    this.estadoActual.trabajar();
  }

  /**
  * Regresa el estado Suspendido del Robot.
  */
  public EstadoRobot getEstadoSuspendido() {
    return this.suspendido;
  }

  /**
  * Regresa el estado recibiendoOrden del Robot.
  */
  public EstadoRobot getEstadoRecibiendoOrden() {
    return this.recibiendoOrden;
  }

  /**
  * Regresa el estado caminando del Robot.
  */
  public EstadoRobot getEstadoCaminando() {
    return this.caminando;
  }

  /**
  * Regresa el estado Reabasteciendo del Robot.
  */
  public EstadoRobot getEstadoReabasteciendo() {
    return this.reabasteciendo;
  }

  /**
  * Regresa el estado Trabajadno del Robot.
  */
  public EstadoRobot getEstadoTrabajando() {
    return this.trabajando;
  }

}

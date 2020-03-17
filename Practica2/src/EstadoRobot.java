
/**
* Interfaz para los métodos usados como transiciones
* entre estados del Robot.
*/
public interface EstadoRobot {
  /*Transicion para el estado Suspendido*/
  void suspender();
  /*Transicion para el estado RecibiendoOrden*/
  void activar();
  /*Transicion para el estado Caminando*/
  void caminar();
  /*Transicion para el estado Reabasteciendo*/
  void reabastecer();
  /*Transicion para el estado Trabajando*/
  void trabajar();
}

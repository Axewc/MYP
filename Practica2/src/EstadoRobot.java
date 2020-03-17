/**
 * Interfaz que representa todos los estados
 * que puede tomar el robot.
 */
public interface EstadoRobot {
  void suspender();
  void activar();
  void caminar();
  void reabastecer();
  void trabajar();
}

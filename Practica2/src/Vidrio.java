
/**
* Clase para el material Vidrio.
* Implementa los métodos abstractos de ProcesoConstruccion.
*/
public class Vidrio extends ProcesoConstruccion {

  @Override int aislamientoDeLaCasa() {
    System.out.println("Muros de vidrio, es algo bastante futurista creo yo :O");
    return 250000;
  }
}

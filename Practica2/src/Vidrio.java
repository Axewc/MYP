
/**
* Clase para el material Vidrio.
* Implementa los métodos abstractos de ProcesoConstruccion.
*/
public class Vidrio extends ProcesoConstruccion {

  @Override int construccionEsqueleto() {
    System.out.println("No puedo hacer esqueleto de vidrio :c");
    return 0;
  }

  @Override int aislamientoDeLaCasa() {
    System.out.println("Muros de vidrio, es algo bastante futurista creo yo :O");
    return 250000;
  }
}

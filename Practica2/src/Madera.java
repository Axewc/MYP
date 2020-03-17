
/**
* Clase para el material Madera.
* Implementa los métodos abstractos de ProcesoConstruccion.
*/
public class Madera extends ProcesoConstruccion {

  @Override int aislamientoDeLaCasa() {
    System.out.println("Muros de madera, son mis favoritos me recuerdan" +
               "aquella época más simple, porque de hecho aún no existía XD");
    return 1000000;
  }
}

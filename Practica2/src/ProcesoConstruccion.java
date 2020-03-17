
public abstract class ProcesoConstruccion {

  /*Varible que lleva la cuenta de lo invertido en Mi Hogarcito.*/
  public int costoFinal = 0;
  // public String construccionFinal;

  /*Método abastracto para construir esqueleto de disintos materiales.*/
  abstract void construccionEsqueleto();
  /*Método abastracto para el aislamiento de la casa de disintos materiales.*/
  abstract void aislamientoDeLaCasa();

  /*
  * Método template para construir Hogarcitos.
  */
  public final void construccion() {
      preparacionDelTerreno();
      colocacionDeCimientos();
      construccionEsqueleto();
      instalacionElectricaYPlomeria();
      aislamientoDeLaCasa();
      acabados();
  }

  /*
  * Los métodos siguientes únicamente dan pauta para la planilla de construccion.
  * Primero.
  */
  void preparacionDelTerreno() {
    System.out.println("Hola, estoy preparando el terreno para TU Hogarcito :D.");
  }
  /*Segundo.*/
  void colocacionDeCimientos() {
    System.out.println("Estoy por colocar los cimientos para TU Hogarcito :D.");
  }

  /*Cuarto.*/
  void instalacionElectricaYPlomeria() {
    System.out.println("It's a me Mario, estamos encargándonos de la plomeria. "
    + "Cuidado con los cables :s, estoy trabajando en tu instalación eléctrica");
  }

  /*Sexto.*/
  void acabados() {
    System.out.println("Ya casi acabamos, solo restan tus acabados :D");
  }

}

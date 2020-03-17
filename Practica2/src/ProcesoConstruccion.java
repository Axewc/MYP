import java.lang.Integer;
public abstract class ProcesoConstruccion {

  /*Varible que lleva la cuenta de lo invertido en Mi Hogarcito.*/
  public int costoFinal = 1000000;
  // public String construccionFinal;

  /*Método abastracto para construir esqueleto de disintos materiales.*/
  abstract int construccionEsqueleto();
  /*Método abastracto para el aislamiento de la casa de disintos materiales.*/
  abstract int aislamientoDeLaCasa();

  /*
  * Método template para construir Hogarcitos.
  * En el paso 3 y 5 queremos que cambie según el operador.
  */
  public final void construccion() {
      preparacionDelTerreno();
      colocacionDeCimientos();
      construccionEsqueleto();
      instalacionElectricaYPlomeria();
      aislamientoDeLaCasa();
      acabados();
      pagoTotal(construccionEsqueleto(), aislamientoDeLaCasa());
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

  /*Hará la suma de lo que se haya invertido extra en el hogarcito*/
  void pagoTotal(int esqueleto, int aislamiento) {
    this.costoFinal += esqueleto + aislamiento;
    System.out.println(Integer.toString(this.costoFinal));
  }

}

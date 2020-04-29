/*
* Clase que describe las particularidades de la Pizza de Jamón.
* implemnta los métodos de la clase Pizza, que extiende.
* Los valores de cada variable son dados arbitrariamente.
*/
public class PizzaJamon extends Pizza {

  private String masa = "Delgada";

  private String carne = "Jamon";

  private String queso = "Manchego";

  private int costo = 5;

  @Override public String getMasa() {
    return this.masa;
  }
  @Override public String getCarne() {
    return this.carne;
  }
  @Override public String getQueso() {
    return this.queso;
  }
  @Override public int getCosto() {
    return this.costo;
  }

}

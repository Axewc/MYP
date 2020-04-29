/*
* Clase que describe las particularidades de la Pizza de Salchicha.
* implemnta los métodos de la clase Pizza, que extiende.
* Los valores de cada variable son dados arbitrariamente.
*/
public class PizzaSalchicha extends Pizza {

  private String masa = "Delgada";

  private String carne = "Salchichca";

  private String queso = "Manchego";

  private int costo = 4;

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

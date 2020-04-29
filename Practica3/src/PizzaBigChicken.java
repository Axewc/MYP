/*
* Clase que describe las particularidades de la Pizza Big Big Chicken.
* implemnta los métodos de la clase Pizza, que extiende.
* Los valores de cada variable son dados arbitrariamente.
*/
public class PizzaBigChicken extends Pizza {

  private String masa = "Gruesa";

  private String carne = "Pollo";

  private String queso = "Cheddar";

  private int costo = 8;

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

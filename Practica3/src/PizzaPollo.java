
public class PizzaPollo extends Pizza {

  private String masa = "Delgada";

  private String carne = "Pollo";

  private String queso = "Manchego";

  private int costo = 6;

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

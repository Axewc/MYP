/*
* Clase abstracta que implementará las funcionalidades de cada Pizza, siendo
* únicamente los getters que requieren por cada uno de sus ingredientes; masa,
* carne, queso, y el valor moentario que tienen.
*/
public abstract class Pizza {

  /*Método que nos regresará el tipo de masa de la pizza "Delgada" o "Gruesa". */
  public abstract String getMasa();
  /*Método que regresa el tipo de carne de la pizza "Pollo","Jamón","Salchicha". */
  public abstract String getCarne();
  /*Método que regresa el tipo de queso de la pizza "MAnchego" o "Cheddar". */
  public abstract String getQueso();
  /*Método que regresa el precio que tiene la pizza dada. */
  public abstract int getCosto();

}

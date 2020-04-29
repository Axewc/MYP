/*
* Clase que exteinde de Ingrediente, implementa sus métodos abstractos y sus
* respectivos getters.
*/
public class Lechuga extends Ingrediente {

  /*Baguette que ayudará a decorar al ingrediente.*/
  private Baguette baguette;

  /*Valor que se le añadirá a la orden previa.*/
  private int costo = 2;

  /*Nombre para mostrar como la orden en el ticket.*/
  private String nombreIng = "Lechuga";

  /*Método para envolver el Ingrediente como un Baguette.*/
  public Lechuga(Baguette baguette) {
      this.baguette = baguette;
  }

  public int getCosto() {
    return this.costo;
  }

  public String getNombreINg() {
    return this.nombreIng;
  }
  
  /*Sobrescribe el método de la clase abstracta con el formato adecuado.*/
  @Override public String getDescripcion() {
    return baguette.getDescripcion() +  "+" + this.getNombreINg();
  }

  @Override public int costo() {
    return baguette.costo() + this.getCosto();
  }

}

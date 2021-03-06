/*
* Clase que exteinde de Ingrediente, implementa sus métodos abstractos y sus
* respectivos getters.
*/
public class Jamon extends Ingrediente {

  /*Baguette que ayudará a decorar al ingrediente.*/
  private Baguette baguette;

  /*Valor que se le añadirá a la orden previa.*/
  private int costo = 3;

  /*Nombre para mostrar como la orden en el ticket.*/
  private String nombreIng = "Jamon";

  /*Método para envolver el Ingrediente como un Baguette.*/
  public Jamon(Baguette baguette) {
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
    return this.baguette.getDescripcion() + "+" + this.getNombreINg();
  }

  @Override public int costo() {
    return baguette.costo() + this.getCosto();
  }

}

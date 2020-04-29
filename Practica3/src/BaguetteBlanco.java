/**
* Clase que implementa Baguette, para especificar el tipo de pan. Blanco en este caso.
* Se incluyen los respectivos getters y setters, además de los métodos de la Interfaz
* para tener mayor orden.
*/
public class BaguetteBlanco implements Baguette {

  /*Tipo de pan*/
  private String nombre = "Baguette Blanco";

  /*Precio que añade el tipo de pan*/
  private int costo = 1;

  public String getNombre() {
    return this.nombre;
  }

  public int getCosto() {
    return this.costo;
  }

  @Override public int costo() {
    return this.getCosto();
  }

  @Override public String getDescripcion() {
    return this.getNombre();
  }
}

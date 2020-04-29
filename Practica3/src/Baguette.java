/**
* Interfaz para generealizar el comportamiento de los Baguettes (Y futuramente las pizzas)
*/
public interface Baguette {

  /*Método que no regresará las descripciones de cada Baguette.*/
  public String getDescripcion();

  /*Método que regresa el costo acumulado por cada Baguette.*/
  public int costo();

}

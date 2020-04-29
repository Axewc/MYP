/**
* Clase abstracta para implementar todos los Ingredientes que serán añadidos a
* el baguette (pan) inicial.
*/
public abstract class Ingrediente implements Baguette {

  /*Método que no regresará las descripciones de cada Ingrediente.*/
  public abstract String getDescripcion();

  /*Método que regresa el costo acumulado por cada Ingrediente.*/
  public abstract int costo();

}

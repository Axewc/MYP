/*
* Clase que implemnta Baguette, para utilizar sus métodos y poder tratar
* a las pizzas "cómo" Baguettes.
*/
public class PizzaAdapter implements Baguette {

  /*Objeto Pizza que será adaptada para poder utilizar la infefaz Baguette*/
  public Pizza pizza;

  /**
  * Método adaptadador para que nuestro objeto Pizza de la clase, pueda ser
  * tratado cómo un Baguette, para utilizar los métodos de la interfaz.
  */
  public PizzaAdapter(Pizza pizza) {
    this.pizza = pizza;
  }

  /**
  * Sobreescribe el método de getDescipcion de la clase Baguette, con un
  * formato de salida similar al que utilizamos con los Baguettes, para que en
  * el ticket se muestre más homogéneo.
  */
  @Override public String getDescripcion() {
    return "Pizza con: Masa " + this.pizza.getMasa() +  "+" +
                                this.pizza.getCarne()  +  "+" +
                                this.pizza.getQueso();
  }

  /*Idéntico a los métodos de Baguette. Nos regresa el precio de la pizza. */
  @Override public int costo() {
    return this.pizza.getCosto();
  }

}

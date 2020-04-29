import java.util.Scanner;
import java.util.InputMismatchException;

/**
* Clase dónde se implemnta el método main, y encapsula todo el funcionamiento del
* asisten+ para configurar los Baguettes y ordenar las Pizzas.
* Importamos Scanner, para permitir la entrada de información del usuario,
* y también InputMismatchException, para cuándo el usuario intente meter una letra.
*/
public class Menu {

/*
* Pizza que se va a estar usando como objeto de contexto para poder ordenar
* los distintos tipos de pizzas.
*/
public static Pizza nueva;

/*
* Baguette que se va a estar usando como objeto de contexto para poder decorar
* con los distintos ingredientes.
*/
public static Baguette nuevo;
/* Total que se irá actualiznado para actualizar el total a pagar.*/
public static int total = 0;
/* Cadena que estará almacenando la orden del final.*/
public static String orden = "Tu orden: ";

  /*
  * El método main, que hará uso de tres métodos auxiliares preparaPizza
  * y preparaBaguette, e imprimeTicket.
  * Estos métodos engloban todo el funcionamiento, y aquí lo organizamos,
  * junto a una introducción simple para el usuario y la estructura de condiciones
  * haciendo uso de diferentes indicadores (enteros) que se irán actualizando
  * según la opción que elija el usuario para su pedido.
  * En todo el programa usaremos cómo cláusula de escape "segura" el "0" para qué
  * el usuario pueda cancelar su pedido en cualquier punto de la ejecución.
  * (Lo encontré cómo la situación más apegada a la realidad).
  * Terminando con imprimeTicket para justamente dar salida a las descripciones
  * de la orden y el costo toal de la misma.
  */
  public static void main(String[] args) {
    int seleccion = 0;
    int seleccionBaguette = 4;
    int seleccionPizza = 0;
    int nuevaOrden = 1;
    Scanner cleccion = new Scanner(System.in);
    Scanner seleccionU = new Scanner(System.in);
    while (nuevaOrden ==  1) {
    System.out.println("Bienvenido a WaySub!, por favor indiqueme su orden");
    System.out.println("1. Baguette \n" +
                       "2. Pizza \n" +
                       "3.Pensandolo bien... \n");

    try {
      seleccion = seleccionU.nextInt();

    switch (seleccion) {
      case 1:
      preparaBaguette(seleccionBaguette);
      break;
      case 2:
      preparaPizza(seleccionPizza);
      break;
      case 3:
      System.out.println("Oh, no se preocupe. Vuelva pronto!");
      return;
      default:
      System.out.println("Opción equivocada, pruebe con 1,2,3");
      break;
    }
    System.out.println("\n Deseas agrear otro producto [1. Si /0. No]?\n");
    nuevaOrden = cleccion.nextInt();

    } catch(InputMismatchException e) {
      throw new InputMismatchException("Error en la entrada. Solo puede utilizar NUMEROS [0,1,...10]\n");
      }
    }
    imprimeTicket(nuevo);
    System.out.println("Hasta luego!");
  }

  /**
  * Éste método nos ayuda a seleccionar el pan e ingredientes del Baguette,
  * además de; iniciar un ciclo en el que podamos ir iterando para añadir
  * nuevos ingredientes al Baguette original. Nos aseguramos de que el ciclo
  * ocurra al menos una vez (el pan sólo). Y nos auxiliamos de los métodos:
  * escogeIngrediente y escogePan, para esocger Ingredientes y el tipo de pan.
  * @param seleccionBaguette es la bandera que indica, en primera, el pan seleccionado.
  *                          y posteriormente se actualiza por medio del Scanner
  *                          y que pueda usarse para seleccionar los ingredientes.
  */
  public static void preparaBaguette(int seleccionBaguette) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido al asistente de Baguette's de WaySub. \n");
    System.out.println("Primero, indique el pan de su preferencia: \n");
    System.out.println("0. Cancelar Orden \n" +
                      "1. Blanco \n" +
                      "2. Integral \n" +
                      "3. Ajo \n" +
                      "4. Oregano \n");
    Baguette baguetteNuevo;
    do {
    seleccionBaguette = sc.nextInt();
    baguetteNuevo = escogePan(seleccionBaguette);
    } while (seleccionBaguette > 4);
    if(seleccionBaguette == 0)
      return;
    System.out.println("Ahora, indique los Ingredientes de su preferencia: \n");
    while (seleccionBaguette != 10) {
    System.out.println("0. Cancelar Orden \n" +
                      "1. Jamon \n" +
                      "2. Peperoni \n" +
                      "3. Pollo \n" +
                      "4. Cebolla \n" +
                      "5. Jitomate \n" +
                      "6. Lechuga \n" +
                      "7. Mayonesa  \n" +
                      "8. Catsup  \n" +
                      "9. Mostaza  \n" +
                      "10. Terminar Orden \n");
    seleccionBaguette = sc.nextInt();
    baguetteNuevo = escogeIngrediente(seleccionBaguette, baguetteNuevo);
    if(seleccionBaguette == 0)
    return;
    }
  }

  /**
  * Método que regresa un Baguette según el tipo de pan seleccionado.
  * @param pan que será nuestra bandera para indicar, justamente, el tipo de
  *            Baguette que se creará.
  * @return Baguette el cuál será el que se continuará decorando con los demás
  *                  ingredientes.
  */
  public static Baguette escogePan(int pan) {
    switch (pan) {
      case 0:
      System.out.println("Oh, no se preocupe. Vuelva pronto!");
        break;

      case 1:
        System.out.println("Muy bien elegiste Pan Blanco");
        Baguette blanco = new BaguetteBlanco();
        return blanco;

      case 2:
        System.out.println("Muy bien elegiste Pan Integral");
        Baguette integral = new BaguetteIntegral();
        return integral;

      case 3:
        System.out.println("Muy bien elegiste Pan de Ajo");
        Baguette ajo = new BaguetteAjo();
        return ajo;

      case 4:
        System.out.println("Muy bien elegiste Pan de Oregano");
        Baguette oregano = new BaguetteOregano();
        return oregano;

      default:
      System.out.println("Pan no disponible. \n [Pruebe con 1,2,3,4] ");
      break;
    }

  Baguette vacio = new BaguetteBlanco();
  return vacio;
  }

  /**
  * Método que regresa un Baguette con distintos ingredientes añadidios.
  * Adenás de que éste método puede terminar la orden en el "caso 10", el cuál
  * actualiza las variables estáticas de clase y les da cierto formato de salida.
  * (variables: orden y total)
  * @param Ingrediente que será nuestra bandera para indicar, justamente,
  *                    el tipo de Ingrediente que se añadirá a nuestro Baguette.
  * @param nuevo será el Baguette al cuál le añadiremos nuevos ingredientes.
  * @return Baguette el cuál será el que se continuará decorando con los demás
  *                  ingredientes.
  */
  public static Baguette escogeIngrediente(int Ingrediente, Baguette nuevo) {
    switch (Ingrediente) {
      case 0:
        System.out.println("Oh, no se preocupe. Vuelva pronto!");
      break;
      case 1:
      System.out.println("Agregaste Jamon \n");
      nuevo = new Jamon(nuevo);
      return nuevo;
      case 2:
      System.out.println("Agregaste Peperoni \n");
      nuevo = new Peperoni(nuevo);
      return nuevo;
      case 3:
      System.out.println("Agregaste Pollo \n");
      nuevo = new Pollo(nuevo);
      return nuevo;
      case 4:
      System.out.println("Agregaste Cebolla \n");
      nuevo = new Cebolla(nuevo);
      return nuevo;
      case 5:
      System.out.println("Agregaste Jitomate \n");
      nuevo = new Jitomate(nuevo);
      return nuevo;
      case 6:
      System.out.println("Agregaste Lechuga \n");
      nuevo = new Lechuga(nuevo);
      return nuevo;
      case 7:
      System.out.println("Agregaste Mayonesa \n");
      nuevo = new Mayonesa(nuevo);
      return nuevo;
      case 8:
      System.out.println("Agregaste Catsup \n");
      nuevo = new Catsup(nuevo);
      return nuevo;
      case 9:
      System.out.println("Agregaste Mostaza \n");
      nuevo = new Mostaza(nuevo);
      return nuevo;
      case 10:
      orden += nuevo.getDescripcion() + ".\n          ";
      total += nuevo.costo();
      break;
      default:
      System.out.println("Ingrediente no disponible \n");
      break;
    }
    return nuevo;
  }

  /**
  * Método homólogo a preparaBaguette. en dónde le hacemos saber al usuario
  * los tipos de pizzas disponibles y solicitamos al usuario que elija una de ellas.
  * Cosas a destacar: estaremos creando "pizzas de tipo Baguette" para que puedan
  * hacer uso de esa interfaz. Siguiendo nuestro patrón de diseño.
  * Haremos uso de un método auxiliar escogePizza.
  * @param seleccionPizza será la bandera que el usuario actualizará según el
  *                       tipo de pizza que desee.
  */
  public static void preparaPizza(int seleccionPizza) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido al asistente de Pizzas de WaySub. \n");
    System.out.println("Las siguientes son las pizzas que tenemos disponibles: \n");
    System.out.println("0. Cancelar Orden \n" +
                       "1. Pizza de Pollo \n" +
                       "2. Pizza de Jamon \n" +
                       "3. Pizza de Salchicha \n" +
                       "4. Pizza Carnes \n" +
                       "5. Pizza Big Chicken \n");
    Baguette pizzaNueva;
    do {
    seleccionPizza = sc.nextInt();
    pizzaNueva = escogePizza(seleccionPizza);
  } while (seleccionPizza > 5);
    if(seleccionPizza == 0)
      return;
  }

  /**
  * Método homólogo a escogeIngrediente. Éste método se encarga de
  * crear y adaptar las pizzas para que puedan ser tratadas cómo PizzaAdapter
  * El usuario ya habiendo elegido el tipo de pizza, en primera; se crea la pizza
  * como objeto particular y la adaptamos con el constructor de PizzaAdapter para
  * regresarla como Baguette.
  * Cómo cada pizza solamente tiene una "configuración", no importa la que
  * el usuario seleccioné, siempre se van a actualizar las variables "orden" y
  * "total" dándole el formato ya generalizado.
  * @param pizza es la bandera que nos dice el tipo de pizza que se seleccionó.
  * @return Baguette que es de hecho la pizza adaptada que el usuario nos pidió.
  */
  public static Baguette escogePizza(int pizza) {
    switch (pizza) {
      case 0:
      System.out.println("Oh, no se preocupe. Vuelva pronto!");
        break;

      case 1:
        System.out.println("Muy bien elegiste Pizza de Pollo");
        nueva = new PizzaPollo();
        Baguette pizzaAdaptada0 = new PizzaAdapter(nueva);
        orden += pizzaAdaptada0.getDescripcion() + ".\n          ";
        total += pizzaAdaptada0.costo();
        return pizzaAdaptada0;

      case 2:
        System.out.println("Muy bien elegiste Pizza Jamon");
        nueva = new PizzaJamon();
        Baguette pizzaAdaptada1 = new PizzaAdapter(nueva);
        orden += pizzaAdaptada1.getDescripcion() + ".\n          ";
        total += pizzaAdaptada1.costo();
        return pizzaAdaptada1;

      case 3:
        System.out.println("Muy bien elegiste Pizza Salchicha");
        nueva = new PizzaSalchicha();
        Baguette pizzaAdaptada2 = new PizzaAdapter(nueva);
        orden += pizzaAdaptada2.getDescripcion() + ".\n          ";
        total += pizzaAdaptada2.costo();
        return pizzaAdaptada2;

      case 4:
        System.out.println("Muy bien elegiste Pizza de Carnes");
        nueva = new PizzaCarnes();
        Baguette pizzaAdaptada3 = new PizzaAdapter(nueva);
        orden += pizzaAdaptada3.getDescripcion() + ".\n          ";
        total += pizzaAdaptada3.costo();
        return pizzaAdaptada3;

      case 5:
        System.out.println("Muy bien elegiste Pizza Big Chicken");
        nueva = new PizzaBigChicken();
        Baguette pizzaAdaptada4 = new PizzaAdapter(nueva);
        orden += pizzaAdaptada4.getDescripcion() + ".\n          ";
        total += pizzaAdaptada4.costo();
        return pizzaAdaptada4;

      default:
      System.out.println("Pizza no disponible. \n [Pruebe con 1,2,3,4,5] ");
      break;
    }
    Baguette pi = new PizzaAdapter(nueva);
    return pi;
  }

  /**
  * Método que nos imprimirá las variables estáticas de clase: orden, y total.
  * las cuáles simulan el ticket de compra.
  * @param nuevo es el baguette al que se le extraerá su descripción y costo.
  * nota mental: PizzaAdapter también es un Baguette.
  */
  public static void imprimeTicket(Baguette nuevo) {
    System.out.println("\n...:::      WaySub      :::... \n");
    System.out.println("...:::Recibo del Cliente:::... \n");

    System.out.println(orden);
    System.out.println("Total:    $"+total);
  }

}

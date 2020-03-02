
import java.util.LinkedList;

public class Consola {

  public static void main(String[] args) {
    Persona bob = new Persona(1, 50.50, "Bob");
    Servicio ne = new Servicio();
    ne.netflix();
    ne.getServ().pago(bob);
  }
}


import java.util.LinkedList;

public class Consola {
  // Servicio netflix = new Servicio();
  static Servicio ne = new Servicio();

  public static void main(String[] args) {
    Persona bob = new Persona(1, 50.50, "Bob");
    ne.netflix();
    ne.getServ().pago(bob, ne);
    // System.out.println();
    System.out.println(bob.getPresupuesto());
    ne.getServ().pago(bob, ne);
    System.out.println(bob.getPresupuesto());

  }
}

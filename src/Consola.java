
import java.util.LinkedList;

public class Consola {
  // Servicio netflix = new Servicio();
  static Servicio ne = new Servicio();

  public static void main(String[] args) {
    Persona bob = new Persona(1, 5.00, "Bob");
    Persona Alicia = new Persona(1, 500.00, "Alicia");
    ne.netflix();
    ne.getServ().pago(bob.getTipoSusc(), bob, ne);
    // System.out.println();
    System.out.println(bob.getPresupuesto());
    ne.getServ().pago(bob.getTipoSusc(), bob, ne);
    System.out.println(bob.getPresupuesto());
    ne.getServ().cancelaSuscripcion(bob, ne);

    ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
    System.out.println(Alicia.getPresupuesto());
    ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
    System.out.println(Alicia.getPresupuesto());
    ne.getServ().cancelaSuscripcion(Alicia, ne);
    ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
    System.out.println(Alicia.getPresupuesto());


  }
}

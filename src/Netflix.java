
import java.util.LinkedList;


public class Netflix implements Transaccion {

  private boolean primeraVez;

  public Netflix() {}

  @Override public void pago(int ts, Persona pe, Servicio s) {
    // Servicio s = new Servicio();
    if(!s.getUsuarios().contains(pe)) {
      s.getUsuarios().add(pe);
      System.out.println("Bienvenido a la prueba gratis de Netflix.");
      pe.getListaDeServicios().add(s);

    } else if(s.getExUsuarios().contains(pe)) {
        System.out.println("Bienvenido de vuelta a Netflix.");
        switch (ts) {
          case 1:
            CobroNetflix ne1 = new NetflixUno();
            ne1.pago(pe, s);
            break;
          case 2:
            CobroNetflix ne2 = new NetflixDos();
            ne2.pago(pe, s);
            break;
          case 3:
            CobroNetflix ne3 = new NetflixTres();
            ne3.pago(pe, s);
            break;
          default:
            System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
            break;
        }
        s.getExUsuarios().remove(pe);
        s.getUsuarios().add(pe);
        pe.getListaDeServicios().add(s);

    } else {

      switch (ts) {
        case 1:
          CobroNetflix ne1 = new NetflixUno();
          ne1.pago(pe, s);
          break;
        case 2:
          CobroNetflix ne2 = new NetflixDos();
          ne2.pago(pe, s);
          break;
        case 3:
          CobroNetflix ne3 = new NetflixTres();
          ne3.pago(pe, s);
          break;
        default:
          System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
          break;
      }
      s.getUsuarios().add(pe);
      pe.getListaDeServicios().add(s);
    }

    // System.out.println("\n Estoy harto del PRI");
  }

  // @Override public void cancelaSuscripcion(Persona per, Object s) {
  //   LinkedList<Servicio> lista = new LinkedList<>();
  //   lista = per.getListaDeServicios();
  //   if(s instanceof Netflix) {
  //     lista.remove(s);
  //     System.out.println("Lamentamos que tengas que irte :(");
  //   }
  //   System.out.println("Operacion invalida");
  //
  // }

  @Override public boolean verificaPresupuesto(Persona per) {
    if(!(per.getPresupuesto() >= 7))
      return false;
      // return true;
    if(!(per.getPresupuesto() >= 10))
      return false;
      // return true;
     if(!(per.getPresupuesto() >= 15))
       return false;
       return true;
  }

  public void cancelaSuscripcion(Persona per, Servicio s) {
    LinkedList<Servicio> lista = new LinkedList<>();
    lista = per.getListaDeServicios();
    if(s.getServ() instanceof Netflix) {
      lista.remove(s);
      System.out.println("Lamentamos que tengas que irte :(");
      s.getExUsuarios().add(per);
    } else {
      System.out.println("Operacion invalida");
    }
  }

}

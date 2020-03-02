
import java.util.LinkedList;


public class Netflix implements Transaccion {

  private boolean primeraVez;

  public Netflix() {}

  @Override public void pago(Persona pe) {
    Servicio s = new Servicio();
    if(s.getUsuarios().contains(pe)) {
      System.out.println("Bienvenido a la prueba gratis de Netflix.");
      s.getUsuarios().add(pe);
    } else if(s.getExUsuarios().contains(pe)) {
        System.out.println("Bienvenido de vuelta a Netflix.");
        Double presupuesto = pe.getPresupuesto() - suscripcion(pe.getTipoSusc(), pe);
        s.getExUsuarios().remove(pe);
        pe.getListaDeServicios().add(s);
    } else {
      Double presupuesto = pe.getPresupuesto() - suscripcion(pe.getTipoSusc(), pe);
    }

    System.out.println("\n SIIIIII");
  }

  @Override public int suscripcion(int dispositivos, Persona per) {
    switch (dispositivos) {
      case 1:
          // NetflixUno serv = new NetflixUno();
          // pago(per);
          return 7;
      case 2:
          // NetflixDos serv = new NetflixDos();
          // pago(per);
          return 10;
      case 3:
          // NetflixTres serv = new NetflixTres();
          // pago(per);
          return 15;
      default:
        System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
        break;
    }
    return -1;
  }

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

}

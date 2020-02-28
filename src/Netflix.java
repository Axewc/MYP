package src;

import java.util.LinkedList;
import src.*;


public class Netflix implements Transacciones {

  LinkedList usuarios = new LinkedList<Personas>();
  LinkedList exusuarios = new LinkedList<Personas>();


  @Override public void pago(Persona pe) {
    if(!usuarios.contain(pe)) {
      System.out.println("Bienvenido a la prueba gratis de Netflix.");
      usuarios.add(pe);
      pe.listaDeServicios.add(Netflix);
    } else if(exusuarios.contain(per)) {
      System.out.println("Bienvenido de vuelta a Netflix.");
      pe.presupuesto -= suscripcion(tipoSusc, per);
      exusuarios.remove(per);
      usuarios.add(per);
      pe.listaDeServicios.add(Netflix);
    } else {
      pe.presupuesto -= suscripcion(tipoSusc, per);
    }


    // Idea al aire que seguro no sirve.
    // if(pe.presupuesto < 7)
    //   System.out.println("Saldo insuficiente.");
    // if(usuarios.contain(pe)) {
    //   pe.presupuesto -= suscripcion(per.tipoSusc, per);
    // } else if()
    //
    //   System.out.println("Bienvenido a la prueba gratis de Netflix");
    //   usuarios.add(per);
    //   return;
    //
    //   // per.presupuesto -= suscripcion(pe.tipoSusc, pe);
  }

  @Override public int suscripcion(int dispositivos, Persona per) {
    switch (dispositivos) {
      case 1:
          NetflixUno serv = new NetflixUno();
          serv.pago(per);
          return 7;
        break;
      case 2:
          NetflixDos serv = new NetflixDos();
          serv.pago(per);
          return 10;
        break;
      case 3:
          NetflixTres serv = new NetflixTres();
          serv.pago(per);
          return 15;
        break;
      default:
        System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
        break;
    }
  }

  @Override public boolean verificaPresupuesto(Persona per) {
    if(!(per.presupuesto >= 7)) {
      return false;
      return true;
    }
    if(!(per.presupuesto >= 10)) {
      return false;
      return true;
    }
     if(!(per.presupuesto >= 15)) {
       return false;
       return true;
     }
  }

}

package src;

import java.util.LinkedList;
import src.*;

public class Persona {
  int tiṕoSusc;
  String nombre;
  Double presupuesto;
  LinkedList listaDeServicios = new LinkedList<Servicio>();
  // boolean primeraVez = True;


  public void pagar(Servicio serv) {
    serv.pago(this);
  }

  public boolean suscribirse(Servicio serv, int tipoSusc) {
    if(serv == Netflix) {
      serv.suscripcion(tipoSusc, this);
      this.listaDeServicios.add(serv);
    }
    // switch (serv) {
    //   case Netflix:
    //   break;
    //   default:
    //   break;
    // }
  }

}

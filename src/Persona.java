import java.util.LinkedList;

public class Persona {
  int tiṕoSusc;
  String nombre;
  Double presupuesto;
  LinkedList listaDeServicios = new LinkedList<Servicio>;
  // boolean primeraVez = True;


  public void pagar(Servicio serv) {
    serv.pago(this);
  }

  public boolean suscribirse(Servicio serv, int tipoSusc) {
    switch (serv) {
      case Netflix:
        serv.suscripcion(tipoSusc, this);
      break;
      case

    }
      this.listaDeServicios.add(serv);

  }

}


import java.util.LinkedList;


public class Servicio {

  private Transaccion serv;
  private LinkedList usuarios = new LinkedList<Persona>();
  private LinkedList exUsuarios = new LinkedList<Persona>();
  // private recomendacion;


  public Transaccion getServ() {
    return this.serv;
  }
  public void setServ(Transaccion serv) {
    this.serv = serv;
  }

  public LinkedList getUsuarios() {
    return this.usuarios;
  }

  public void setUsuarios(LinkedList<Persona> usuarios) {
    this.usuarios = usuarios;
  }
  public LinkedList getExUsuarios() {
    return this.exUsuarios;
  }

  public void setExUsuarios(LinkedList<Persona> exUsuarios) {
    this.usuarios = exUsuarios;
  }

  public void netflix() {
    serv = new Netflix();
  }

  // public void cancelaSuscripcion(Persona per, Object s) {
  //   LinkedList<Servicio> lista = new LinkedList<>();
  //   lista = per.getListaDeServicios();
  //   if(s instanceof Netflix) {
  //     lista.remove(s);
  //     System.out.println("Lamentamos que tengas que irte :(");
  //     s.getExUsuarios().add(per);
  //   } else {
  //     System.out.println("Operacion invalida");
  //   }
  // }

  // private void validaPago(Persona persona) {
  //   persona.pagar(serv);
  //   return;
  // }

}


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

  public void netflix() {
    serv = new Netflix();
  }

  private void validaPago(Persona persona) {
    persona.pagar(serv);
    return;
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

  public static void main(String[] args) {
    Persona bob = new Persona(1, 50.50, "Bob");
    Servicio ne = new Servicio();
    ne.netflix();
    ne.serv.pago(bob);

    // // Transaccion netf =
    // ne.netflix();
    // netf.pago(bob);
    // // s.pago(bob);
  }

}

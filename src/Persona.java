
import java.util.LinkedList;

public class Persona {
  private int tipoSusc;
  private String nombre;
  private double presupuesto;
  private LinkedList listaDeServicios = new LinkedList<Servicio>();


  public Persona(int tipoSusc, Double presupuesto,
                 String nombre) {
                 this.tipoSusc = tipoSusc;
                 this.presupuesto = presupuesto;
                 this.nombre = nombre;
                 // this.listaDeServicios = listaDeServicios;
  }

  public int getTipoSusc() {
    return this.tipoSusc;
  }

  public void setTipoSusc(int tipoSusc) {
    this.tipoSusc = tipoSusc;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPresupuesto() {
    return this.presupuesto;
  }

  public void setPresupuesto(double presupuesto){
    this.presupuesto = presupuesto;
  }

  public LinkedList<Servicio> getListaDeServicios() {
    return this.listaDeServicios;
  }

  public void setListaDeServicios(LinkedList<Servicio> listaDeServicios) {
    this.listaDeServicios = listaDeServicios;
  }

  // public void pagar(Transaccion serv) {
  //   serv.pago(this);
  // }

  // public boolean suscribirse(Transaccion serv, int tipoSusc) {
  //   if(serv instanceof Netflix) {
  //     serv.getServ().suscripcion(tipoSusc, this);
  //     this.listaDeServicios.addLast(serv);
  //   }
  //   // switch (serv) {
  //   //   case Netflix:
  //   //   break;
  //   //   default:
  //   //   break;
  //   // }
  //   return true;
  // }

  // public static void main(String[] args) {
  //   Persona bob = new Persona(1, 50.50, "Bob");
  //   Servicio s = new Servicio();
  //   s.netflix();
  //   s.pago(bob);
  //   // s.pago(bob);
  // }

}

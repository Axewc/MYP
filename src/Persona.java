
import java.util.LinkedList;

public class Persona implements Observador {
  private int tipoSusc;
  private String nombre;
  private double presupuesto;
  private LinkedList<Servicio> listaDeServicios = new LinkedList<Servicio>();


  public Persona(int tipoSusc, Double presupuesto,
                 String nombre) {
                 this.tipoSusc = tipoSusc;
                 this.presupuesto = presupuesto;
                 this.nombre = nombre;
                 this.listaDeServicios = listaDeServicios;
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

  public boolean esPrime() {
    return this.tipoSusc == 5;
  }

  @Override public String update() {
  for (Servicio s : listaDeServicios) {
    // s.getRecomendacionDeHoy();
    // System.out.println("A " + this.getNombre() + " le restan: " +  "$"+this.getPresupuesto() + " pesos");
      switch(this.getTipoSusc()) {
        case 1:
        return this.getNombre() + " esta en el servicio basico de Netflix ($7) \n" +
        "Hoy Netflix les recomienda: " + s.getRecomendacionDeHoy() + ".";

        case 2:
        return this.getNombre() + " esta en el servicio medio de Netflix ($10) \n" +
        "Hoy Netflix les recomienda: " + s.getRecomendacionDeHoy() + ".";

        case 3:
        return this.getNombre() + " esta en el servicio premium de Netflix ($14) \n" +
        "Hoy Netflix les recomienda: " + s.getRecomendacionDeHoy() + ".";

        case 4:
        return this.getNombre() + " esta en el servicio basico de Amazon ($7) \n"+
        "Hoy Amazon les recomienda: " + s.getRecomendacionDeHoy() + ".";

        case 5:
        return this.getNombre() + " esta en el servicio premium de Amazon ($13) \n"+
        "Hoy Amazon les recomienda: " + s.getRecomendacionDeHoy() + ".";

        case 6:
        return this.getNombre() + " esta en el servicio Regular de spotify (13) \n";

        case 7:
        return this.getNombre() + " esta en el servicio premium de spotify ($) \n";

        case 8:
        return this.getNombre() + " esta en el servicio basico de twitch ($7) \n";

        case 9:
        return this.getNombre() + " esta en el servicio de twitch prime ($10) \n";

        case 10:
        return  this.getNombre() + " esta en el servicio Regular de youtube \n";

        case 11:
        return  this.getNombre() + " esta en el servicio premium de youtube \n";

        default:
        return  this.getNombre() + " no pertenece a ningún servicio \n";
      }
    }
    return "A " + this.getNombre() + " le restan: " +  "$"+this.getPresupuesto() + " pesos";
  }

}

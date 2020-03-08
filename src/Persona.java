
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

  @Override public void update() {
  for (Servicio s : listaDeServicios) {
    // s.getRecomendacionDeHoy();
    System.out.println("A " + this.getNombre() + " le restan: " +  "$"+this.getPresupuesto() + " pesos");
      switch(this.getTipoSusc()) {
        case 1:
        System.out.println(this.getNombre() + " esta en el servicio basico de Netflix ($7)");
        break;

        case 2:
        System.out.println(this.getNombre() + " esta en el servicio medio de Netflix ($10)");
        break;

        case 3:
        System.out.println(this.getNombre() + " esta en el servicio premium de Netflix ($14)");
        break;

        case 4:
        System.out.println(this.getNombre() + " esta en el servicio basico de Amazon ($7)");
        break;

        case 5:
        System.out.println(this.getNombre() + " esta en el servicio premium de Amazon ($13)");
        break;

        case 6:
        System.out.println(this.getNombre() + " esta en el servicio Regular de spotify (13)");
        break;

        case 7:
        System.out.println(this.getNombre() + " esta en el servicio premium de spotify ($)");
        break;

        case 8:
        System.out.println(this.getNombre() + " esta en el servicio basico de twitch ($7)");
        break;

        case 9:
        System.out.println(this.getNombre() + " esta en el servicio de twitch prime ($10)");
        break;

        case 10:
        System.out.println(this.getNombre() + " esta en el servicio Regular de youtube");
        break;

        case 11:
        System.out.println(this.getNombre() + " esta en el servicio premium de youtube");
        break;

        default:
        System.out.println(this.getNombre() + " no pertenece a ningún servicio");
        break;
      }
      break;
  }

}

}

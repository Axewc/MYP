
import java.util.LinkedList;

public class Persona implements Observador {
  private int tipoSusc;
  private String nombre;
  private double presupuesto;
  private LinkedList<Servicio> listaDeServicios = new LinkedList<Servicio>();
  private String recomendacionDiaria;


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

  /**
  * regresa la recomendacion del día
  * @return la recomendacion.
  */
  public String getRecomendacionDiaria() {
     return this.recomendacionDiaria;
  }

  /**
  * Método que determina la recomendacion del día.
  * @param recomendacion la recomendacion.
  */
  public void setRecomendacionDiaria(String recomendacionDiaria) {
     this.recomendacionDiaria = recomendacionDiaria;
  }

  @Override public void update() {
  for (Servicio s : this.listaDeServicios) {
    String recomendacionNueva;
    recomendacionNueva = s.getRecomendacionDeHoy();
    setRecomendacionDiaria(recomendacionNueva);
  }
}

}

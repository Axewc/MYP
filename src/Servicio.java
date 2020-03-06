
import java.util.LinkedList;


public class Servicio implements Sujeto{

    private Transaccion serv;
    private LinkedList<Persona> usuarios = new LinkedList<Persona>();
    private LinkedList<Persona> exUsuarios = new LinkedList<Persona>();
    private LinkedList<String> recomendacion = new LinkedList<String>();
    private String recomendacionDeHoy;
    // private recomendacion;

    @Override public void agregar(Persona p, LinkedList<Persona> l) {
	l.add(p);
    }

    @Override public void remover(Persona p, LinkedList<Persona> l) {
        l.remove(p);
    }

    @Override public void notificar() {
      for (Persona p : this.usuarios) {
        p.update();
      }
    }

  public Transaccion getServ() {
	   return this.serv;
  }

  public void setServ(Transaccion serv) {
	   this.serv = serv;
  }

  public LinkedList getUsuarios() {
	   return this.usuarios;
  }
  public void setRecomendacionDeHoy(String recomendacionDeHoy) {
	   this.recomendacionDeHoy = recomendacionDeHoy;
  }

  public String getRecomendacionDeHoy() {
    int r = 0;
     return this.recomendacion.get(r);
  }

  public void setUsuarios(LinkedList<Persona> usuarios) {
	   this.usuarios = usuarios;
  }

  public LinkedList getRecomendacion() {
	   return this.recomendacion;
  }

  public void setRecomendacion(LinkedList<String> recomendacion) {
	   this.recomendacion = recomendacion;
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

  //   public void twitch() {
	// serv = new Twitch();
  //   }

    public void youtube() {
	serv = new Youtube();
    }

    // @Override public void notificar(Persona p) {
    //   System.out.println("A " + p.getNombre() + " le restan: " +  "$"+p.getPresupuesto() + " pesos");
    //   switch(p.getTipoSusc()) {
    //     case 1:
    //     System.out.println(p.getNombre() + " esta en el servicio basico de Netflix ($7)");
    //     break;
    //     case 2:
    //     System.out.println(p.getNombre() + " esta en el servicio medio de Netflix ($10)");
    //     default:
    //     System.out.println(p.getNombre() + " no pertenece a Netflix ($14)");
    //
    //   }
    // }

}

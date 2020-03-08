import java.util.LinkedList;
import java.lang.Math;

public class Servicio implements Sujeto{

    /**
    *  Clase que implementa la interfaz sujeto para generar tipos de servicios y
    *  sus funciones.
    */

    /* El tipo de servicio transaccion para usar la interfaz. */
    private Transaccion serv;
    /* La lista de personas que estan suscritos al servicio. */
    private LinkedList<Persona> usuarios = new LinkedList<Persona>();
    /* La lista de personas que ya estuvieron suscritos. */
    private LinkedList<Persona> exUsuarios = new LinkedList<Persona>();
    /* La lista de recomendaciones de cada servicio. */
    private LinkedList<String> recomendacion = new LinkedList<String>();
    /* Un elemento de la lista de recomendaciones. */
    private String recomendacionDeHoy;

    /**
    * Va a agregar una persona a la lista de personas.
    * @param p es la persona a agregar.
    * @param l es la lista del servicio a agregar.
    */
    @Override public void agregar(Persona p, LinkedList<Persona> l) {
	     l.add(p);
    }

    /**
    Va a remover una persona de la lista de personas.
    * @param p es la persona a agregar.
    * @param l es la lista del servicio a agregar.
    */
    @Override public void remover(Persona p, LinkedList<Persona> l) {
        l.remove(p);
    }

    /**
    * Recorre la lita de usuarios y va a cambiar su recomendacion diaria.
    */
    @Override public String notificar() {
      for (Persona p : this.usuarios)
         return p.update(this);
         return "banderademexico";
    }

    /**
    * Regresa el serv de de Servicio.
    * @return el servicio de tipo transaccion listo para usarse
    */
    public Transaccion getServ() {
  	   return this.serv;
    }

    /**
    * Método que determina el serv.
    * @param serv la transaccion que cambiaremos.
    */
    public void setServ(Transaccion serv) {
  	   this.serv = serv;
    }

    /**
    * regresa la lista de usuarios según el servicio.
    * @return la lista de usuarios del servicio.
    */
    public LinkedList<Persona> getUsuarios() {
  	   return this.usuarios;
    }

    /**
    * Método que determina la recomendacion De Hoy.
    * @param recomendacionDeHoy es la recomendacion que se cambiará.
    */
    public void setRecomendacionDeHoy(String recomendacionDeHoy) {
  	   this.recomendacionDeHoy = recomendacionDeHoy;
    }

    /**
    * regresa la recomendación diaria.
    * @return la recomendación de hoy.
    */
    public String getRecomendacionDeHoy() {
      int numeroAleatorio = (int) (Math.random()*4+1);
       return recomendacion.get(numeroAleatorio);
    }

    /**
    * Método que determina la lista de usuarios.
    * @param usuarios la lista de usuarios.
    */
    public void setUsuarios(LinkedList<Persona> usuarios) {
  	   this.usuarios = usuarios;
    }

    /**
    * regresa la lista de recomendaciones
    * @return la lista de recomendaciones.
    */
    public LinkedList<String> getRecomendacion() {
  	   return this.recomendacion;
    }

    /**
    * Método que determina la lista de recomendaciones.
    * @param recomendacion la lista de recomendacion.
    */
    public void setRecomendacion(LinkedList<String> recomendacion) {
  	   this.recomendacion = recomendacion;
    }
    //
    // private void llenaRecomendacion(LinkedList<String> recomendaciones) {
    //     whi
    // }
    /**
    * regresa la lista de exUsuarios.
    * @return la lista de exUsuarios..
    */
    public LinkedList<Persona> getExUsuarios() {
  	   return this.exUsuarios;
    }

    /**
    * Método que determina la lista de exUsuarios.
    * @param exUsuarios la lista de exUsuarios.
    */
    public void setExUsuarios(LinkedList<Persona> exUsuarios) {
  	   this.usuarios = exUsuarios;
    }

    /**
    * Método que convierte @param serv en la estrategia Netflix.
    */
    public void netflix() {
  	   serv = new Netflix();
    }

    /**
    * Método que convierte @param serv en la estrategia Amazon,
    */
    public void amazon() {
  	   serv = new Amazon();
    }

    /**
    * Método que convierte @param serv en la estrategia Spotify.
    */
    public void spotify() {
       serv = new Spotify();
    }

    /**
    * Método que convierte @param serv en la estrategia Twitch.
    */
    public void twitch() {
  	   serv = new Twitch();
    }

    /**
    * Método que convierte @param serv en la estrategia Youtube.
    */
    public void youtube() {
  	   serv = new Youtube();
    }

    // /**
    // * Método que informa de todo lo que está pasndo con la persona.
    // */
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

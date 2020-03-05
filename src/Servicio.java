
import java.util.LinkedList;


public class Servicio implements Sujeto{

    private Transaccion serv;
    private LinkedList usuarios = new LinkedList<Persona>();
    private LinkedList exUsuarios = new LinkedList<Persona>();
    // private recomendacion;
    
    @Override public void agregar(Persona p, LinkedList<Persona> l) {
	l.add(p);
    }

    @Override public void remover(Persona p, LinkedList<Persona> l) {
        l.remove(p);
    }

    @Override public void notificar(Persona p) {
	return;
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
    
    public void twitch() {
	serv = new Twitch();
    }

    public void youtube() {
	serv = new Youtube();
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

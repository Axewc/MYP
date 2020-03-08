
import java.util.LinkedList;


public class Netflix implements Transaccion {
    
    public Netflix() {}
    
    @Override public void pago(int ts, Persona pe, Servicio s) {
	if(!s.getUsuarios().contains(pe)) {
	    s.agregar(pe, s.getUsuarios());
	    System.out.println("Bienvenido a la prueba gratis de Netflix " + pe.getNombre() + ".");
	    pe.getListaDeServicios().add(s);
	} else if(s.getExUsuarios().contains(pe)) {
	    System.out.println("Bienvenido de vuelta a Netflix "+ pe.getNombre()+ ".");
	    switch (ts) {
	    case 1:
		CobroNetflix ne1 = new NetflixUno();
		ne1.pago(pe, s);
		break;
	    case 2:
		CobroNetflix ne2 = new NetflixDos();
		ne2.pago(pe, s);
		break;
	    case 3:
		CobroNetflix ne3 = new NetflixTres();
		ne3.pago(pe, s);
		break;
	    default:
		System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
		break;
	    }
	    s.remover(pe, s.getExUsuarios());
	    s.agregar(pe, s.getUsuarios());
	    pe.getListaDeServicios().add(s);
	    
	} else {
	    
	    switch (ts) {
	    case 1:
		CobroNetflix ne1 = new NetflixUno();
		ne1.pago(pe, s);
		break;
	    case 2:
		CobroNetflix ne2 = new NetflixDos();
		ne2.pago(pe, s);
		break;
	    case 3:
		CobroNetflix ne3 = new NetflixTres();
		ne3.pago(pe, s);
		break;
	    default:
		System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
		break;
	    }
	    s.agregar(pe, s.getUsuarios());
	    pe.getListaDeServicios().add(s);
	}
    }
    
    @Override public boolean verificaPresupuesto(Persona per) {
	if(!(per.getPresupuesto() >= 7))
	    return false;
	if(!(per.getPresupuesto() >= 10))
	    return false;
	if(!(per.getPresupuesto() >= 15))
	    return false;
	return true;
    }
    
    @Override public void cancelaSuscripcion(Persona per, Servicio s) {
	LinkedList<Servicio> lista = new LinkedList<>();
	lista = per.getListaDeServicios();
	if(s.getServ() instanceof Netflix) {
	    lista.remove(s);
	    System.out.println("Lamentamos que tengas que irte "+ per.getNombre() +" :(.");
	    s.agregar(per, s.getExUsuarios());
	} else {
	    System.out.println("Operacion invalida");
	}
    }    
}

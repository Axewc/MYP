import java.util.LinkedList;

public class Youtube implements Transaccion {

    public Youtube() {}

    @Override public void pago (int ts, Persona pe, Servicio s){

	if(!s.getUsuarios().contains(pe)) {
	    s.getUsuarios().add(pe);
	    System.out.println("Bienvenido a Youtube");
	    pe.getListaDeServicios().add(s);
	} else if(s.getExUsuarios().contains(pe)) {
	    System.out.println("Bienvenido de vuelta a Youtube");
	    switch (ts) {
	    case 9:
		CobroYoutube yt1 = new YoutubeNormal();
		yt1.pago(pe, s);
		break;
	    case 10:
		CobroYoutube yt2 = new YoutubePremium();
		yt2.pago(pe, s);
		break;
	    default:
		System.out.println("Suscripción no disponible, trate con '9' o '10'.");
		break;
	    }
	    s.getExUsuarios().remove(pe);
	    s.getUsuarios().add(pe);
	    pe.getListaDeServicios().add(s);

	} else {
	    
	    switch (ts) {
	    case 9:
		CobroYoutube yt1 = new YoutubeNormal();
		yt1.pago(pe, s);
		break;
	    case 10:
		//If para ver si es su primer dia de premium
		CobroYoutube yt2 = new YoutubePremium();
		yt2.pago(pe, s);
		break;
	    default:
		System.out.println("Suscripción no disponible, trate con '9' o '10'.");
		break;
	    }
	    s.getUsuarios().add(pe);
	    pe.getListaDeServicios().add(s);
	}	    
    }

    @Override public boolean verificaPresupuesto(Persona per) {
	if(!(per.getPresupuesto() >= 0))
	    return false;
	if(!(per.getPresupuesto() >= 6))
	    return false;
	return true;
    }

    @Override public void cancelaSuscripcion(Persona per, Servicio s) {
	LinkedList<Servicio> lista = new LinkedList<>();
	lista = per.getListaDeServicios();
	if(s.getServ() instanceof Youtube) {
	    lista.remove(s);
	    System.out.println("Lamentamos que tengas que irte :(");
	    s.getUsuarios().remove(per);
	    s.getExUsuarios().add(per);
	    per.setListaDeServicios(lista);
	} else {
	    System.out.println("Operacion invalida");
	}
    }
}

import java.util.LinkedList;

public class Youtube implements Transaccion {

    LinkedList<String> recomendaciones = new LinkedList<String>(); // CAMBIO

    public Youtube() {}

    @Override public void pago (int ts, Persona pe, Servicio s){

	if(!s.getUsuarios().contains(pe)) {
	    s.getUsuarios().add(pe);
	    System.out.println("Bienvenido a Youtube "+ pe.getNombre() +".");
	    pe.getListaDeServicios().add(s);
	} else if(s.getExUsuarios().contains(pe)) {
	    System.out.println("Bienvenido de vuelta a Youtube "+ pe.getNombre() +".");
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
	    System.out.println("Lamentamos que tengas que irte "+ per.getNombre()+" :(.");
	    s.getUsuarios().remove(per);
	    s.getExUsuarios().add(per);
	    per.setListaDeServicios(lista);
	} else {
	    System.out.println("Operacion invalida");
	}
    }

    @Override public void llenaRecomendacion(Servicio s) {
      s.getRecomendacion().add("Luisito Comunica");
      s.getRecomendacion().add("Franco Escamilla");
      s.getRecomendacion().add("Derivando");
      s.getRecomendacion().add("Leyendas Legendarias");
      s.getRecomendacion().add("Werevertumorro");
      s.getRecomendacion().add("C de Ciencia");
    }
}

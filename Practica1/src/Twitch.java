import java.util.LinkedList;

public class Twitch implements Transaccion {

    LinkedList<String> recomendaciones = new LinkedList<String>(); // CAMBIO

    public Twitch() {}

    @Override public void pago(int ts, Persona pe, Servicio s) {
	if(!s.getUsuarios().contains(pe)) {
	    s.agregar(pe, s.getUsuarios());
	    System.out.println("Bienvenido a la prueba gratis de Twitch "+ pe.getNombre() +".");
	    pe.getListaDeServicios().add(s);
	} else if(s.getExUsuarios().contains(pe)) {
	    System.out.println("Bienvenido de vuelta a Twitch "+ pe.getNombre() +".");
	    switch (ts) {
	    case 8:
		CobroTwitch tw = new TwitchPago();
		tw.pago(pe, s);
		break;
	    default:
		System.out.println("Plan no disponible, pruebe con '8'.");
		break;
	    }
	    s.remover(pe, s.getExUsuarios());
	    s.agregar(pe, s.getUsuarios());
	    pe.getListaDeServicios().add(s);

	} else {

	    switch (ts) {
	    case 8:
		CobroTwitch tw = new TwitchPago();
		tw.pago(pe, s);
		break;
	    default:
		System.out.println("Plan no disponible, pruebe con '8'.");
		break;
	    }
	    s.agregar(pe, s.getUsuarios());
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
	if(s.getServ() instanceof Twitch) {
	    lista.remove(s);
	    System.out.println("Lamentamos que tengas que irte "+ per.getNombre() +" :(.");
	    s.getUsuarios().remove(per);
	    s.getExUsuarios().add(per);
	    per.setListaDeServicios(lista);
	} else {
	    System.out.println("Operacion invalida");
	}
    }

    @Override public void llenaRecomendacion(Servicio s) {
      s.getRecomendacion().add("Just Chating");
      s.getRecomendacion().add("Minecraft");
      s.getRecomendacion().add("Fortnite");
      s.getRecomendacion().add("League of Legends");
      s.getRecomendacion().add("Super Smash Bros");
      s.getRecomendacion().add("Apex Legends");
    }
}

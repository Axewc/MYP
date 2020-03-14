
import java.util.LinkedList;

public class Consola {

    static Servicio ne = new Servicio(); //1,2,3
    static Servicio am = new Servicio(); //4,5
    static Servicio sp = new Servicio(); //6,7
    static Servicio tw = new Servicio(); //8
    static Servicio yt = new Servicio(); //9,10


  public static void main(String[] args) {
  	Persona Alicia = new Persona(3, 500.00, "Alicia");
  	Persona Bob = new Persona(3, 40.00, "Bob");
  	Persona Cesar = new Persona(7, 40.00, "Cesar");
    Persona Diego = new Persona(2, 180.00, "Diego");
  	Persona Erika = new Persona(3, 300.00, "Erika");

	ne.netflix();
	am.amazon();
  sp.spotify();
	tw.twitch();
	yt.youtube();

  ne.getServ().llenaRecomendacion(ne);
  am.getServ().llenaRecomendacion(am);
  sp.getServ().llenaRecomendacion(sp);
  tw.getServ().llenaRecomendacion(tw);
  yt.getServ().llenaRecomendacion(yt);

	//Dia 1
	System.out.println("//Primer dia de cobros//");
	//Netflix
	System.out.println("**Cobros de Netflix**");
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	ne.getServ().pago(Diego.getTipoSusc(), Diego, ne);

	ne.getServ().pago(Erika.getTipoSusc(), Erika, ne);
	System.out.println("");
  System.out.println(ne.notificar() + "\n");


	//Amazon
	System.out.println("**Cobros de Amazon**");
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);

	System.out.println("");
  System.out.println(am.notificar() + "\n");


	//Spotify
	System.out.println("**Cobros de Spotify**");
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);

	Erika.setTipoSusc(6);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);

	System.out.println("");
  System.out.println(sp.notificar() + "\n");


	//Twitch
	System.out.println("**Cobros de Twitch**");
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);

	System.out.println("");
  System.out.println(tw.notificar() + "\n");


	//Youtube
	System.out.println("**Cobros de Youtube**");
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);

	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);

	Erika.setTipoSusc(9);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);

	System.out.println("");
	System.out.println("");
  System.out.println(yt.notificar() + "\n");



	//Día 2
	System.out.println("//Segundo dia de cobros//");
	//Netflix
	System.out.println("**Cobros de Netflix**");
	Alicia.setTipoSusc(3);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	Bob.setTipoSusc(3);
	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	Diego.setTipoSusc(2);
	ne.getServ().pago(Diego.getTipoSusc(), Diego, ne);

	Erika.setTipoSusc(3);
	ne.getServ().pago(Erika.getTipoSusc(), Erika, ne);
	System.out.println("");
  System.out.println(ne.notificar() + "\n");

	//Amazon
	System.out.println("**Cobros de Amazon**");
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);
	System.out.println("");
  System.out.println(am.notificar() + "\n");

	//Spotify
	System.out.println("**Cobros de Spotify**");
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	Cesar.setTipoSusc(7);
	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);

	Erika.setTipoSusc(7);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);
	System.out.println("");
  System.out.println(sp.notificar() + "\n");

	//Twitch
	System.out.println("**Cobros de Twitch**");
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Diego.setTipoSusc(8);
	tw.getServ().pago(Diego.getTipoSusc(), Diego, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);
	System.out.println("");
  System.out.println(tw.notificar() + "\n");

	//Youtube
	System.out.println("**Cobros de Youtube**");
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);

	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);

	Erika.setTipoSusc(10);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);
	System.out.println("");
	System.out.println("");
  System.out.println(yt.notificar() + "\n");


	//Día 3
	System.out.println("//Tercer dia de cobros//");
	//Netflix
	System.out.println("**Cobros de Netflix**");
	Alicia.setTipoSusc(3);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	Bob.setTipoSusc(3);
	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	ne.getServ().cancelaSuscripcion(Diego, ne);

	ne.getServ().cancelaSuscripcion(Erika, ne);
	System.out.println("");
  System.out.println(ne.notificar() + "\n");

	//Amazon
	System.out.println("**Cobros de Amazon**");
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);

	Erika.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Erika, am);
	System.out.println("");
  System.out.println(am.notificar() + "\n");

	//Spotify
	System.out.println("**Cobros de Spotify**");
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	Cesar.setTipoSusc(7);
	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);

	Diego.setTipoSusc(6);
	sp.getServ().pago(Diego.getTipoSusc(), Diego, sp);

	Erika.setTipoSusc(7);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);
	System.out.println("");
  System.out.println(sp.notificar() + "\n");

	//Twitch
	System.out.println("**Cobros de Twitch**");
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Diego.setTipoSusc(8);
	tw.getServ().pago(Diego.getTipoSusc(), Diego, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);
	System.out.println("");
  System.out.println(tw.notificar() + "\n");

	//Youtube
	System.out.println("**Cobros de Youtube**");
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);

	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);

	Erika.setTipoSusc(10);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);
	System.out.println("");
	System.out.println("");
  System.out.println(yt.notificar() + "\n");


	//Día 4
	System.out.println("//Cuarto día de cobros//");
	//Netflix
	System.out.println("**Cobros de Netflix**");
	Alicia.setTipoSusc(3);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	Bob.setTipoSusc(3);
	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	Diego.setTipoSusc(3);
	ne.getServ().pago(Diego.getTipoSusc(), Diego, ne);
	System.out.println("");
  System.out.println(ne.notificar() + "\n");

	//Amazon
	System.out.println("**Cobros de Amazon**");
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);

	Erika.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Erika, am);
	System.out.println("");
  System.out.println(am.notificar() + "\n");

	//Spotify
	System.out.println("**Cobros de Spotify**");
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	Cesar.setTipoSusc(7);
	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);

	Diego.setTipoSusc(6);
	sp.getServ().pago(Diego.getTipoSusc(), Diego, sp);

	Erika.setTipoSusc(7);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);
	System.out.println("");
  System.out.println(sp.notificar() + "\n");

	//Twitch
	System.out.println("**Cobros de Twitch**");
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Diego.setTipoSusc(8);
	tw.getServ().pago(Diego.getTipoSusc(), Diego, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);
	System.out.println("");
  System.out.println(tw.notificar() + "\n");

	//Youtube
	System.out.println("**Cobros de Youtube**");
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);

	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);

	Erika.setTipoSusc(10);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);
	System.out.println("");
	System.out.println("");
  System.out.println(yt.notificar() + "\n");


	//Día 5
	System.out.println("//Quinto día de cobros//");
	//Netflix
	System.out.println("**Cobros de Netflix**");
	Alicia.setTipoSusc(3);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	Bob.setTipoSusc(3);
	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	Diego.setTipoSusc(3);
	ne.getServ().pago(Diego.getTipoSusc(), Diego, ne);
	System.out.println("");
  System.out.println(ne.notificar() + "\n");


	//Amazon
	System.out.println("**Cobros de Amazon**");
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);

	Erika.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Erika, am);
	System.out.println("");
  System.out.println(am.notificar() + "\n");


	//Spotify
	System.out.println("**Cobros de Spotify**");
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	Cesar.setTipoSusc(7);
	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);

	Diego.setTipoSusc(6);
	sp.getServ().pago(Diego.getTipoSusc(), Diego, sp);

	Erika.setTipoSusc(7);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);
	System.out.println("");
  System.out.println(sp.notificar() + "\n");


	//Twitch
	System.out.println("**Cobros de Twitch**");
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Diego.setTipoSusc(8);
	tw.getServ().pago(Diego.getTipoSusc(), Diego, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);
	System.out.println("");
  System.out.println(tw.notificar() + "\n");

	//Youtube
	System.out.println("**Cobros de Youtube**");
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);

	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);

	Erika.setTipoSusc(10);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);
	System.out.println("");
	System.out.println("");
  System.out.println(yt.notificar() + "\n");

	System.out.println("//Saldos finales//");
	System.out.println("Alicia: " + Alicia.getPresupuesto());
	System.out.println("Bob: " + Bob.getPresupuesto());
	System.out.println("César: " + Cesar.getPresupuesto());
	System.out.println("Diego: " + Diego.getPresupuesto());
	System.out.println("Erika: " + Erika.getPresupuesto());
    }
}

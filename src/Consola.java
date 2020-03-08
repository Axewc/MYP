
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
	System.out.println("Primer dia de cobros");
	//Netflix
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
  Alicia.setTipoSusc(5);
  am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

  System.out.println(Alicia.update() + "\n");

  Alicia.setTipoSusc(3);
  ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
  Alicia.setTipoSusc(5);
  am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

  System.out.println(Alicia.update() + "\n");


  // System.out.println(Alicia.update() + "\n");
  //
  // System.out.println(Alicia.update() + "\n");

  // ne.notificar();
  //Día 2

  // System.out.println(Bob.update());
  // System.out.println(ne.getUsuarios());
  // System.out.println(ne.notificar());
  // System.out.println("Hoy Netflix les recomienda: " + ne.getRecomendacionDeHoy() + ".");
  }
}

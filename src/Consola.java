
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

	//Dia 1
	System.out.println("Primer dia de cobros");
	//Netflix
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	/*
	ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);
	
	ne.getServ().pago(Diego.getTipoSusc(), Diego, ne);
	
	ne.getServ().pago(Erika.getTipoSusc(), Erika, ne);
	*/
	//Amazon
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);
	/*
	Bob.setTipoSusc(5);
	am.getServ().pago(Bob.getTipoSusc(), Bob, am);

	Diego.setTipoSusc(5);
	am.getServ().pago(Diego.getTipoSusc(), Diego, am);
	*/
	//Spotify
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);
	/*
	Bob.setTipoSusc(7);
	sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);
	
	sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);	

	Erika.setTipoSusc(6);
	sp.getServ().pago(Erika.getTipoSusc(), Erika, sp);
	*/
	//Twitch
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);
	/*
	Bob.setTipoSusc(8);
	tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);

	Erika.setTipoSusc(8);
	tw.getServ().pago(Erika.getTipoSusc(), Erika, tw);
	*/
	//Youtube
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);
	System.out.println(Alicia.getPresupuesto());
	/*
	Bob.setTipoSusc(10);
	yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	Cesar.setTipoSusc(9);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);
	
	Erika.setTipoSusc(9);
	yt.getServ().pago(Erika.getTipoSusc(), Erika, yt);
	*/
	
	//Día 2
	System.out.println("Segundo dia de cobros");
	//Netflix
	Alicia.setTipoSusc(3);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);

	//Bob.setTipoSusc(3);
	//ne.getServ().pago(Bob.getTipoSusc(), Bob, ne);

	//Amazon
	Alicia.setTipoSusc(5);
	am.getServ().pago(Alicia.getTipoSusc(), Alicia, am);

	//Bob.setTipoSusc(5);
	//am.getServ().pago(Bob.getTipoSusc(), Bob, am);
	
	//Spotify
	Alicia.setTipoSusc(7);
	sp.getServ().pago(Alicia.getTipoSusc(), Alicia, sp);

	//Bob.setTipoSusc(7);
	//sp.getServ().pago(Bob.getTipoSusc(), Bob, sp);

	//Cesar.setTipoSusc(7);
	//sp.getServ().pago(Cesar.getTipoSusc(), Cesar, sp);
	
	//Twitch
	Alicia.setTipoSusc(8);
	tw.getServ().pago(Alicia.getTipoSusc(), Alicia, tw);

	//Bob.setTipoSusc(8);
	//tw.getServ().pago(Bob.getTipoSusc(), Bob, tw);
	
	//Youtube
	Alicia.setTipoSusc(10);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, yt);
	System.out.println(Alicia.getPresupuesto());
	
	//Bob.setTipoSusc(10);
	//yt.getServ().pago(Bob.getTipoSusc(), Bob, yt);

	//Cesar.setTipoSusc(9);
	//yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt); 
  }
}

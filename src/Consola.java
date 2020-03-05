
import java.util.LinkedList;

public class Consola {
    // Servicio netflix = new Servicio();
    static Servicio ne = new Servicio();
    static Servicio yt = new Servicio();
    
    public static void main(String[] args) {
	Persona bob = new Persona(1, 50.00, "Bob");
	Persona Alicia = new Persona(1, 500.00, "Alicia");
	Persona Cesar = new Persona(10, 40.00, "Cesar");
	//Bob
	ne.netflix();
	yt.youtube();
	
	ne.getServ().pago(bob.getTipoSusc(), bob, ne);
	System.out.println(bob.getPresupuesto());
	ne.getServ().pago(bob.getTipoSusc(), bob, ne);
	System.out.println(bob.getPresupuesto());
	ne.getServ().cancelaSuscripcion(bob, ne);
	System.out.println("");

	//Alicia
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	System.out.println(Alicia.getPresupuesto());
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	System.out.println(Alicia.getPresupuesto());
	ne.getServ().cancelaSuscripcion(Alicia, ne);
	ne.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	System.out.println(Alicia.getPresupuesto());	
	Alicia.setTipoSusc(2);
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	System.out.println(Alicia.getPresupuesto());
	yt.getServ().pago(Alicia.getTipoSusc(), Alicia, ne);
	System.out.println(Alicia.getPresupuesto());
	System.out.println("");
	
	//Cesar
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);
        yt.getServ().cancelaSuscripcion(Cesar, yt);
	Cesar.setTipoSusc(11);
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);
	System.out.println(Cesar.getPresupuesto());
	
	yt.getServ().pago(Cesar.getTipoSusc(), Cesar, yt);
	System.out.println(Cesar.getPresupuesto());
	//primer dia de netflix
	
	/*ne.getServ().pago(Cesar.getTipoSusc(), Cesar, ne);
	System.out.println(Cesar.getPresupuesto());
	//segundo dia de netflix
	ne.getServ().pago(Cesar.getTipoSusc(), Cesar, ne);
	System.out.println(Cesar.getPresupuesto());
	//problema al cobrar*/ 
  }
}

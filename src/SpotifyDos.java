
public class SpotifyDos implements CobrosSpotify {
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " + per.getNombre()+ "\n Saldo requerido: $4");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 4;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Spotify, " + per.getNombre()  + " estas en el nivel Premium."+ "\n(Costo: $4)");
	}
    }
}

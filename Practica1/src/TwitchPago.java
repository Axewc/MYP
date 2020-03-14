
public class TwitchPago implements CobroTwitch {

    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " +per.getNombre()+ "\n Saldo requerido: $6");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    if(!per.esPrime()){
		prepresupuesto -= 6;
		per.setPresupuesto(prepresupuesto);
		System.out.println("Bienvenido a Twitch, " + per.getNombre()  + "\n(Costo: $6)");
	    } else {	    
		prepresupuesto -= 3;
		per.setPresupuesto(prepresupuesto);
		System.out.println("Bienvenido a Twitch, " + per.getNombre()  + "\n(Costo: $3) por pertenecer a Amazon prime.");
	    }
	}
    }
}

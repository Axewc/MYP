

public class NetflixTres implements CobroNetflix {
    
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " +per.getNombre() +  "\n Saldo requerido: $15");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 15;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Premium" + "\n(Costo: $15)");
	}
    }
}

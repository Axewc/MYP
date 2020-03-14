

public class NetflixUno implements CobroNetflix {
    
    
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " + per.getNombre() + "\n Saldo requerido: $7");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 7;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Básico" + "\n(Costo: $7)");
	}
    }    
}

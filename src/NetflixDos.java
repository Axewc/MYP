

public class NetflixDos implements CobroNetflix {
    
    
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " + per.getNombre()+ "\n Saldo requerido: $10");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 10;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Intermedio" + "\n(Costo: $10)");
	}
    }
}

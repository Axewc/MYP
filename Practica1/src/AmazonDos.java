
public class AmazonDos implements CobrosAmazon {
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " + per.getNombre() + "\n Saldo requerido: $13");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 13;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Amazon, " + per.getNombre() +" estas en el nivel Prime." + "\n(Costo: $13)");
	}
    }
}

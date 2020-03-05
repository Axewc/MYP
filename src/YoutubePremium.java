

public class YoutubePremium implements CobroYoutube {

    @Override public void pago (Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente." + "\n Saldo requerido: $6");
	Double prepresupuesto = per.getPresupuesto();
	prepresupuesto -= 6;
	per.setPresupuesto(prepresupuesto);
	System.out.println("Bienvenido a Youtube, " + per.getNombre() +" estás en el nivel Premium" + "\n(Costo: $6)");
    }
}

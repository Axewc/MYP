
public class YoutubeNormal implements CobroYoutube {

    
    @Override public void pago(Persona per, Servicio s) {
	if(!s.getServ().verificaPresupuesto(per))
	    System.out.println("Saldo insuficiente " + per.getNombre()+ "\n Saldo requerido: $0");
	else {
	    Double prepresupuesto = per.getPresupuesto();
	    prepresupuesto -= 0;
	    per.setPresupuesto(prepresupuesto);
	    System.out.println("Bienvenido a Youtube, " + per.getNombre() +" estás en el nivel Regular" + "\n(Costo: $0)");
	}
    }
}

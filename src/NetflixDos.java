

public class NetflixDos implements CobroNetflix {


  @Override public void pago(Persona per, Servicio s) {
    if(!s.getServ().verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
      // s.pago()
    // per.presupuesto -= 10;
    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Intermedio" + "\n(Costo: $10)");
  }
}

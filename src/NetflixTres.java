

public abstract class NetflixTres implements Transaccion {

  @Override public void pago(Persona per, Servicio s) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
    // per.presupuesto -= 15;
    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Premium" + "\n(Costo: $15)");
  }
}

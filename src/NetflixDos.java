

public abstract class NetflixDos implements Transaccion {


  @Override public void pago(Persona per) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
    // per.presupuesto -= 10;
    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Intermedio" + "\n(Costo: $10)");
  }
}

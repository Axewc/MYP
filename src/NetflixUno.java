

public abstract class NetflixUno implements Transaccion {

  @Override public void pago(Persona per) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $7");
    // per.presupuesto -= 7;
    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Básico" + "\n(Costo: $7)");
  }
}

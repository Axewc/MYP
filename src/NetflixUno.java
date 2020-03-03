

public class NetflixUno implements Transaccion {


  @Override public void pago(Persona per, Servicio s) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $7");
    // per.presupuesto -= 7;
    System.out.println("Bienvenido a Netflix, " + per.getNombre() +" estás en el nivel Básico" + "\n(Costo: $7)");
  }

  public int suscripcion(int d, Persona p) {
    return -1;
  }

  public boolean verificaPresupuesto(Persona per){
    return true;
  }

}

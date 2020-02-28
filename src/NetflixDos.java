package src;

import src.*;

public class NetflixDos {

  @Override public void pago(Persona per) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
    // per.presupuesto -= 10;
    System.out.println("Bienvenido a Netflix, " + per.nombre +" estás en el nivel Intermedio" + "\n(Costo: $10)");
  }
}

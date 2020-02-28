package src;

import src.*;

public class NetflixTres {

  @Override public void pago(Persona per) {
    if(!verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
    // per.presupuesto -= 15;
    System.out.println("Bienvenido a Netflix, " + per.nombre +" estás en el nivel Premium" + "\n(Costo: $15)");
  }
}

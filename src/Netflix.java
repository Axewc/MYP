
public class Netflix implements Transacciones {

  boolean primeraVez = True;

  @Override public void pago(Persona pe) {
    if(primeraVez) {
      System.out.println("Bienvenido a la prueba gratis de Netflix");
      this.primeraVez = false;

    }
      per.presupuesto -= suscripcion(tipoSusc, pe);
  }

  @Override public int suscripcion(int dispositivos, Persona per) {
    switch (dispositivos) {
      case 1:
          if(!verificaPresupuesto(per))
            System.out.println("Saldo insuficiente." + "\n Saldo requerido: $7");
          // per.presupuesto -= 7;
          System.out.println("Bienvenido a Netflix, " + per.nombre +" estás en el nivel Básico" + "\n(Costo: $7)");
          return 7;
        break;
      case 2:
          if(!verificaPresupuesto(per))
            System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
          // per.presupuesto -= 10;
          System.out.println("Bienvenido a Netflix, " + per.nombre +" estás en el nivel Intermedio" + "\n(Costo: $10)");
          return 10;
        break;
      case 3:
          if(!verificaPresupuesto(per))
            System.out.println("Saldo insuficiente." + "\n Saldo requerido: $10");
          // per.presupuesto -= 15;
          System.out.println("Bienvenido a Netflix, " + per.nombre +" estás en el nivel Premium" + "\n(Costo: $15)");
          return 15;
        break;
      default:
        System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
        break;
    }
    this.primeraVez = false;
  }

  @Override public boolean verificaPresupuesto(Persona per) {
    if(!per.presupuesto >= 7) {
      return false;
      return true;
    }
    if(!per.presupuesto >= 10) {
      return false;
      return true;
    }
     if(!per.presupuesto >= 15) {
       return false;
       return true;
     }
  }

}

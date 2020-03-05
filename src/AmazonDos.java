
public class AmazonDos implements CobrosAmazon {
  @Override public void pago(Persona per, Servicio s) {
    if(!s.getServ().verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $13");
    Double prepresupuesto = per.getPresupuesto();
    prepresupuesto -= 13;
    per.setPresupuesto(prepresupuesto);
  }
}

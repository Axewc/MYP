
public class AmazonUno implements CobrosAmazon {
  @Override public void pago(Persona per, Servicio s) {
    if(!s.getServ().verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $7");
    Double prepresupuesto = per.getPresupuesto();
    prepresupuesto -= 7;
    per.setPresupuesto(prepresupuesto);
  }
}

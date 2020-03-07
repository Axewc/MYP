
public class SpotifyDos implements CobrosSpotify {
  @Override public void pago(Persona per, Servicio s) {
    if(!s.getServ().verificaPresupuesto(per))
      System.out.println("Saldo insuficiente." + "\n Saldo requerido: $4");
    Double prepresupuesto = per.getPresupuesto();
    prepresupuesto -= 4;
    per.setPresupuesto(prepresupuesto);
}
}

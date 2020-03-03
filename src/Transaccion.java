

public interface Transaccion {

  public void pago(Persona p, Servicio s);

  public int suscripcion(int d, Persona p);

  public boolean verificaPresupuesto(Persona per);
}

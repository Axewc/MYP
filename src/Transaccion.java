

public interface Transaccion {

  // public void pago(Persona p, Servicio s);
  public void cancelaSuscripcion(Persona p, Servicio s);

  public void pago(int d, Persona p, Servicio s);

  public boolean verificaPresupuesto(Persona per);

  public void llenaRecomendacion();
  
}

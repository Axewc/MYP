import java.util.LinkedList;

public class Amazon implements Transaccion {

  LinkedList<String> recomendaciones = new LinkedList<String>();

  public Amazon() {}

    @Override public void pago(int ts, Persona pe, Servicio s) {
      if(!s.getUsuarios().contains(pe)) {
        s.getUsuarios().add(pe);
        System.out.println("Bienvenido a la prueba gratis de Amazon "+ pe.getNombre() + ".");
        pe.getListaDeServicios().add(s);

      } else if(s.getExUsuarios().contains(pe)) {
          System.out.println("Bienvenido de vuelta a Amazon "+ pe.getNombre() + ".");
          switch (ts) {
            case 4:
              CobrosAmazon am1 = new AmazonUno();
              am1.pago(pe, s);
              break;
            case 5:
              CobrosAmazon am2 = new AmazonDos();
              am2.pago(pe, s);

              break;
            default:
              System.out.println("Plan no disponible, pruebe con '4', o '5'.");
              break;
          }
          s.getExUsuarios().remove(pe);
          s.getUsuarios().add(pe);
          pe.getListaDeServicios().add(s);

      } else {

        switch (ts) {
          case 4:
            CobrosAmazon am1 = new AmazonUno();
            am1.pago(pe, s);
            break;
          case 5:
            CobrosAmazon am2 = new AmazonDos();
            am2.pago(pe, s);
            break;
          default:
            System.out.println("Plan no disponible, pruebe con '4', o '5'.");
            break;
        }
        s.getUsuarios().add(pe);
        pe.getListaDeServicios().add(s);
      }

    }

    @Override public boolean verificaPresupuesto(Persona per) {
      if(!(per.getPresupuesto() >= 7))
        return false;
      if(!(per.getPresupuesto() >= 10))
        return false;
        return true;
    }

    @Override public void cancelaSuscripcion(Persona per, Servicio s) {
      LinkedList<Servicio> lista = new LinkedList<>();
      lista = per.getListaDeServicios();
      if(s.getServ() instanceof Amazon) {
        lista.remove(s);
        System.out.println("Lamentamos que tengas que irte "+ per.getNombre() +" :(.");
        s.getExUsuarios().add(per);
        s.getUsuarios().remove(per);
        per.setListaDeServicios(lista);
      } else {
        System.out.println("Operacion invalida");
      }
    }
    @Override public void llenaRecomendacion(Servicio s) {
      s.getRecomendacion().add("Iron Man 3");
      s.getRecomendacion().add("John Wick");
      s.getRecomendacion().add("The Boys");
      s.getRecomendacion().add("LOL");
    }
}

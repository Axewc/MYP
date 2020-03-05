import java.util.LinkedList;

public class Amazon implements Transaccion {

  public Amazon() {}

    @Override public void pago(int ts, Persona pe, Servicio s) {
      if(!s.getUsuarios().contains(pe)) {
        s.getUsuarios().add(pe);
        System.out.println("Bienvenido a la prueba gratis de Amazon.");
        pe.getListaDeServicios().add(s);

      } else if(s.getExUsuarios().contains(pe)) {
          System.out.println("Bienvenido de vuelta a Amazon.");
          switch (ts) {
            case 3:
              CobrosAmazon ne1 = new AmazonUno();
              ne1.pago(pe, s);
              break;
            case 4:
              CobrosAmazon ne2 = new AmazonDos();
              ne2.pago(pe, s);

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
          case 1:
            CobrosAmazon ne1 = new AmazonUno();
            ne1.pago(pe, s);
            break;
          case 2:
            CobrosAmazon ne2 = new AmazonDos();
            ne2.pago(pe, s);
            break;
          default:
            System.out.println("Plan no disponible, pruebe con '1','2'o '3'.");
            break;
        }
        s.getUsuarios().add(pe);
        pe.getListaDeServicios().add(s);
      }

    }

    @Override public boolean verificaPresupuesto(Persona per) {
      if(!(per.getPresupuesto() >= 7))
        return false;
        // return true;
      if(!(per.getPresupuesto() >= 10))
        return false;
        return true;
    }

    @Override public void cancelaSuscripcion(Persona per, Servicio s) {
      LinkedList<Servicio> lista = new LinkedList<>();
      lista = per.getListaDeServicios();
      if(s.getServ() instanceof Amazon) {
        lista.remove(s);
        System.out.println("Lamentamos que tengas que irte :(");
        s.getExUsuarios().add(per);
        s.getUsuarios().remove(per);
        per.setListaDeServicios(lista);
      } else {
        System.out.println("Operacion invalida");
      }
    }

}

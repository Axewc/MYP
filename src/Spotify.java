
import java.util.LinkedList;

public class Spotify implements Transaccion {

  public Spotify() {}

    @Override public void pago(int ts, Persona pe, Servicio s) {
      if(!s.getUsuarios().contains(pe)) {
        s.getUsuarios().add(pe);
        System.out.println("Bienvenido a Spotify.");
        pe.getListaDeServicios().add(s);

      } else if(s.getExUsuarios().contains(pe)) {
          System.out.println("Bienvenido de vuelta a Spotify.");
          switch (ts) {
            case 6:
              CobrosSpotify ne1 = new SpotifyUno();
              ne1.pago(pe, s);
              break;
            case 7:
              CobrosSpotify ne2 = new SpotifyDos();
              ne2.pago(pe, s);
              break;
            default:
              System.out.println("Plan no disponible, pruebe con '6', o '7'.");
              break;
          }
          s.getExUsuarios().remove(pe);
          s.getUsuarios().add(pe);
          pe.getListaDeServicios().add(s);

      } else {

        switch (ts) {
          case 6:
            CobrosSpotify ne1 = new SpotifyDos();
            ne1.pago(pe, s);
            break;
          case 7:
            CobrosSpotify ne2 = new SpotifyDos();
            ne2.pago(pe, s);
            break;
          default:
            System.out.println("Plan no disponible, pruebe con '6', o '7'.");
            break;
        }
        s.getUsuarios().add(pe);
        pe.getListaDeServicios().add(s);
      }

    }

    @Override public boolean verificaPresupuesto(Persona per) {
      if(!(per.getPresupuesto() >= 4))
        return false;
        return true;
    }

    @Override public void cancelaSuscripcion(Persona per, Servicio s) {
      LinkedList<Servicio> lista = new LinkedList<>();
      lista = per.getListaDeServicios();
      if(s.getServ() instanceof Spotify) {
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
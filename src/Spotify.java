
import java.util.LinkedList;

public class Spotify implements Transaccion {

  LinkedList<String> recomendaciones = new LinkedList<String>();

  public Spotify() {}

    @Override public void pago(int ts, Persona pe, Servicio s) {
      if(!s.getUsuarios().contains(pe)) {
        s.getUsuarios().add(pe);
        System.out.println("Bienvenido a Spotify "+ pe.getNombre() +".");
        pe.getListaDeServicios().add(s);

      } else if(s.getExUsuarios().contains(pe)) {
          System.out.println("Bienvenido de vuelta a Spotify "+ pe.getNombre() + ".");
          switch (ts) {
            case 6:
              CobrosSpotify sp1 = new SpotifyUno();
              sp1.pago(pe, s);
              break;
            case 7:
              CobrosSpotify sp2 = new SpotifyDos();
              sp2.pago(pe, s);
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
            CobrosSpotify sp1 = new SpotifyDos();
            sp1.pago(pe, s);
            break;
          case 7:
            CobrosSpotify sp2 = new SpotifyDos();
            sp2.pago(pe, s);
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
        System.out.println("Lamentamos que tengas que irte "+ per.getNombre() +" :(.");
        s.getExUsuarios().add(per);
        s.getUsuarios().remove(per);
        per.setListaDeServicios(lista);
      } else {
        System.out.println("Operacion invalida");
      }
    }
    
    @Override public void llenaRecomendacion() {
      recomendaciones.add("La Cumbia Del Coronavirus");
      recomendaciones.add("Tusa");
      recomendaciones.add("The box");
      recomendaciones.add("Yummy");
    }
}

import java.util.Scanner;

public class Servicio {
  private Servicio serv;


  public void netflix() {
    serv = new Netflix();
  }

  public void amazon() {
    serv = new Amazon();
  }

  public void twitch() {
    serv = new Twitch();
  }

  public void spotify() {
    serv = new Spotify()
  }

  public void youtube() {
    serv = new Youtube;
  }

  private void validaPago(Persona persona) {
    persona.pagar(serv);
  }

  public static void main(String[] args) {
    System.out.println("XD.");
  }
}

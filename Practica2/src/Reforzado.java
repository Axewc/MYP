
public class Reforzado extends ProcesoConstruccion {
  @Override int construccionEsqueleto() {
    System.out.println("Pilares y techos reforzados, son una gran idea"
                      + "de cara al futuro :D");
    return 1000000;
  }

  @Override void aislamientoDeLaCasa() {
    System.out.println("Muros reforzados, parece que quieres algo de privacidad :s");
    return 3000000;
  }
}
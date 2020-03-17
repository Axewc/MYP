
public class Concreto extends ProcesoConstruccion {
  @Override int construccionEsqueleto() {
    System.out.println("Pilares y techos de Concreto, son una gran idea "
                      + "una opción bastante clásica :D");
    return 500000;
  }

  @Override int aislamientoDeLaCasa() {
    System.out.println("Muros de concreto, un poco de pintura o "
                      + "papel tapíz lo mejorarán un montón :D");
    return 2000000;
  }
}

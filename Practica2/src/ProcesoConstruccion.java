import java.util.Scanner;
import java.lang.Integer;

/**
* Clase abstracta que contiene lo necesario para generar un template de las casas
* de la empresa Mi Hogarcito.
* @param costoFinal será la cuenta final que el operador debería pagar por su casa.
                    se inicializa en 1000000.
*/
public abstract class ProcesoConstruccion {

  /*Varible que lleva la cuenta de lo invertido en Mi Hogarcito.*/
  public int costoFinal = 1000000;


  /*Método abastracto para construir esqueleto de disintos materiales.*/
  abstract int construccionEsqueleto();
  /*Método abastracto para el aislamiento de la casa de disintos materiales.*/
  abstract int aislamientoDeLaCasa();

  /*
  * Método template para construir Hogarcitos.
  * En el paso 3 y 5 queremos que cambie según el operador.
  */
  public final void construccion() {
      preparacionDelTerreno();
      colocacionDeCimientos();
      eligeEsqueleto();
      instalacionElectricaYPlomeria();
      eligeAislamiento();
      acabados();
      pagoTotal(construccionEsqueleto(), aislamientoDeLaCasa());
  }

  /**
  * Método que ayudará a elegir el material de el esqueleto para usar en el
  * método template.
  * Para no perder información del usuario esté método no termina
  */
  void eligeEsqueleto() {
    menuEsqueleto();
    int material = -1;
    Scanner sc = new Scanner(System.in);
    material = sc.nextInt();

    ProcesoConstruccion pc;

    try {
    switch (material) {
      case 1:
        pc = new Concreto();
        pc.construccionEsqueleto();
        break;
      case 2:
        pc = new Reforzado();
        pc.construccionEsqueleto();
        break;
      default:
        System.out.println("Material de esqueleto no disponible :s.");
        menuEsqueleto();
    }
    } catch(Exception e) {
        System.out.println("Error en la entrada estándar.\n");
    }
  }

  /**
  * Método que ayudará a elegir el material de el aislamiento para usar en el
  * método template.
  * Para no perder información del usuario esté método no termina
  */
  void eligeAislamiento() {
    menuAislamiento();
    int material = -1;
    Scanner sc = new Scanner(System.in);
    material = sc.nextInt();

    ProcesoConstruccion pc;

    try {
    switch (material) {
      case 1:
        pc = new Concreto();
        pc.aislamientoDeLaCasa();
        break;
      case 2:
        pc = new Reforzado();
        pc.aislamientoDeLaCasa();
        break;
      case 3:
        pc = new Vidrio();
        pc.aislamientoDeLaCasa();
        break;
      case 4:
        pc = new Madera();
        pc.aislamientoDeLaCasa();
        break;
      default:
        System.out.println("Material de aislamiento no disponible :s.");
        eligeAislamiento();
    }
    } catch(Exception e) {
        System.out.println("Error en la entrada estándar.\n");
    }
  }

  /**
  * Menú de los materiales disponibles para el aislamiento.
  */
  public static void menuAislamiento() {
    System.out.println("Selecciona el material de aislamiento que deseas :D.");
    System.out.println("1 - Concreto");
    System.out.println("2 - Reforzado");
    System.out.println("3 - Vidrio");
    System.out.println("4 - Madera");
  }

  /**
  * Menú de los materiales disponibles para el esqueleto.
  */
  public static void menuEsqueleto() {
    System.out.println("Selecciona el material de esqueleto que deseas :D.");
    System.out.println("1 - Concreto");
    System.out.println("2 - Reforzado");
  }
  /*
  * Los métodos siguientes únicamente dan pauta para la planilla de construccion.
  * Primero.
  */
  void preparacionDelTerreno() {
    System.out.println("Hola, estoy preparando el terreno para TU Hogarcito :D.");
  }
  /*Segundo.*/
  void colocacionDeCimientos() {
    System.out.println("Estoy por colocar los cimientos para TU Hogarcito :D.");
  }

  /*Cuarto.*/
  void instalacionElectricaYPlomeria() {
    System.out.println("It's a me Mario, estamos encargándonos de la plomeria. "
    + "Cuidado con los cables :s, estoy trabajando en tu instalación eléctrica");
  }

  /*Sexto.*/
  void acabados() {
    System.out.println("Ya casi acabamos, solo restan tus acabados :D");
  }

  /*Hará la suma de lo que se haya invertido extra en el hogarcito*/
  void pagoTotal(int esqueleto, int aislamiento) {
    this.costoFinal += esqueleto + aislamiento;
    System.out.println("El total por su hogarcito es: $" + Integer.toString(this.costoFinal) + ":D");
  }

}

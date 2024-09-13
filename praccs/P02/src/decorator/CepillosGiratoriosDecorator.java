package decorator;

public class CepillosGiratoriosDecorator extends RoboCleanDecorator {
    public CepillosGiratoriosDecorator(RoboCleanComponent decorado) {
        super(decorado);
    }

    @Override
    public void limpiar() {
        super.limpiar();
        agregarCepillosGiratorios();
    }

    private void agregarCepillosGiratorios() {
        System.out.println("Usando cepillos giratorios para una limpieza profunda.");
    }
}
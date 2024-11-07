package decorator;

public class FiltroHEPADecorator extends RoboCleanDecorator {
    public FiltroHEPADecorator(RoboCleanComponent decorado) {
        super(decorado);
    }

    @Override
    public void limpiar() {
        super.limpiar();
        agregarFiltroHEPA();
    }

    private void agregarFiltroHEPA() {
        System.out.println("Usando filtro HEPA para capturar partículas finas.");
    }
}
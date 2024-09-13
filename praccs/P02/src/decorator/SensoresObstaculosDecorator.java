package decorator;

public class SensoresObstaculosDecorator extends RoboCleanDecorator {
    public SensoresObstaculosDecorator(RoboCleanComponent decorado) {
        super(decorado);
    }

    @Override
    public void limpiar() {
        super.limpiar();
        agregarSensoresObstaculos();
    }

    private void agregarSensoresObstaculos() {
        System.out.println("Usando sensores de obstáculos avanzados para evitar colisiones.");
    }
}
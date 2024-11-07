package decorator;

public abstract class RoboCleanDecorator implements RoboCleanComponent {
    protected RoboCleanComponent decorado;

    public RoboCleanDecorator(RoboCleanComponent decorado) {
        this.decorado = decorado;
    }

    @Override
    public void limpiar() {
        decorado.limpiar();
    }
}
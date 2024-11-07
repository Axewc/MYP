public class AtaqueTierra implements Habilidad {
    private final int potencia = 15;
    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(15);
        System.out.println("Ataque de tierra causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    @Override
    public String getNombre() {
        return "Ataque de Tierra";
    }

    @Override
    public int getPotencia() {
        return potencia;
    }
}

public class AtaqueExplosivo implements Habilidad {
    private final int potencia = 20;

    @Override
    public void ejecutar(Personaje enemigo) {
        enemigo.defender(potencia);
        System.out.println("Ataque explosivo causa " + potencia + " de daño a " + enemigo.getNombre());
    }

    @Override
    public String getNombre() {
        return "Ataque Explosivo";
    }

    @Override
    public int getPotencia() {
        return potencia;
    }
}

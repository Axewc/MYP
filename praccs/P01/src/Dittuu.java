public class Dittuu extends Personaje {
    public Dittuu() {
        super("Dittuu", 100, new AtaqueHielo(), new DefensaBarrera());
    }

    @Override
    public void absorberPoder(Personaje personaje) {
        if (personaje instanceof Rayquaza) {
            agregarHabilidad(new AtaqueViento());
        } else if (personaje instanceof Garchomp) {
            agregarHabilidad(new AtaqueTierra());
        } else if (personaje instanceof Hydreigon) {
            agregarHabilidad(new AtaqueOscuro());
        }
    }
}

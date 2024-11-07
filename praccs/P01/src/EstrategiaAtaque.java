/**
 * Interfaz que define el método atacar, que será implementado por las clases que
 * representen las distintas estrategias de ataque.
 */
public interface EstrategiaAtaque {
    void atacar(Personaje atacante, Personaje objetivo);
}
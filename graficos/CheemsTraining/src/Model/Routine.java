package Model;

import Observer.*;
import Strategy.*;

/**
 * Clase abstracta que representa una rutina de entrenamiento.
 */
public abstract class Routine {
    public String athleteName;

    /**
     * Constructor de la clase.
     * @param athleteName
     */
    public Routine(String athleteName) {
        this.athleteName = athleteName;
    }

    /**
     * Método que ejecuta el template de la rutina de entrenamiento.
     *
     */
    public final void executeRoutine() {
        warmUp();
        mainExercise();
        coolDown();
    }

    /**
     * Método que se ejecuta cuando el atleta realiza el calentamiento.
     */
    protected abstract void warmUp();

    /**
     * Método que se ejecuta cuando el atleta realiza el ejercicio principal.
     */
    protected abstract void mainExercise();

    /**
     * Método que se ejecuta cuando el atleta realiza el enfriamiento.
     */
    protected abstract void coolDown();

    /**
     * Método que obtiene el nombre del atleta.
     * @return Nombre del atleta.
     */
    public String getAthleteName() {
        return athleteName;
    }
}
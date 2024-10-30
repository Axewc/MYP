package Model;

import Observer.*;
import Strategy.*;

/**
 * Clase que representa una rutina de entrenamiento de fuerza.
 */
public class StrengthRoutine extends Routine {
    public StrengthRoutine(String athleteName) {
        super(athleteName);
    }

    /**
     * Método que se ejecuta cuando el atleta realiza el calentamiento.
     */
    @Override
    protected void warmUp() {
        System.out.println(athleteName + " realiza calentamiento de fuerza.");
    }

    /**
     * Método que se ejecuta cuando el atleta realiza el ejercicio principal.
     */
    @Override
    protected void mainExercise() {
        System.out.println(athleteName + " realiza levantamiento de pesas.");
    }

    /**
     * Método que se ejecuta cuando el atleta realiza el enfriamiento.
     */
    @Override
    protected void coolDown() {
        System.out.println(athleteName + " realiza estiramientos finales.");
    }
}

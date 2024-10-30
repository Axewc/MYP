package Controller;

import Model.Routine;
import Strategy.*;
import Observer.*;


/**
 * Clase que representa un controlador de entrenamientos.
 */
public class TrainingController {
    private TrainingStrategy trainingStrategy;
    private Routine routine;
    private GoalNotifier goalNotifier;

    /**
     * Constructor de la clase TrainingController.
     * 
     * @param goalNotifier Notificador de objetivos.
     */
    public TrainingController(GoalNotifier goalNotifier) {
        this.goalNotifier = goalNotifier;
    }

    /**
     * Método que establece la estrategia de entrenamiento.
     * 
     * @param strategy Estrategia de entrenamiento.
     */
    public void setTrainingStrategy(TrainingStrategy strategy) {
        this.trainingStrategy = strategy;
    }

    /**
     * Método que establece la rutina de entrenamiento.
     * 
     * @param routine Rutina de entrenamiento.
     */
    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    /**
     * Método que inicia el entrenamiento.
     */
    public void startTraining() {
        if (trainingStrategy != null && routine != null) {
            trainingStrategy.applyRoutine(routine);
            goalNotifier.notifyObservers("Objetivo alcanzado por " + routine.getAthleteName());
        }
    }
    
}

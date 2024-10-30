package Strategy;

import Model.Routine;
/**
 * Interfaz que representa una estrategia de entrenamiento.
 */
public interface TrainingStrategy {
    void applyRoutine(Routine routine);
}
package Strategy;

import Model.Routine;

/**
 * Clase que implementa la interfaz TrainingStrategy y define el comportamiento de la estrategia de entrenamiento de fuerza.
 */
public class StrengthTraining implements TrainingStrategy {
    @Override
    public void applyRoutine(Routine routine) {
        System.out.println("Aplicando rutina de fuerza para " + routine.athleteName);
        routine.executeRoutine();
    }
}
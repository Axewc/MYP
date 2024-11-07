package Strategy;

import Model.Routine;

/**
 * Clase que implementa la interfaz TrainingStrategy y define el comportamiento de la estrategia de entrenamiento de velocidad.
 */
public class SpeedTraining implements TrainingStrategy {
    @Override
    public void applyRoutine(Routine routine) {
        System.out.println("Aplicando rutina de velocidad para " + routine.athleteName);
        routine.executeRoutine();
    }
}
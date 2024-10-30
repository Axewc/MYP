package Strategy;

import Model.Routine;

/**
 * Clase que implementa la interfaz TrainingStrategy y define el comportamiento de la estrategia de entrenamiento de resistencia.
 */
public class EnduranceTraining implements TrainingStrategy {
    @Override
    public void applyRoutine(Routine routine) {
        System.out.println("Aplicando rutina de resistencia para " + routine.athleteName);
        routine.executeRoutine();
    }
}
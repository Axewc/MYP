package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Clase que representa un entrenador que observa los objetivos de un atleta.
 * Implementa la interfaz GoalObserver.
 * 
 */
public class Coach implements GoalObserver {
    private String name;

    /**
     * Constructor de la clase Coach.
     * 
     * @param name Nombre del entrenador.
     */
    public Coach(String name) {
        this.name = name;
    }

    /**
     * Método que se ejecuta cuando el GoalNotifier notifica a los observadores.
     * 
     * @param message Mensaje que se envía a los observadores.
     */
    @Override
    public void update(String message) {
        System.out.println("Entrenador " + name + " notificado: " + message);
    }
}
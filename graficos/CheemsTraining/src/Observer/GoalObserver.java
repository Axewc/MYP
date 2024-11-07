package Observer;

import java.util.ArrayList;
import java.util.List;
import Observer.GoalObserver;

/**
 * Clase que representa un notificador de objetivos.
 * 
 */
public interface GoalObserver {
    void update(String message);
}
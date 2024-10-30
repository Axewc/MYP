package Observer;

import java.util.ArrayList;
import java.util.List;
import Observer.GoalNotifier;


/**
 * Clase que representa un notificador de objetivos.
 * 
 */
public class GoalNotifier {
    private List<GoalObserver> observers = new ArrayList<>();

    /**
     * Método que añade un observador a la lista de observadores.
     * 
     * @param observer Observador a añadir.
     */
    public void addObserver(GoalObserver observer) {
        observers.add(observer);
    }

    /**
     * Método que elimina un observador de la lista de observadores.
     * 
     * @param observer Observador a eliminar.
     */
    public void notifyObservers(String message) {
        for (GoalObserver observer : observers) {
            observer.update(message);
        }
    }
}
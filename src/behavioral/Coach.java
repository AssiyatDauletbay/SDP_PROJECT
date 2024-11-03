package behavioral;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}

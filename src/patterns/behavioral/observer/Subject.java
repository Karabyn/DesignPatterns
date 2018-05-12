package patterns.behavioral.observer;

/**
 * Created by Petro Karabyn on 30-Sep-17.
 */

public interface Subject {

    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObserver();
}

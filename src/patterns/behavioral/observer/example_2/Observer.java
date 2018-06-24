package patterns.behavioral.observer.example_2;

public abstract class Observer {

    protected Subject subject;
    abstract void update();
}

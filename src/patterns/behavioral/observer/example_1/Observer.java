package patterns.behavioral.observer.example_1;

/**
 * The observer pattern is a software design pattern in which an object,
 * called the subject, maintains a list of its dependents, called observers,
 * and notifies them automatically of any state changes, usually by calling one of their methods.
 */


public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}

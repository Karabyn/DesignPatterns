package patterns.behavioral.observer;

import java.util.ArrayList;

/**
 * Created by petro on 30-Sep-17.
 */

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
        ibmPrice = 0;
        aaplPrice = 0;
        googPrice = 0;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double price) {
        ibmPrice = price;
        notifyObserver();
    }

    public void setAAPLPrice(double price) {
        aaplPrice = price;
        notifyObserver();
    }

    public void setGOOGPrice(double price) {
        googPrice = price;
        notifyObserver();
    }
}

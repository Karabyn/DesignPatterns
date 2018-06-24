package patterns.behavioral.observer.example_1;

public class ObserverDemo {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
        Observer observer1 = new StockObserver(stockGrabber);
        Observer observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(73);
        stockGrabber.setAAPLPrice(213);
        stockGrabber.setGOOGPrice(121);
    }
}

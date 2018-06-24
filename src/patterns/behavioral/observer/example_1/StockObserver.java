package patterns.behavioral.observer.example_1;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int observerIDTracker = 0;
    private int observerID;

    public StockObserver(Subject stockGrabber){
        // Assign an observer ID and increment the static counter
        this.observerID = ++observerIDTracker;
        // Message notifies user of new observer
        System.out.println("New Observer " + this.observerID);
        // Add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
    }

}

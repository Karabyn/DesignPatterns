package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */

public class AudiFactory implements Factory {

    @Override
    public Headlight makeHeadlight() {
        System.out.println("Making Audi headlight");
        return new AudiHeadlight();
    }

    @Override
    public Tire makeTire() {
        System.out.println("Making Audi tire");
        return new AudiTire();
    }
}

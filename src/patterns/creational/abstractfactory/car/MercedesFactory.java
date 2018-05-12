package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */
public class MercedesFactory implements Factory {
    @Override
    public Headlight makeHeadlight() {
        System.out.println("Making Mercedes headlight");
        return new MercedesHeadlight();
    }

    @Override
    public Tire makeTire() {
        System.out.println("Making Mercedes tire");
        return new MercedesTire();
    }
}

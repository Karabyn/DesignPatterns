package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */
public interface Factory {

    public Headlight makeHeadlight();

    public Tire makeTire();

}

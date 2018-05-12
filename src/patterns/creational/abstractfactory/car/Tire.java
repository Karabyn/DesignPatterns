package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */
public abstract class Tire {

    protected final String tireModel;

    public Tire(String tireModel) {
        this.tireModel = tireModel;
    }

    public String getTireModel() {
        return tireModel;
    }

}

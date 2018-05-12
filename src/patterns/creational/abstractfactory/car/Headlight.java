package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */

public abstract class Headlight {

    protected final String headLightModel;

    public Headlight(String headLightModel)
    {
        this.headLightModel = headLightModel;
    }

    public String getHeadLightModel()
    {
        return headLightModel;
    }
}

package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */
public class FactoryMaker
{
    public static Factory getFactory(String factoryName)
    {
        if (factoryName.equals("audi"))
            return new AudiFactory();
        else if(factoryName.equals("mercedes"))
            return new MercedesFactory();
        else
            return null;
    }
}

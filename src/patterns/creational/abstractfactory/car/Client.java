package patterns.creational.abstractfactory.car;

/**
 * Created by petro on 30-Sep-17.
 */

public class Client
{
    public void doSomeClientJob() {

        Factory factory = FactoryMaker.getFactory("audi");

        Tire tire = factory.makeTire();
        System.out.println("tire.getTireModel(): " + tire.getTireModel());

        Headlight light = factory.makeHeadlight();
        System.out.println("light.getHeadLightModel(): " + light.getHeadLightModel());

        factory = FactoryMaker.getFactory("mercedes");
        Tire tire2 = factory.makeTire();
        System.out.println("tire.getTireModel(): " + tire2.getTireModel());
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.doSomeClientJob();
    }
}

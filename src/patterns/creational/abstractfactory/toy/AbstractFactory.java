package patterns.creational.abstractfactory.toy;

/**
 * Created by petro on 04-Jul-17.
 */
public class AbstractFactory {

    public static void main(String[] args) {
        IToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.GetBear();
        Cat cat = toyFactory.GetCat();
        System.out.printf("I've got %s and %s", bear.name, cat.name);
    }
}

abstract class AnimalToy{

    public String name;

    protected AnimalToy(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}

abstract class Cat extends AnimalToy {
    protected Cat(String name){
        super(name);
    }
}

abstract class Bear extends AnimalToy {
    protected Bear(String name){
        super(name);
    }
}

class WoodenCat extends Cat {
    public WoodenCat() {
        super("Wooden Cat");
    }
}
class TeddyCat extends Cat {
    public TeddyCat() {
        super("Teddy Cat");
    }
}

class WoodenBear extends Bear{
            public WoodenBear(){
                super("Wooden Bear");
            }
        }

class TeddyBear extends Bear {
        public TeddyBear() {
            super("Teddy Bear");
        }
}


interface IToyFactory  {
    Bear GetBear();
    Cat GetCat();
}

// concrete factory
class TeddyToysFactory implements IToyFactory {

    public Bear GetBear() {
        return new TeddyBear();
    }
    public Cat GetCat() {
        return new TeddyCat();
    }
}

// concrete factory
 class WoodenToysFactory implements IToyFactory {

    public Bear GetBear() {
        return new WoodenBear();
    }

    public Cat GetCat() {
        return new WoodenCat();
    }
}



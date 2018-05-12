package patterns.creational.factory.warrior;
//FACTORY
/**
 * Created by petro on 04-Jul-17.
 */
abstract class Warrior {
    abstract void info();

    public static void main(String[] args) {
        Warrior warrior = Warrior.сreateWarrior(Warrior_ID.Infantryman_ID);
        warrior.info();
    }

    static Warrior сreateWarrior(Warrior_ID id )  {
        Warrior p = null;
        switch (id) {
            case Infantryman_ID:
                p = new Infantryman();
                break;
            case Archer_ID:
                p = new Archer();
                break;
            case Horseman_ID:
                p = new Horseman();
                break;
            default:
                assert( false);
        }
        return p;
    }
}

class Infantryman extends Warrior {
    void info() {
        System.out.println("Infantryman");
    }
}

class Archer extends Warrior {

    void info() {
        System.out.println("Archer");
    }
}

class Horseman extends Warrior {
    void info() {
        System.out.println("Horseman");
    }
}
package patterns.behavioral.mediator;

//concrete command
public class TurnOnAllLightsCommand implements Command {

    // instance of Mediator instead of an instance of objects
    // it is trying to call(Light)
    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}

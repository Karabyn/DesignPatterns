package patterns.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {

    //handles compounding of commands
    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
